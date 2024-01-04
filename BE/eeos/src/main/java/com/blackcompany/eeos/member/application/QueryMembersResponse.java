package com.blackcompany.eeos.member.application;

import com.blackcompany.eeos.common.support.dto.AbstractResponseDto;
import com.blackcompany.eeos.member.application.dto.QueryMemberResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class QueryMembersResponse implements AbstractResponseDto {
	private List<QueryMemberResponse> members;
}
