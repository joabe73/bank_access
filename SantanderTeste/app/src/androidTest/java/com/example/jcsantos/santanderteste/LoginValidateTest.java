package com.example.jcsantos.santanderteste;

import android.support.test.runner.AndroidJUnit4;

import com.example.jcsantos.santanderteste.Components.Utils.ItemsValidate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LoginValidateTest {

    @Test
    public void validateCpf() {
        ItemsValidate validate = new ItemsValidate();
        String cpf = "576.439.458-96";
        boolean cpfOk = validate.isValid(cpf);
        if (cpfOk) {
            System.out.println("teste CPF válido 100%" + cpf);
        } else {
            System.out.println("teste CPF erro inválido!" + cpf);
        }
        Assert.assertTrue(cpfOk);
    }

    @Test
    public void validateEmail() {
        ItemsValidate validate = new ItemsValidate();
        String email = "teste@hotmail.com";
        boolean emailOk = validate.isValid(email);
        Assert.assertTrue(emailOk);
        if (emailOk) {
            System.out.println("teste EMAIL válido 100%" + email);
        } else {
            System.out.println("teste EMAIL inválido" + email);
        }
    }

    @Test
    public void validatePassword() {
        ItemsValidate validate = new ItemsValidate();
        String pass = "Text@1";
        boolean cpfOk = validate.checkPassword(pass);
        Assert.assertTrue(cpfOk);
        if (cpfOk) {
            System.out.println("teste SENHA válida 100%");
        } else {
            System.out.println("teste SENHA inválida!");
        }
    }
}
