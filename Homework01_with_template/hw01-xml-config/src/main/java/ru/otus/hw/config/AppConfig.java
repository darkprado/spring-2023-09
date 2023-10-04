package ru.otus.hw.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AppConfig implements ConfigProvider {

    private String testFileName;
    private String exceptionMessage;
    private Integer skipNumber;
    private Character delimiter;
    private String questionField;
    private String answersField;

    @Override
    public String getTestFileName() {
        return testFileName;
    }

    @Override
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    @Override
    public Integer getSkipNumber() {
        return skipNumber;
    }

    @Override
    public Character getDelimiter() {
        return delimiter;
    }

    @Override
    public String getQuestionField() {
        return questionField;
    }

    @Override
    public String getAnswersField() {
        return answersField;
    }
}