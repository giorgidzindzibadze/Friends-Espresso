package com.atiurin.ultron.core.uiautomator

import com.atiurin.ultron.core.common.OperationType

enum class UiAutomatorAssertionType :
    OperationType {
    IS_DISPLAYED, IS_NOT_DISPLAYED, IS_COMPLETELY_DISPLAYED, IS_DISPLAYING_AT_LEAST,
    IS_ENABLED, IS_NOT_ENABLED,
    IS_SELECTED, IS_NOT_SELECTED,
    IS_CLICKABLE, IS_NOT_CLICKABLE,
    IS_CHECKED, IS_NOT_CHECKED,
    IS_FOCUSABLE, IS_NOT_FOCUSABLE, HAS_FOCUS,
    IS_JS_ENABLED,
    HAS_TEXT, CONTAINS_TEXT,
    HAS_CONTENT_DESCRIPTION, CONTENT_DESCRIPTION_CONTAINS_TEXT,
    ASSERT_MATCHES, EXISTS
}