package com.directv.afe.email.api.request;

import com.directv.afe.email.api.Email;
import com.directv.email.computec.DatoConsultaDTO;
import com.directv.email.computec.EnviarDocumentoResponse;

public class ColombiaEmailBuilder extends EmailBuilder<EnviarDocumentoResponse> {

	@Override
	public Object createRequest(Email email) {
		DatoConsultaDTO dto = new DatoConsultaDTO();
		
		dto.setEmail(email.getDestination());
		dto.setPlantilla(email.getTemplate());
		
		return dto;
	}

}
