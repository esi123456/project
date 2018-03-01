// GENERATED BY S3LM4
package com.sefryek.brokerpro.service.mapper;


@org.springframework.stereotype.Service("")
public final class PaymentDayMapperSelmaGeneratedClass
    implements PaymentDayMapper {

  @Override
  public final com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalDay as(com.sefryek.brokerpro.tadbir.dto.response.mobile.payment.PaymentDayTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalDay out = null;
    if (in != null) {
      out = new com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalDay();
      out.setAmount(in.getAmount());
      if (in.getDate() != null) {
        out.setDate(new java.util.Date(in.getDate().getTime()));
      }
      else {
        out.setDate(null);
      }
    }
    return out;
  }



  /**
   * Single constructor
   */
  public PaymentDayMapperSelmaGeneratedClass() {
  }

}
