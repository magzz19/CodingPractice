package com.accenture.bars.exception;

public class BarsException extends Exception{

    public static final String INVALID_START_DATE_FORMAT = "ERROR: Invalid Start Date format at row";
    public static final String INVALID_END_DATE_FORMAT = "ERROR: Invalid End Date format at row";
    public static final String INVALID_BILLING_CYCLE = "ERROR: Invalid Billing Cycle value at row";
    public static final String BILLING_CYCLE_NOT_ON_RANGE = "ERROR: Billing Cycle not on range at row";
    public static final String PATH_DOES_NOT_EXIST = "Please input an existing request file path.";
    public static final String NO_SUPPORTED_FILE = "No supported request file found in the file path.";
    public static final String FILE_NOT_SUPPORTED = "File is not supported for processing";
    public static final String NO_REQUEST_TO_READ = "No request(s) to read from the input file.";
    public static final String NO_RECORD_TO_WRITE = "No request(s) to write to the output file.";










}
