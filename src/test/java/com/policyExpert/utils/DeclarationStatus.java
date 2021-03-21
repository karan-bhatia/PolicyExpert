package com.policyExpert.utils;

import cucumber.api.Scenario;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

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
    private Scenario scenario = new Scenario() {
        @Override
        public Collection<String> getSourceTagNames() {
            return null;
        }

        @Override
        public String getStatus() {
            return null;
        }

        @Override
        public boolean isFailed() {
            return false;
        }

        @Override
        public void embed(byte[] bytes, String s) {

        }

        @Override
        public void write(String s) {

        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getId() {
            return null;
        }
    };

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
