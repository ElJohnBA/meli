/**
 * © 2007-2021 Fidelity National Information Services, Inc.
 * and/or its subsidiaries - All Rights Reserved worldwide.
 * This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its subsidiaries.
 * Copying, reproduction or distribution should be limited and only to
 * employees with a “need to know” to do their job.
 * Any disclosure of this document to third parties is strictly prohibited.
 */

package com.meli.mutant.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException{

    private Error error;

    private HttpStatus httpStatus;

    public ServiceException(Error error, HttpStatus httpStatus) {
        this.error = error;
        this.httpStatus = httpStatus;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}