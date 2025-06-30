package com.aic.base.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.web.servlet.HandlerInterceptor;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {
	
    private String secretKey = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";
	
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		String authHeader = request.getHeader("Authorization");

//		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			String token = authHeader.substring(7);
        String tokenType = decodeTokenType(token);
        if (!"THIRD".equals(tokenType)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Jwt Token Invalid");
            return false;
        }
        return true;
    }

	private String decodeTokenType(String token) {
		  try {
//	            Key key = Keys.hmacShaKeyFor(secretKey);
	            Claims claims = Jwts.parserBuilder()
	                    .setSigningKey(secretKey)
	                    .build()
	                    .parseClaimsJws(token)
	                    .getBody();
	            return claims.get("type", String.class); // Get the "tokenType" claim
	        } catch (JwtException e) {
	            // Log the exception or handle it as needed
	            return null;
	        }
	}
}