// GENERATED BY S3LM4
package com.sefryek.brokerpro.service.mapper;


@org.springframework.stereotype.Service("")
public final class ConditionalAlertListMapperSelmaGeneratedClass
    implements ConditionalAlertListMapper {

  @Override
  public final java.util.List<com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList> as(java.util.List<com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.ConditionalAlertTadbir> in) {
    java.util.List<com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList> out = null;
    if (in != null) {
      java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList> aoutTmpCollection = new java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList>(in.size());
      for (com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.ConditionalAlertTadbir aoutItem : in) {
        aoutTmpCollection.add(asConditionalAlertList(aoutItem));
      }
      out = aoutTmpCollection;
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList asConditionalAlertList(com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.ConditionalAlertTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList out = null;
    if (in != null) {
      out = new com.sefryek.brokerpro.dto.response.mobile.alert.ConditionalAlertList();
      out.setAlertTitle(in.getAlertTitle());
      out.setAlertTypes(asAlertTypes(in.getAlertTypes()));
      out.setCanDelete(in.getCanDelete());
      if (in.getCoEndDate() != null) {
        out.setCoEndDate(new java.util.Date(in.getCoEndDate().getTime()));
      }
      else {
        out.setCoEndDate(null);
      }
      out.setConditionalAlertId(in.getConditionalAlertId());
      if (in.getConditionsData() != null) {
        java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.alert.ConditionsData> aconditionsdataTmpCollection = new java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.alert.ConditionsData>(in.getConditionsData().size());
        for (com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.ConditionsDataTadbir aconditionsdataItem : in.getConditionsData()) {
          aconditionsdataTmpCollection.add(asConditionsData(aconditionsdataItem));
        }
        out.setConditionsData(aconditionsdataTmpCollection);
      }
      else {
        out.setConditionsData(null);
      }
      if (in.getCoStartDate() != null) {
        out.setCoStartDate(new java.util.Date(in.getCoStartDate().getTime()));
      }
      else {
        out.setCoStartDate(null);
      }
      out.setEmail(in.getEmail());
      out.setLastState(asConditionalOrderActionType(in.getLastState()));
      if (in.getLastStateDate() != null) {
        out.setLastStateDate(new java.util.Date(in.getLastStateDate().getTime()));
      }
      else {
        out.setLastStateDate(null);
      }
      out.setMobile(in.getMobile());
      out.setoMSExceptionriginalOrderId(in.getOMSExceptionriginalOrderId());
      out.setoMSOrderId(in.getOMSOrderId());
      out.setOriginalOrderId(in.getOriginalOrderId());
      out.setShowAlertMessage(in.getShowAlertMessage());
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType asConditionalOrderActionType(com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.enumeration.ConditionalOrderActionTypeTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType out = null;
    if (in != null) {
      switch (in) {
        case CONDITION_MATCHING :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.CONDITION_MATCHING;
          break;
        }
        case SEND_TO_OMS_START :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.SEND_TO_OMS_START;
          break;
        }
        case ADDED_TO_DATABASE :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.ADDED_TO_DATABASE;
          break;
        }
        case EDITED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.EDITED;
          break;
        }
        case SEND_TO_OMS_FINISHED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.SEND_TO_OMS_FINISHED;
          break;
        }
        case EXPIRED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.EXPIRED;
          break;
        }
        case DELETED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.DELETED;
          break;
        }
        case SEND_TO_OMS_FAILED :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.SEND_TO_OMS_FAILED;
          break;
        }
        case INITIAL_CONDITION_MATCHING :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.ConditionalOrderActionType.INITIAL_CONDITION_MATCHING;
          break;
        }
      }
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.alert.ConditionsData asConditionsData(com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.ConditionsDataTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.alert.ConditionsData out = null;
    if (in != null) {
      out = new com.sefryek.brokerpro.dto.response.mobile.alert.ConditionsData();
      out.setEquality(in.getEquality());
      out.setNscCode(in.getNscCode());
      out.setSymbol(in.getSymbol());
      out.setSymbolTitle(in.getSymbolTitle());
      out.setTypeTitle(in.getTypeTitle());
      out.setValue(in.getValue());
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.AlertTypes asAlertTypes(com.sefryek.brokerpro.tadbir.dto.response.mobile.alert.enumeration.AlertTypesTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.AlertTypes out = null;
    if (in != null) {
      switch (in) {
        case EMAIL :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.AlertTypes.EMAIL;
          break;
        }
        case SMS :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.AlertTypes.SMS;
          break;
        }
        case WEB_NOTIFICATION :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.AlertTypes.WEB_NOTIFICATION;
          break;
        }
        case MOBILE_NOTIFICATION :  {
          out = com.sefryek.brokerpro.dto.response.mobile.alert.enumeration.AlertTypes.MOBILE_NOTIFICATION;
          break;
        }
      }
    }
    return out;
  }



  /**
   * Single constructor
   */
  public ConditionalAlertListMapperSelmaGeneratedClass() {
  }

}
