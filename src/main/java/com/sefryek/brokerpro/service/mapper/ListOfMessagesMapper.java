package com.sefryek.brokerpro.service.mapper;

import com.sefryek.brokerpro.dto.response.market.message.ListOfMessage;
import com.sefryek.brokerpro.tadbir.dto.response.market.message.list.ListOfMessageTadbir;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

/**
 * Copyright 2016 (C) sefryek.com
 *
 * @author: Amin Malekpour
 * @email: amin.malekpour@hotmail.com
 * @date: 09, Jan, 2017
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL)
public interface ListOfMessagesMapper extends SelmaObjectMapper<List<ListOfMessageTadbir>, List<ListOfMessage>> {
}
