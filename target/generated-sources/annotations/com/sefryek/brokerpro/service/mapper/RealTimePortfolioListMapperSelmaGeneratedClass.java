// GENERATED BY S3LM4
package com.sefryek.brokerpro.service.mapper;


@org.springframework.stereotype.Service("")
public final class RealTimePortfolioListMapperSelmaGeneratedClass
    implements RealTimePortfolioListMapper {

  @Override
  public final java.util.List<com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList> as(java.util.List<com.sefryek.brokerpro.tadbir.dto.response.mobile.portfolio.stock.PortfoliosTadbir> in) {
    java.util.List<com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList> out = null;
    if (in != null) {
      java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList> aoutTmpCollection = new java.util.ArrayList<com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList>(in.size());
      for (com.sefryek.brokerpro.tadbir.dto.response.mobile.portfolio.stock.PortfoliosTadbir aoutItem : in) {
        aoutTmpCollection.add(asRealTimePortfolioList(aoutItem));
      }
      out = aoutTmpCollection;
    }
    return out;
  }

  public final com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList asRealTimePortfolioList(com.sefryek.brokerpro.tadbir.dto.response.mobile.portfolio.stock.PortfoliosTadbir in) {
    com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList out = null;
    if (in != null) {
      out = new com.sefryek.brokerpro.dto.response.mobile.portfolio.RealTimePortfolioList();
      if (in.getDateTime() != null) {
        out.setDateTime(new java.util.Date(in.getDateTime().getTime()));
      }
      else {
        out.setDateTime(null);
      }
      out.setRemainQuantity(in.getRemainQuantity());
      out.setSoldCount(in.getSoldCount());
      out.setSoldValueOfIncome(in.getSoldValueOfIncome());
      out.setSymbolISIN(in.getSymbolISIN());
      out.setTotalBuyAverage(in.getTotalBuyAverage());
      out.setTotalCostBuy(in.getTotalCostBuy());
      out.setTotalSold(in.getTotalSold());
    }
    return out;
  }



  /**
   * Single constructor
   */
  public RealTimePortfolioListMapperSelmaGeneratedClass() {
  }

}