// GENERATED BY S3LM4
package com.sefryek.brokerpro.service.mapper;


@org.springframework.stereotype.Service("")
public final class InstantDepositTokenMapperSelmaGeneratedClass
    implements InstantDepositTokenMapper {

  @Override
  public final com.sefryek.brokerpro.dto.response.mobile.peyment.InstantDepositToken as(com.sefryek.brokerpro.tadbir.dto.response.mobile.payment.MoneyTransferTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.peyment.InstantDepositToken out = null;
    if (in != null) {
      out = new com.sefryek.brokerpro.dto.response.mobile.peyment.InstantDepositToken();
      out.setInstantDepositId(in.getInstantDepositId());
      out.setRequestPage(in.getRequestPage());
      out.setToken(in.getToken());
    }
    return out;
  }



  /**
   * Single constructor
   */
  public InstantDepositTokenMapperSelmaGeneratedClass() {
  }

}
