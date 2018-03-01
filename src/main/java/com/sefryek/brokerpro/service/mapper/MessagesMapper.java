package com.sefryek.brokerpro.service.mapper;

import com.sefryek.brokerpro.dto.response.mobile.message.Message;
import com.sefryek.brokerpro.tadbir.dto.response.mobile.message.MessageTadbir;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

/**
 * Copyright 2016 (C) sefryek.com
 *
 * @author: Amin Malekpour
 * @email: amin.malekpour@hotmail.com
 * @date: 11, Mar, 2017
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL)
public interface MessagesMapper extends SelmaObjectMapper<List<MessageTadbir>, List<Message>> {
}
