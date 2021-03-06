package com.bms.model;

import java.time.LocalDateTime;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

public class LocalDateTimeToStringTypeConverter implements DynamoDBTypeConverter<String, LocalDateTime> {

	@Override
	public String convert(LocalDateTime localDateTime) {
		return localDateTime.toString();
	}

	@Override
	public LocalDateTime unconvert(String object) {
		return LocalDateTime.parse(object);
	}

}
