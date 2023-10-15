package com.blackcompany.eeos.program.application.model.converter;

import com.blackcompany.eeos.common.support.converter.AbstractDtoConverter;
import com.blackcompany.eeos.program.application.domain.ProgramModel;
import com.blackcompany.eeos.program.application.dto.AbstractProgramRequest;
import org.springframework.stereotype.Component;

@Component
public class ProgramRequestConverter
		implements AbstractDtoConverter<AbstractProgramRequest, ProgramModel> {

	@Override
	public ProgramModel from(AbstractProgramRequest source) {
		return ProgramModel.builder()
				.title(source.getTitle())
				.content(source.getContent())
				.programDate(Long.valueOf(source.getProgramDate()))
				.build();
	}
}