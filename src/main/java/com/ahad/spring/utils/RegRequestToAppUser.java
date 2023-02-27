package com.ahad.spring.utils;

import com.ahad.spring.appuser.AppUser;
import com.ahad.spring.appuser.AppUserRole;
import com.ahad.spring.registration.RegistrationRequest;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class RegRequestToAppUser implements Function<RegistrationRequest, AppUser> {

    @Override
    public AppUser apply(RegistrationRequest rr) {
        return new AppUser(
                rr.getFirstName(),
                rr.getLastName(),
                rr.getEmail(),
                rr.getPassword(),
                AppUserRole.USER

        );
    }
}
