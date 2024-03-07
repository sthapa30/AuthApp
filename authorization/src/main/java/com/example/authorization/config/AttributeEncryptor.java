package com.example.authorization.config;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Converter
public class AttributeEncryptor implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String s) {
        return new BCryptPasswordEncoder().encode(s);
    }

    @Override
    public String convertToEntityAttribute(String s) {
        return s;
    }
}
