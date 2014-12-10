drop table if exists AccessPurchaseRate;

drop table if exists AdministratorList;

drop table if exists ArticalList;

drop table if exists ArticleClassification;

drop table if exists CartTable;

drop table if exists CommentsGoodsList;

drop table if exists CommodityManagement;

drop table if exists CustomerStatistics;

drop table if exists DailySpecials;

drop table if exists DisplayType;

drop table if exists EmailServer;

drop table if exists GiftTable;

drop table if exists GiftTableContents;

drop table if exists GoodsClassification;

drop table if exists HolidaySpecialArea;

drop table if exists Liink;

drop table if exists MemberCollectionTable;

drop table if exists MemberList;

drop table if exists MemberRegistrationItems;

drop table if exists OccasionTable;

drop table if exists OrderList;

drop table if exists OrderState;

drop table if exists OrderStatistics;

drop table if exists OrderTableContents;

drop table if exists PreferentialType;

drop table if exists PromotionalOffersTable;

drop table if exists RegionLevelTable;

drop table if exists RegionList;

drop table if exists RoleManagement;

drop table if exists ShippingAddressTable;

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
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Ranking              int not null,
   GoodsId              int not null,
   SentimentIndex       int,
   VisitsNumber         int,
   VisitsPurchaseRate   float,
   primary key (Id)
);

/*==============================================================*/
/* Table: AdministratorList                                     */
/*==============================================================*/
create table AdministratorList
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   UserName             varchar(1024) not null,
   Email                varchar(1024),
   AddTime              timestamp,
   lastLoginTime        timestamp,
   Password             varchar(1024) not null,
   primary key (Id)
);

/*==============================================================*/
/* Table: ArticalList                                           */
/*==============================================================*/
create table ArticalList
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Number               int,
   Title                varchar(1024),
   Classification       varchar(1024),
   ArticalImportant     varchar(1024),
   WhetherShown         bool,
   AddTime              timestamp,
   Opreation            varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: ArticleClassification                                 */
/*==============================================================*/
create table ArticleClassification
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   ArticleClassificationName varchar(1024) not null,
   ArticleClassificationStyle varchar(1024),
   Descripetion         varchar(1024),
   Sorting              int,
   WhetherNavigationBarDisplay varchar(1024),
   Opreation            varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: CartTable                                             */
/*==============================================================*/
create table CartTable
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   MemberId             int,
   GoodsId              int,
   primary key (Id)
);

/*==============================================================*/
/* Table: CommentsGoodsList                                     */
/*==============================================================*/
create table CommentsGoodsList
(
   Id                   int not null,
   Com_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   CommentType          varchar(1024),
   CommentContent       varchar(1024),
   MemberId             int,
   DescriptionConsistent int,
   deliverySpeed        int,
   LogisticsSpeed       int,
   CourierServiceAttitude int,
   primary key (Id)
);

/*==============================================================*/
/* Table: CommodityManagement                                   */
/*==============================================================*/
create table CommodityManagement
(
   Id                   int not null,
   Gif_Id               int,
   Car_Id               int,
   Ord_Id               int,
   Mem_Id               int,
   Acc_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   GoodsNumber          varchar(1024) not null,
   ShopItemNamber       varchar(1024) not null,
   ShopShelves          varchar(1024),
   ShopInventory        int,
   ShopKindNumber       int,
   ShopQuantity         int,
   ShopDisplay          varchar(1024),
   CollectionNumber     int,
   GoodsCommentsId      int,
   GoodsName            varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: CustomerStatistics                                    */
/*==============================================================*/
create table CustomerStatistics
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   MembersPurchaseRate  float not null,
   MembersAverageOrder  double,
   MembersAveragePurchases double,
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
   Discount             float,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   primary key (Id, Pro_Id)
);

/*==============================================================*/
/* Table: DisplayType                                           */
/*==============================================================*/
create table DisplayType
(
   Id                   int not null,
   Lii_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   LogoType             varchar(1024),
   TextType             varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: EmailServer                                           */
/*==============================================================*/
create table EmailServer
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   EmailServer          varchar(1024),
   SendMailService      varchar(1024),
   Account              varchar(1024),
   Password             varchar(1024),
   ReplyEmaiAddressl    varchar(1024),
   EmailAddress         varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: GiftTable                                             */
/*==============================================================*/
create table GiftTable
(
   Id                   int not null,
   Gif_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
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
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   GoodsId              int,
   GiftId               char(10),
   primary key (Id)
);

/*==============================================================*/
/* Table: GoodsClassification                                   */
/*==============================================================*/
create table GoodsClassification
(
   Id                   int not null,
   Com_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   ClassificationName   varchar(1024) not null,
   ClassificationDiscript varchar(1024),
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
   Discount             float,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Meaning              varchar(1024),
   primary key (Id, Pro_Id)
);

/*==============================================================*/
/* Table: Liink                                                 */
/*==============================================================*/
create table Liink
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   LinkName             varchar(1024) not null,
   LinkAddress          varchar(1024),
   Sorting              int,
   DisplayTypeId        int,
   primary key (Id)
);

/*==============================================================*/
/* Table: MemberCollectionTable                                 */
/*==============================================================*/
create table MemberCollectionTable
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
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
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Number               int not null,
   Email                varchar(1024),
   WhetherAuthenticate  bool,
   RegisteredTime       timestamp,
   CurrentPicture       varchar(1024),
   NickName             varchar(1024),
   RealName             varchar(1024),
   Sex                  bool,
   Birthday             timestamp,
   ResidentialAddress   varchar(1024),
   HomeTown             varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: MemberRegistrationItems                               */
/*==============================================================*/
create table MemberRegistrationItems
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   MemberRegistrationItemsName varchar(1024),
   WeightsSorting       varchar(1024),
   WhetherShown         bool,
   WhetherRequired      bool,
   primary key (Id)
);

/*==============================================================*/
/* Table: OccasionTable                                         */
/*==============================================================*/
create table OccasionTable
(
   Id                   int not null,
   Gif_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   VisitRelatives       varchar(1024),
   VisitFriends         varchar(1024),
   GiftGiving           varchar(1024),
   VisitPatient         varchar(1024),
   CongratulationsToHospital varchar(1024),
   FamilyOrder          varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderList                                             */
/*==============================================================*/
create table OrderList
(
   Id                   int not null,
   Ord_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   OrderNumber          int not null,
   OrderTime            timestamp not null,
   TotalMoney           float not null,
   AmountPayable        float not null,
   OrderState           varchar(1024) not null,
   MembersId            int,
   Number               int,
   ConsigneeAddressId   int,
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
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   NotDeliverGoods      varchar(1024),
   Delivery             varchar(1024),
   HaveToSignFor        varchar(1024),
   RefusalReceive       varchar(1024),
   ReturnOfGoods        varchar(1024),
   RefundSuccess        varchar(1024),
   Unconfirmed          varchar(1024),
   OrderFinished        varchar(1024),
   Payed                varchar(1024),
   NotPaying            varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderStatistics                                       */
/*==============================================================*/
create table OrderStatistics
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   OrderGeneralSituation varchar(1024) not null,
   DistributionMethod   varchar(1024),
   PaymentMethod        varchar(1024),
   EffectiveOrderAmount double,
   ClickOrdersPerThousand double,
   ClickMoneyPerThousand double,
   primary key (Id)
);

/*==============================================================*/
/* Table: OrderTableContents                                    */
/*==============================================================*/
create table OrderTableContents
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   OrderId              int not null,
   GoodsId              int not null,
   primary key (Id)
);

/*==============================================================*/
/* Table: PreferentialType                                      */
/*==============================================================*/
create table PreferentialType
(
   Id                   int not null,
   Pro_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Percentage           float(8),
   ReducePrice          int,
   ArrivalIntegral      int,
   primary key (Id)
);

/*==============================================================*/
/* Table: PromotionalOffersTable                                */
/*==============================================================*/
create table PromotionalOffersTable
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   GoodsId              int,
   PreferentialTypeId   int,
   Discount             float,
   primary key (Id)
);

/*==============================================================*/
/* Table: RegionLevelTable                                      */
/*==============================================================*/
create table RegionLevelTable
(
   Id                   int not null,
   Reg_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Province             varchar(1024),
   City                 varchar(1024),
   County               varchar(1024),
   Town                 varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: RegionList                                            */
/*==============================================================*/
create table RegionList
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
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
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   RoleName             varchar(1024) not null,
   RoleDescription      varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: ShippingAddressTable                                  */
/*==============================================================*/
create table ShippingAddressTable
(
   Id                   int not null,
   Ord_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   TheFirstAddress      varchar(1024),
   TheSecondAddress     varchar(1024),
   TheThirdAddress      varchar(1024),
   TheFourthAddress     varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: ShopInformation                                       */
/*==============================================================*/
create table ShopInformation
(
   Id                   int not null,
   Sto_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   ShopName             varchar(1024) not null,
   ShopLogo             varchar(1024),
   StoreSlogan          varchar(1024),
   StoreCopyright       varchar(1024),
   StoreAuthoritativeAttestation varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: StoreSettings                                         */
/*==============================================================*/
create table StoreSettings
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   StoreSsttings        varchar(1024) not null,
   BasicSetting         varchar(1024),
   ShoppingProcess      varchar(1024),
   CommodityDisplaySetting varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: TypeTable                                             */
/*==============================================================*/
create table TypeTable
(
   Id                   int not null,
   Gif_Id               int,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
   Recovery             varchar(1024),
   ImproveResistance    varchar(1024),
   RorBrain             varchar(1024),
   Beauty               varchar(1024),
   primary key (Id)
);

/*==============================================================*/
/* Table: parents                                               */
/*==============================================================*/
create table parents
(
   Id                   int not null,
   TimeAdd              timestamp,
   TimeUpdate           timestamp,
   Attribute_130        char(10),
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

alter table CommentsGoodsList add constraint FK_Inheritance_31 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CommentsGoodsList add constraint FK_Relationship_3 foreign key (Com_Id)
      references CommodityManagement (Id) on delete restrict on update restrict;

alter table CommodityManagement add constraint FK_Inheritance_1 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table CommodityManagement add constraint FK_Relationship_13 foreign key (Gif_Id)
      references GiftTableContents (Id) on delete restrict on update restrict;

alter table CommodityManagement add constraint FK_Relationship_17 foreign key (Ord_Id)
      references OrderTableContents (Id) on delete restrict on update restrict;

alter table CommodityManagement add constraint FK_Relationship_19 foreign key (Car_Id)
      references CartTable (Id) on delete restrict on update restrict;

alter table CommodityManagement add constraint FK_Relationship_21 foreign key (Mem_Id)
      references MemberCollectionTable (Id) on delete restrict on update restrict;

alter table CommodityManagement add constraint FK_Relationship_8 foreign key (Acc_Id)
      references AccessPurchaseRate (Id) on delete restrict on update restrict;

alter table CustomerStatistics add constraint FK_Inheritance_6 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table DailySpecials add constraint FK_Inheritance_10 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table DailySpecials add constraint FK_Inheritance_34 foreign key (Pro_Id)
      references PromotionalOffersTable (Id) on delete restrict on update restrict;

alter table DisplayType add constraint FK_Inheritance_38 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table DisplayType add constraint FK_Relationship_15 foreign key (Lii_Id)
      references Liink (Id) on delete restrict on update restrict;

alter table EmailServer add constraint FK_Inheritance_20 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table GiftTable add constraint FK_Inheritance_12 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table GiftTable add constraint FK_Relationship_12 foreign key (Gif_Id)
      references GiftTableContents (Id) on delete restrict on update restrict;

alter table GiftTableContents add constraint FK_Inheritance_42 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table GoodsClassification add constraint FK_Inheritance_45 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table GoodsClassification add constraint FK_Relationship_1 foreign key (Com_Id)
      references CommodityManagement (Id) on delete restrict on update restrict;

alter table HolidaySpecialArea add constraint FK_Inheritance_21 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table HolidaySpecialArea add constraint FK_Inheritance_35 foreign key (Pro_Id)
      references PromotionalOffersTable (Id) on delete restrict on update restrict;

alter table Liink add constraint FK_Inheritance_25 foreign key (Id)
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

alter table OrderList add constraint FK_Inheritance_2 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OrderList add constraint FK_Relationship_16 foreign key (Ord_Id)
      references OrderTableContents (Id) on delete restrict on update restrict;

alter table OrderState add constraint FK_Inheritance_29 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OrderState add constraint FK_Relationship_4 foreign key (Ord_Id)
      references OrderList (Id) on delete restrict on update restrict;

alter table OrderStatistics add constraint FK_Inheritance_7 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table OrderTableContents add constraint FK_Inheritance_40 foreign key (Id)
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

alter table ShippingAddressTable add constraint FK_Inheritance_30 foreign key (Id)
      references parents (Id) on delete restrict on update restrict;

alter table ShippingAddressTable add constraint FK_Relationship_5 foreign key (Ord_Id)
      references OrderList (Id) on delete restrict on update restrict;

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
