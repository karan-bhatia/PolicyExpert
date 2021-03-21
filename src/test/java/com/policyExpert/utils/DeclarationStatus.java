package com.policyExpert.utils;

import lombok.Getter;
import lombok.Setter;

public class DeclarationStatus {

    private static DeclarationStatus instance;

    protected DeclarationStatus() {
    }
    public static DeclarationStatus getInstance() {
        if (instance == null) {
            instance = new DeclarationStatus();
        }
        return instance;
    }

    @Setter
    @Getter
    private String statementStatus;

    @Setter
    @Getter
    private String businessPurposeStatus;

    @Setter
    @Getter
    private String bankruptStatus;

    @Setter
    @Getter
    private String courtJudgementStatus;
}
