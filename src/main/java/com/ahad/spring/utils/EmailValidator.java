package com.ahad.spring.utils;

import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Function<String,Boolean> {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    public Boolean apply(String email) {
        return VALID_EMAIL_ADDRESS_REGEX.matcher(email).matches();
    }
}
