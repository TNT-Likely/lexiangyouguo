drop table if exists AccessPurchaseRate;

drop table if exists AdministratorList;

drop table if exists ArticalList;

drop table if exists ArticleClassification;

drop table if exists CartTable;

drop table if exists CommodityClassification;

drop table if exists CommodityCommentsList;

drop table if exists CommodityList;

drop table if exists CustomerStatistics;

drop table if exists DailySpecials;

drop table if exists DisplayType;

drop table if exists EmailServer;

drop table if exists GiftTable;

drop table if exists GiftTableContents;

drop table if exists HarvestAddressTable;

drop table if exists HolidaySpecialArea;

drop table if exists Link;

drop table if exists MemberCollectionTable;

drop table if exists MemberList;

drop table if exists MemberRegistrationItems;

drop table if exists OccasionTable;

drop table if exists OrderContentList;

drop table if exists OrderList;

drop table if exists OrderState;

drop table if exists OrderStatistics;

drop table if exists PreferentialType;

drop table if exists PromotionalOffersTable;

drop table if exists RegionLevelTable;

drop table if exists RegionList;

drop table if exists RoleManagement;

drop table if exists ShopInformation;

drop table if exists StoreSettings;

drop table if exists TypeTable;

drop table if exists parents;

/*==============================================================*/
/* Table: AccessPurchaseRate                                    */
/*==============================================================*/
create table AccessPurchaseRate
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   APR_Ranking          int not null,
   GoodsId              int not null,
   APR_SentimentIndex   int,
   APR_VisitsNumber     int,
   APR_VisitsPurchaseRate float,
   primary key (Id)
);

/*==============================================================*/
/* Table: AdministratorList                                     */
/*==============================================================*/
create table AdministratorList
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   AdministratoName     varchar(1024) not null,
   Password             varchar(1024) not null,
   AdministratoSex      char(2),
   AdministratoAddress  varchar(1024),
   AddTime               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   AdministratoastLoginTime  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   primary key (Id)
);

/*==============================================================*/
/* Table: ArticalList                                           */
/*==============================================================*/
create table ArticalList
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   Number               int,
   ArticaTitle          varchar(1024),
   ArticaClassification varchar(1024),
   ArticalImportant     varchar(1024),
   WhetherShown         bool,
   AddTime               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   primary key (Id)
);

/*==============================================================*/
/* Table: ArticleClassification                                 */
/*==============================================================*/
create table ArticleClassification
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   ArticleClass_Name    varchar(1024) not null,
   ArticleClass_Style   varchar(1024),
   ArticleClass_Descripetion varchar(1024),
   ArticleClass_WhetherNavigationBarDisplay varchar(1024),
   ArticleClass_Sorting char(10),
   primary key (Id)
);

/*==============================================================*/
/* Table: CartTable                                             */
/*==============================================================*/
create table CartTable
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   MemberId             int,
   GoodsId              int,
   primary key (Id)
);

/*==============================================================*/
/* Table: CommodityClassification                               */
/*==============================================================*/
create table CommodityClassification
(
   Id                   int not null,
   Com_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   ClassificationName   varchar(1024) not null,
   ClassificationDiscript varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: CommodityCommentsList                                 */
/*==============================================================*/
create table CommodityCommentsList
(
   Id                   int not null,
   Com_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   CommodityCom_Type    varchar(1024),
   CommodityCom_Content varchar(1024),
   MemberId             int,
   CommodityCom_DescriptionConsistent int,
   CommodityCom_deliverySpeed int,
   CommodityCom_LogisticsSpeed int,
   CommodityCom_CourierServiceAttitude int,
   primary key (Id)
);

/*==============================================================*/
/* Table: CommodityList                                         */
/*==============================================================*/
create table CommodityList
(
   Id                   int not null,
   Gif_Id               int,
   Car_Id               int,
   Ord_Id               int,
   Mem_Id               int,
   Acc_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   CommodityNumber      varchar(1024) not null,
   CommodityItemNamber  varchar(1024) not null,
   CommodityShelves     varchar(1024),
   CommodityInventory   int,
   CommodityKindNumber  int,
   CommodityQuantity    int,
   CommodityDisplay     varchar(1024),
   CommodityCollectionNumber int,
   CommodityCommentsId  int,
   CommodityName        varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: CustomerStatistics                                    */
/*==============================================================*/
create table CustomerStatistics
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   CS_MembersPurchaseRate float not null,
   CS_MembersAverageOrder double,
   CS_MembersAveragePurchases double,
   primary key (Id)
);

/*==============================================================*/
/* Table: DailySpecials                                         */
/*==============================================================*/
create table DailySpecials
(
   Id                   int not null,
   Pro_Id               int not null,
   GoodsId              int,
   PreferentialTypeId   int,
   PreferentialDiscount float,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   primary key (Id, Pro_Id)
);

/*==============================================================*/
/* Table: DisplayType                                           */
/*==============================================================*/
create table DisplayType
(
   Id                   int not null,
   Lin_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   Display_LogoType     varchar(1024),
   Display_TextType     varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: EmailServer                                           */
/*==============================================================*/
create table EmailServer
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   ES_EmailServer       varchar(1024),
   ES_SendMailService   varchar(1024),
   ES_Account           varchar(1024),
   Password             varchar(1024),
   ES_ReplyEmaiAddressl varchar(1024),
   ES_EmailAddress      varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: GiftTable                                             */
/*==============================================================*/
create table GiftTable
(
   Id                   int not null,
   Gif_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   GiftName             varchar(1024) not null,
   OccasionId           int,
   TypeId               int,
   primary key (Id)
);

/*==============================================================*/
/* Table: GiftTableContents                                     */
/*==============================================================*/
create table GiftTableContents
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   GoodsId              int,
   GiftId               char(10),
   primary key (Id)
);

/*==============================================================*/
/* Table: HarvestAddressTable                                   */
/*==============================================================*/
create table HarvestAddressTable
(
   Id                   int not null,
   Ord_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   HA_TheFirstAddress   varchar(1024),
   HA_TheSecondAddress  varchar(1024),
   HA_TheThirdAddress   varchar(1024),
   HA_TheFourthAddress  varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: HolidaySpecialArea                                    */
/*==============================================================*/
create table HolidaySpecialArea
(
   Id                   int not null,
   Pro_Id               int not null,
   GoodsId              int,
   PreferentialTypeId   int,
   PreferentialDiscount float,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   HolidaySpeciaMeaning varchar(1024),
   primary key (Id, Pro_Id)
);

/*==============================================================*/
/* Table: Link                                                  */
/*==============================================================*/
create table Link
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   LinkName             varchar(1024) not null,
   LinkAddress          varchar(1024),
   LinkSorting          int,
   DisplayTypeId        int,
   primary key (Id)
);

/*==============================================================*/
/* Table: MemberCollectionTable                                 */
/*==============================================================*/
create table MemberCollectionTable
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   MemberId             int not null,
   GoodsId              int not null,
   primary key (Id)
);

/*==============================================================*/
/* Table: MemberList                                            */
/*==============================================================*/
create table MemberList
(
   Id                   int not null,
   Car_Id               int,
   Mem_Id               int,
   Ord_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   Number               int not null,
   Email                varchar(1024),
   MemberWhetherAuthenticate bool,
   MemberRegisteredTime  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   MemberCurrentPicture varchar(1024),
   MemberName           varchar(1024),
   Password             varchar(1024),
   MemberRealName       varchar(1024),
   MemberSex            bool,
   MemberBirthday        timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   MemberResidentialAddress varchar(1024),
   MemberHomeTown       varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: MemberRegistrationItems                               */
/*==============================================================*/
create table MemberRegistrationItems
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   MRI_Name             varchar(1024),
   MRI_WeightsSorting   varchar(1024),
   WhetherShown         bool,
   MRI_WhetherRequired  bool,
   primary key (Id)
);

/*==============================================================*/
/* Table: OccasionTable                                         */
/*==============================================================*/
create table OccasionTable
(
   Id                   int not null,
   Gif_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   Occasion_VisitRelatives varchar(1024),
   Occasion_VisitFriends varchar(1024),
   Occasion_GiftGiving  varchar(1024),
   Occasion_VisitPatient varchar(1024),
   Occasion_CongratulationsToHospital varchar(1024),
   Occasion_FamilyOrder varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderContentList                                      */
/*==============================================================*/
create table OrderContentList
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   OrderId              int not null,
   GoodsId              int not null,
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderList                                             */
/*==============================================================*/
create table OrderList
(
   Id                   int not null,
   Ord_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   OrderNumber          int not null,
   OrderTime            timestamp not null,
   OrderTotalMoney      float not null,
   OrderAmountPayable   float not null,
   OrderState           varchar(1024) not null,
   OrderMembersId       int,
   OrderConsigneeAddressId int,
   OrderDescribe        varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderState                                            */
/*==============================================================*/
create table OrderState
(
   Id                   int not null,
   Ord_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   OS_NotDeliverGoods   varchar(1024),
   OS_Delivery          varchar(1024),
   OS_HaveToSignFor     varchar(1024),
   OS_RefusalReceive    varchar(1024),
   OS_ReturnOfGoods     varchar(1024),
   OS_RefundSuccess     varchar(1024),
   OS_Unconfirmed       varchar(1024),
   OS_OrderFinished     varchar(1024),
   OS_Payed             varchar(1024),
   OS_NotPaying         varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderStatistics                                       */
/*==============================================================*/
create table OrderStatistics
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   OS_GeneralSituation  varchar(1024) not null,
   OS_DistributionMethod varchar(1024),
   OS_PaymentMethod     varchar(1024),
   OS_EffectiveOrderAmount double,
   OS_ClickOrdersPerThousand double,
   OS_ClickMoneyPerThousand double,
   primary key (Id)
);

/*==============================================================*/
/* Table: PreferentialType                                      */
/*==============================================================*/
create table PreferentialType
(
   Id                   int not null,
   Pro_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   PreferentialPercentage float(8),
   PreferentialReducePrice int,
   PreferentialArrivalIntegral int,
   primary key (Id)
);

/*==============================================================*/
/* Table: PromotionalOffersTable                                */
/*==============================================================*/
create table PromotionalOffersTable
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   GoodsId              int,
   PreferentialTypeId   int,
   PreferentialDiscount float,
   primary key (Id)
);

/*==============================================================*/
/* Table: RegionLevelTable                                      */
/*==============================================================*/
create table RegionLevelTable
(
   Id                   int not null,
   Reg_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   RegionLevel_Province varchar(1024),
   RegionLevel_City     varchar(1024),
   RegionLevel_County   varchar(1024),
   RegionLevel_Town     varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: RegionList                                            */
/*==============================================================*/
create table RegionList
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   RegionName           varchar(1024),
   RegionLevelId        int,
   primary key (Id)
);

/*==============================================================*/
/* Table: RoleManagement                                        */
/*==============================================================*/
create table RoleManagement
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   RoleName             varchar(1024) not null,
   RoleDescription      varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: ShopInformation                                       */
/*==============================================================*/
create table ShopInformation
(
   Id                   int not null,
   Sto_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   ShopInfo_ShopName    varchar(1024) not null,
   ShopInfo_ShopLogo    varchar(1024),
   ShopInfo_StoreSlogan varchar(1024),
   ShopInfo_StoreCopyright varchar(1024),
   ShopInfo_StoreAuthoritativeAttestation varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: StoreSettings                                         */
/*==============================================================*/
create table StoreSettings
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   StoreSsttingsId      varchar(1024) not null,
   StoreBasicSetting    varchar(1024),
   StoreShoppingProcess varchar(1024),
   StoreCommodityDisplaySetting varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: TypeTable                                             */
/*==============================================================*/
create table TypeTable
(
   Id                   int not null,
   Gif_Id               int,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   Type_Recovery        varchar(1024),
   Type_ImproveResistance varchar(1024),
   Type_RorBrain        varchar(1024),
   Type_Beauty          varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: parents                                               */
/*==============================================================*/
create table parents
(
   Id                   int not null,
   TimeAdd               timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   TimeUpdate            timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   primary key (Id)
);

alter table AccessPurchaseRate add constraint FK_Inheritance_26 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table AdministratorList add constraint FK_Inheritance_24 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table ArticalList add constraint FK_Inheritance_14 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table ArticleClassification add constraint FK_Inheritance_28 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CartTable add constraint FK_Inheritance_41 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CommodityClassification add constraint FK_Inheritance_45 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CommodityClassification add constraint FK_Relationship_1 foreign key (Com_Id)
      references CommodityList (Id) on delete restrict on update restrict;

alter table CommodityCommentsList add constraint FK_Inheritance_31 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CommodityCommentsList add constraint FK_Relationship_3 foreign key (Com_Id)
      references CommodityList (Id) on delete restrict on update restrict;

alter table CommodityList add constraint FK_Inheritance_1 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CommodityList add constraint FK_Relationship_13 foreign key (Gif_Id)
      references GiftTableContents (Id) on delete restrict on update restrict;

alter table CommodityList add constraint FK_Relationship_17 foreign key (Ord_Id)
      references OrderContentList (Id) on delete restrict on update restrict;

alter table CommodityList add constraint FK_Relationship_19 foreign key (Car_Id)
      references CartTable (Id) on delete restrict on update restrict;

alter table CommodityList add constraint FK_Relationship_21 foreign key (Mem_Id)
      references MemberCollectionTable (Id) on delete restrict on update restrict;

alter table CommodityList add constraint FK_Relationship_8 foreign key (Acc_Id)
      references AccessPurchaseRate (Id) on delete restrict on update restrict;

alter table CustomerStatistics add constraint FK_Inheritance_6 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table DailySpecials add constraint FK_Inheritance_10 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table DailySpecials add constraint FK_Inheritance_34 foreign key (Pro_Id)
      references PromotionalOffersTable (Id) on delete restrict on update restrict;

alter table DisplayType add constraint FK_Inheritance_38 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table DisplayType add constraint FK_Relationship_15 foreign key (Lin_Id)
      references Link (Id) on delete restrict on update restrict;

alter table EmailServer add constraint FK_Inheritance_20 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table GiftTable add constraint FK_Inheritance_12 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table GiftTable add constraint FK_Relationship_12 foreign key (Gif_Id)
      references GiftTableContents (Id) on delete restrict on update restrict;

alter table GiftTableContents add constraint FK_Inheritance_42 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table HarvestAddressTable add constraint FK_Inheritance_30 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table HarvestAddressTable add constraint FK_Relationship_5 foreign key (Ord_Id)
      references OrderList (Id) on delete restrict on update restrict;

alter table HolidaySpecialArea add constraint FK_Inheritance_21 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table HolidaySpecialArea add constraint FK_Inheritance_35 foreign key (Pro_Id)
      references PromotionalOffersTable (Id) on delete restrict on update restrict;

alter table Link add constraint FK_Inheritance_25 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table MemberCollectionTable add constraint FK_Inheritance_32 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table MemberList add constraint FK_Inheritance_18 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table MemberList add constraint FK_Relationship_18 foreign key (Car_Id)
      references CartTable (Id) on delete restrict on update restrict;

alter table MemberList add constraint FK_Relationship_6 foreign key (Ord_Id)
      references OrderList (Id) on delete restrict on update restrict;

alter table MemberList add constraint FK_Relationship_7 foreign key (Mem_Id)
      references MemberCollectionTable (Id) on delete restrict on update restrict;

alter table MemberRegistrationItems add constraint FK_Inheritance_13 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OccasionTable add constraint FK_Inheritance_43 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OccasionTable add constraint FK_Relationship_11 foreign key (Gif_Id)
      references GiftTable (Id) on delete restrict on update restrict;

alter table OrderContentList add constraint FK_Inheritance_40 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OrderList add constraint FK_Inheritance_2 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OrderList add constraint FK_Relationship_16 foreign key (Ord_Id)
      references OrderContentList (Id) on delete restrict on update restrict;

alter table OrderState add constraint FK_Inheritance_29 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OrderState add constraint FK_Relationship_4 foreign key (Ord_Id)
      references OrderList (Id) on delete restrict on update restrict;

alter table OrderStatistics add constraint FK_Inheritance_7 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table PreferentialType add constraint FK_Inheritance_37 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table PreferentialType add constraint FK_Relationship_9 foreign key (Pro_Id)
      references PromotionalOffersTable (Id) on delete restrict on update restrict;

alter table PromotionalOffersTable add constraint FK_Inheritance_36 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table RegionLevelTable add constraint FK_Inheritance_39 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table RegionLevelTable add constraint FK_Relationship_14 foreign key (Reg_Id)
      references RegionList (Id) on delete restrict on update restrict;

alter table RegionList add constraint FK_Inheritance_22 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table RoleManagement add constraint FK_Inheritance_23 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table ShopInformation add constraint FK_Inheritance_46 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table ShopInformation add constraint FK_Relationship_20 foreign key (Sto_Id)
      references StoreSettings (Id) on delete restrict on update restrict;

alter table StoreSettings add constraint FK_Inheritance_27 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table TypeTable add constraint FK_Inheritance_44 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table TypeTable add constraint FK_Relationship_10 foreign key (Gif_Id)
      references GiftTable (Id) on delete restrict on update restrict;
