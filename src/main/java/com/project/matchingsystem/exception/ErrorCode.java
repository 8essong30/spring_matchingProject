package com.project.matchingsystem.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    INVALID_AUTH_TOKEN("권한 정보가 없는 토큰입니다"),
    INVALID_TOKEN("토큰이 유효하지 않습니다."),
    AUTHORIZATION("판매자만 수정/삭제할 수 있습니다."),
    DUPLICATED_USERNAME("중복된 username 입니다"),
    DUPLICATED_NICKNAME("중복된 nickname 입니다"),
    NOT_FOUND_USER("회원을 찾을 수 없습니다."),
    INVALID_PASSWORD("비밀번호가 틀렸습니다."),

    EMPTY_FILE("파일이 없습니다."),
    NOT_IMAGE_FILE("이미지 파일이 아닙니다."),
    NOT_FOUND_ITEM("상품을 찾을 수 없습니다."),
    NOT_FOUND_TRANSACTION("거래를 찾을 수 없습니다."),
    NOT_EXIST_CATEGORY("카테고리가 존재하지 않습니다."),
    DUPLICATED_CATEGORY("중복된 카테고리 입니다"),
    NOT_FIND_REQUEST("요청내용을 찾을 수 없습니다."),

    AREADY_SELLERMAGEMENT_STATUS_DROP("판매자 권한 회수 상태로 처리가 불가능합니다."),
    AREADY_SELLERMAGEMENT_STATUS_COMPLETE("판매자 권한 승인 상태로 처리가 불가능합니다."),
    AREADY_SELLERMAGEMENT_STATUS_REJECT("판매자 승인 취소 상태로 처리가 불가능합니다. 다시 권한 신청해주세요"),
    AREADY_SELLERMAGEMENT_STATUS_WAIT("판매자 신청 대기 상태입니다."),
    NOT_SELLERMAGEMENT_STATUS_WAIT("판매자 대기 상태가 아니므로 처리 불가능합니다.");

    private final String message;

}
