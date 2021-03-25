package com.policyExpert.utils;

import cucumber.api.Scenario;
import lombok.Getter;
import lombok.Setter;

public class DeclarationStatus {

    private static DeclarationStatus instance;
    @Setter
    @Getter
    private String statementStatus = "";

    @Setter
    @Getter
    private String businessPurposeStatus = "";

    @Setter
    @Getter
    private String businessType = "";

    @Setter
    @Getter
    private Scenario scenario;

    protected DeclarationStatus() {
    }

    public static DeclarationStatus getInstance() {
        if (instance == null) {
            instance = new DeclarationStatus();
        }
        return instance;
    }

    public DeclarationStatus newDeclarationStatus() {
        instance = new DeclarationStatus();
        return instance;
    }
}
