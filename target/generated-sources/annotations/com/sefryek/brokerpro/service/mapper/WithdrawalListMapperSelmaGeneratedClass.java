// GENERATED BY S3LM4
package com.sefryek.brokerpro.service.mapper;


@org.springframework.stereotype.Service("")
public final class WithdrawalListMapperSelmaGeneratedClass
    implements WithdrawalListMapper {

  @Override
  public final java.util.List<com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList> as(java.util.List<com.sefryek.brokerpro.tadbir.dto.response.mobile.payment.PaymentRequestTadbir> in) {
    java.util.List<com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList> out = null;
    if (in != null) {
      java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList> aoutTmpCollection = new java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList>(in.size());
      for (com.sefryek.brokerpro.tadbir.dto.response.mobile.payment.PaymentRequestTadbir aoutItem : in) {
        aoutTmpCollection.add(asWithdrawalList(aoutItem));
      }
      out = aoutTmpCollection;
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList asWithdrawalList(com.sefryek.brokerpro.tadbir.dto.response.mobile.payment.PaymentRequestTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList out = null;
    if (in != null) {
      out = new com.sefryek.brokerpro.dto.response.mobile.peyment.WithdrawalList();
      out.setAccountNumber(in.getAccountNumber());
      out.setBrokerMessage(in.getBrokerMessage());
      out.setDueAmount(in.getDueAmount());
      if (in.getRequestDate() != null) {
        out.setRequestDate(new java.util.Date(in.getRequestDate().getTime()));
      }
      else {
        out.setRequestDate(null);
      }
      out.setRequestedAmount(in.getRequestedAmount());
      out.setRequestedId(in.getRequestedId());
      if (in.getRequestForDate() != null) {
        out.setRequestForDate(new java.util.Date(in.getRequestForDate().getTime()));
      }
      else {
        out.setRequestForDate(null);
      }
      out.setState(asWithdrawalState(in.getState()));
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState asWithdrawalState(com.sefryek.brokerpro.tadbir.dto.response.mobile.payment.enumeration.PaymentStateTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState out = null;
    if (in != null) {
      switch (in) {
        case NONE :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.NONE;
          break;
        }
        case ALL :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.ALL;
          break;
        }
        case CANCELED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.CANCELED;
          break;
        }
        case RECEIVED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.RECEIVED;
          break;
        }
        case PAID :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.PAID;
          break;
        }
        case BEING_PROCESSED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.BEING_PROCESSED;
          break;
        }
        case NOT_SET :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.NOT_SET;
          break;
        }
        case REQUEST_CANCEL :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.REQUEST_CANCEL;
          break;
        }
        case BEING_PROCESSED_BY_OTHER :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.BEING_PROCESSED_BY_OTHER;
          break;
        }
        case TROUBLE_SHOOTING :  {
          out = com.sefryek.brokerpro.dto.response.mobile.peyment.enumeration.WithdrawalState.TROUBLE_SHOOTING;
          break;
        }
      }
    }
    return out;
  }



  /**
   * Single constructor
   */
  public WithdrawalListMapperSelmaGeneratedClass() {
  }

}
