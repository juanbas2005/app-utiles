.class public final Lk91;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final r:Lg91;

.field public static final s:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lge1;

.field public final c:Ljz0;

.field public final d:Lcw0;

.field public final e:Lwr0;

.field public final f:Lf83;

.field public final g:Lmd2;

.field public final h:Lwz0;

.field public final i:Lqc3;

.field public final j:Lq91;

.field public final k:Lec;

.field public final l:Lh91;

.field public final m:Lkd6;

.field public n:Lxa1;

.field public final o:Lxb7;

.field public final p:Lxb7;

.field public final q:Lxb7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg91;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lg91;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk91;->r:Lg91;

    .line 8
    .line 9
    const-string v0, "UTF-8"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lk91;->s:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;Lf83;Lge1;Lmd2;Ljz0;Lwz0;Lcw0;Lqc3;Lkd6;Lq91;Lec;Lh91;Lwr0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxb7;

    .line 5
    .line 6
    invoke-direct {v0}, Lxb7;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk91;->o:Lxb7;

    .line 10
    .line 11
    new-instance v0, Lxb7;

    .line 12
    .line 13
    invoke-direct {v0}, Lxb7;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lk91;->p:Lxb7;

    .line 17
    .line 18
    new-instance v0, Lxb7;

    .line 19
    .line 20
    invoke-direct {v0}, Lxb7;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lk91;->q:Lxb7;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lk91;->a:Landroid/content/Context;

    .line 32
    .line 33
    iput-object p2, p0, Lk91;->f:Lf83;

    .line 34
    .line 35
    iput-object p3, p0, Lk91;->b:Lge1;

    .line 36
    .line 37
    iput-object p4, p0, Lk91;->g:Lmd2;

    .line 38
    .line 39
    iput-object p5, p0, Lk91;->c:Ljz0;

    .line 40
    .line 41
    iput-object p6, p0, Lk91;->h:Lwz0;

    .line 42
    .line 43
    iput-object p7, p0, Lk91;->d:Lcw0;

    .line 44
    .line 45
    iput-object p8, p0, Lk91;->i:Lqc3;

    .line 46
    .line 47
    iput-object p10, p0, Lk91;->j:Lq91;

    .line 48
    .line 49
    iput-object p11, p0, Lk91;->k:Lec;

    .line 50
    .line 51
    iput-object p12, p0, Lk91;->l:Lh91;

    .line 52
    .line 53
    iput-object p9, p0, Lk91;->m:Lkd6;

    .line 54
    .line 55
    iput-object p13, p0, Lk91;->e:Lwr0;

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
.end method

.method public static a(Lk91;)Lyb9;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "FirebaseCrashlytics"

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lk91;->g:Lmd2;

    .line 12
    .line 13
    iget-object v2, v2, Lmd2;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/io/File;

    .line 16
    .line 17
    sget-object v3, Lk91;->r:Lg91;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lmd2;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/io/File;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const/4 v6, 0x3

    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 57
    :try_start_1
    const-string v5, "com.google.firebase.crash.FirebaseCrash"

    .line 58
    .line 59
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    .line 61
    .line 62
    :try_start_2
    const-string v5, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    .line 63
    .line 64
    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    goto :goto_1

    .line 72
    :catch_0
    const-string v5, "Logging app exception event to Firebase Analytics"

    .line 73
    .line 74
    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_0

    .line 79
    .line 80
    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    :cond_0
    new-instance v5, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    invoke-direct {v5, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    .line 87
    .line 88
    .line 89
    new-instance v6, Lj91;

    .line 90
    .line 91
    invoke-direct {v6, p0, v7, v8}, Lj91;-><init>(Lk91;J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v6}, Lb35;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lyb9;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catch_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v6, "Could not parse app exception timestamp from file "

    .line 105
    .line 106
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    invoke-static {v1}, Lb35;->A(Ljava/util/List;)Lyb9;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method


# virtual methods
.method public final b(ZLz00;Z)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iget-object v3, v1, Lk91;->j:Lq91;

    .line 6
    .line 7
    const-string v4, "FirebaseCrashlytics"

    .line 8
    .line 9
    invoke-static {}, Lwr0;->p()V

    .line 10
    .line 11
    .line 12
    new-instance v5, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v6, v1, Lk91;->m:Lkd6;

    .line 15
    .line 16
    iget-object v0, v6, Lkd6;->y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lwa1;

    .line 19
    .line 20
    invoke-virtual {v0}, Lwa1;->c()Ljava/util/NavigableSet;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v7, 0x2

    .line 32
    const/4 v8, 0x0

    .line 33
    if-gt v0, v2, :cond_0

    .line 34
    .line 35
    const-string v0, "No open sessions to be closed."

    .line 36
    .line 37
    invoke-static {v4, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_34

    .line 42
    .line 43
    invoke-static {v4, v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v9, v0

    .line 52
    check-cast v9, Ljava/lang/String;

    .line 53
    .line 54
    const/4 v13, 0x1

    .line 55
    const/4 v14, 0x0

    .line 56
    if-eqz p3, :cond_18

    .line 57
    .line 58
    invoke-virtual/range {p2 .. p2}, Lz00;->d()Lbo6;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v0, v0, Lbo6;->b:Lyn6;

    .line 63
    .line 64
    iget-boolean v0, v0, Lyn6;->b:Z

    .line 65
    .line 66
    if-eqz v0, :cond_18

    .line 67
    .line 68
    iget-object v0, v1, Lk91;->g:Lmd2;

    .line 69
    .line 70
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 71
    .line 72
    const/16 v16, 0x4

    .line 73
    .line 74
    const/16 v12, 0x1e

    .line 75
    .line 76
    if-lt v15, v12, :cond_17

    .line 77
    .line 78
    iget-object v12, v1, Lk91;->a:Landroid/content/Context;

    .line 79
    .line 80
    const-string v15, "activity"

    .line 81
    .line 82
    invoke-virtual {v12, v15}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    check-cast v12, Landroid/app/ActivityManager;

    .line 87
    .line 88
    invoke-static {v12}, Lt4;->n(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v15

    .line 96
    if-eqz v15, :cond_15

    .line 97
    .line 98
    new-instance v15, Lqc3;

    .line 99
    .line 100
    invoke-direct {v15, v0}, Lqc3;-><init>(Lmd2;)V

    .line 101
    .line 102
    .line 103
    const/16 v17, 0x8

    .line 104
    .line 105
    sget-object v10, Lqc3;->C:Ltz2;

    .line 106
    .line 107
    iput-object v10, v15, Lqc3;->y:Ljava/lang/Object;

    .line 108
    .line 109
    if-nez v9, :cond_1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    const-string v10, "userlog"

    .line 113
    .line 114
    invoke-virtual {v0, v9, v10}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    new-instance v7, Lhv5;

    .line 119
    .line 120
    invoke-direct {v7, v10}, Lhv5;-><init>(Ljava/io/File;)V

    .line 121
    .line 122
    .line 123
    iput-object v7, v15, Lqc3;->y:Ljava/lang/Object;

    .line 124
    .line 125
    :goto_0
    iget-object v7, v1, Lk91;->e:Lwr0;

    .line 126
    .line 127
    new-instance v10, Lfk4;

    .line 128
    .line 129
    invoke-direct {v10, v0}, Lfk4;-><init>(Lmd2;)V

    .line 130
    .line 131
    .line 132
    new-instance v8, Lcw0;

    .line 133
    .line 134
    invoke-direct {v8, v9, v0, v7}, Lcw0;-><init>(Ljava/lang/String;Lmd2;Lwr0;)V

    .line 135
    .line 136
    .line 137
    iget-object v7, v8, Lcw0;->z:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v7, Ll90;

    .line 140
    .line 141
    iget-object v7, v7, Ll90;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v7, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Ljt3;

    .line 150
    .line 151
    invoke-virtual {v10, v9, v14}, Lfk4;->c(Ljava/lang/String;Z)Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-virtual {v7, v11}, Ljt3;->c(Ljava/util/Map;)V

    .line 156
    .line 157
    .line 158
    iget-object v7, v8, Lcw0;->A:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v7, Ll90;

    .line 161
    .line 162
    iget-object v7, v7, Ll90;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v7, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 165
    .line 166
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    check-cast v7, Ljt3;

    .line 171
    .line 172
    invoke-virtual {v10, v9, v13}, Lfk4;->c(Ljava/lang/String;Z)Ljava/util/Map;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-virtual {v7, v11}, Ljt3;->c(Ljava/util/Map;)V

    .line 177
    .line 178
    .line 179
    iget-object v7, v8, Lcw0;->C:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v7, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 182
    .line 183
    invoke-virtual {v10, v9}, Lfk4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v7, v10, v14}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 188
    .line 189
    .line 190
    iget-object v7, v8, Lcw0;->B:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v7, Lv86;

    .line 193
    .line 194
    const-string v10, "Failed to close rollouts state file."

    .line 195
    .line 196
    const-string v11, "Loaded rollouts state:\n"

    .line 197
    .line 198
    move/from16 v20, v13

    .line 199
    .line 200
    const-string v13, "rollouts-state"

    .line 201
    .line 202
    invoke-virtual {v0, v9, v13}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_4

    .line 211
    .line 212
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 213
    .line 214
    .line 215
    move-result-wide v21

    .line 216
    const-wide/16 v23, 0x0

    .line 217
    .line 218
    cmp-long v0, v21, v23

    .line 219
    .line 220
    if-nez v0, :cond_2

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_2
    :try_start_0
    new-instance v14, Ljava/io/FileInputStream;

    .line 224
    .line 225
    invoke-direct {v14, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 226
    .line 227
    .line 228
    :try_start_1
    invoke-static {v14}, Lsu0;->P(Ljava/io/FileInputStream;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Lfk4;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    new-instance v2, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v11, "\nfor session "

    .line 245
    .line 246
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const/4 v11, 0x3

    .line 257
    invoke-static {v4, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 258
    .line 259
    .line 260
    move-result v22

    .line 261
    if-eqz v22, :cond_3

    .line 262
    .line 263
    const/4 v11, 0x0

    .line 264
    invoke-static {v4, v2, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    .line 266
    .line 267
    :cond_3
    invoke-static {v14, v10}, Lsu0;->h(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :goto_1
    move-object v8, v14

    .line 272
    goto :goto_3

    .line 273
    :catchall_0
    move-exception v0

    .line 274
    goto :goto_1

    .line 275
    :catch_0
    move-exception v0

    .line 276
    goto :goto_2

    .line 277
    :catchall_1
    move-exception v0

    .line 278
    const/4 v8, 0x0

    .line 279
    goto :goto_3

    .line 280
    :catch_1
    move-exception v0

    .line 281
    const/4 v14, 0x0

    .line 282
    :goto_2
    :try_start_2
    const-string v2, "Error deserializing rollouts state."

    .line 283
    .line 284
    invoke-static {v4, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 285
    .line 286
    .line 287
    invoke-static {v13}, Lfk4;->f(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 288
    .line 289
    .line 290
    invoke-static {v14, v10}, Lsu0;->h(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :goto_3
    invoke-static {v8, v10}, Lsu0;->h(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :cond_4
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v2, "The file has a length of zero for session: "

    .line 303
    .line 304
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v13, v0}, Lfk4;->g(Ljava/io/File;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 318
    .line 319
    :goto_5
    invoke-virtual {v7, v0}, Lv86;->b(Ljava/util/List;)Z

    .line 320
    .line 321
    .line 322
    iget-object v0, v6, Lkd6;->y:Ljava/lang/Object;

    .line 323
    .line 324
    move-object v2, v0

    .line 325
    check-cast v2, Lwa1;

    .line 326
    .line 327
    iget-object v0, v2, Lwa1;->b:Lmd2;

    .line 328
    .line 329
    const-string v7, "start-time"

    .line 330
    .line 331
    invoke-virtual {v0, v9, v7}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 336
    .line 337
    .line 338
    move-result-wide v10

    .line 339
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-eqz v7, :cond_5

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    invoke-static {v7}, Lt4;->f(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-static {v7}, Lt4;->v(Landroid/app/ApplicationExitInfo;)J

    .line 358
    .line 359
    .line 360
    move-result-wide v12

    .line 361
    cmp-long v12, v12, v10

    .line 362
    .line 363
    if-gez v12, :cond_6

    .line 364
    .line 365
    :cond_5
    const/4 v7, 0x0

    .line 366
    goto :goto_7

    .line 367
    :cond_6
    invoke-static {v7}, Lt4;->u(Landroid/app/ApplicationExitInfo;)I

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    const/4 v13, 0x6

    .line 372
    if-eq v12, v13, :cond_7

    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_7
    :goto_7
    if-nez v7, :cond_9

    .line 376
    .line 377
    const-string v0, "No relevant ApplicationExitInfo occurred during session: "

    .line 378
    .line 379
    invoke-static {v0, v9}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    const/4 v2, 0x2

    .line 384
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    if-eqz v7, :cond_8

    .line 389
    .line 390
    const/4 v11, 0x0

    .line 391
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 392
    .line 393
    .line 394
    :cond_8
    move-object/from16 v30, v3

    .line 395
    .line 396
    move-object/from16 v31, v6

    .line 397
    .line 398
    move/from16 v6, v20

    .line 399
    .line 400
    goto/16 :goto_c

    .line 401
    .line 402
    :cond_9
    iget-object v0, v6, Lkd6;->x:Ljava/lang/Object;

    .line 403
    .line 404
    move-object v10, v0

    .line 405
    check-cast v10, Lsa1;

    .line 406
    .line 407
    :try_start_3
    invoke-static {v7}, Lt4;->l(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-eqz v0, :cond_a

    .line 412
    .line 413
    invoke-static {v0}, Lkd6;->G(Ljava/io/InputStream;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 417
    goto :goto_8

    .line 418
    :catch_2
    move-exception v0

    .line 419
    new-instance v11, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v12, "Could not get input trace in application exit info: "

    .line 422
    .line 423
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-static {v7}, Lt4;->m(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v12

    .line 430
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    const-string v12, " Error: "

    .line 434
    .line 435
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    const/4 v11, 0x0

    .line 446
    invoke-static {v4, v0, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 447
    .line 448
    .line 449
    :cond_a
    const/4 v0, 0x0

    .line 450
    :goto_8
    new-instance v11, Lez;

    .line 451
    .line 452
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-static {v7}, Lt4;->B(Landroid/app/ApplicationExitInfo;)I

    .line 456
    .line 457
    .line 458
    move-result v12

    .line 459
    iput v12, v11, Lez;->d:I

    .line 460
    .line 461
    iget-byte v12, v11, Lez;->j:B

    .line 462
    .line 463
    or-int/lit8 v12, v12, 0x4

    .line 464
    .line 465
    int-to-byte v12, v12

    .line 466
    iput-byte v12, v11, Lez;->j:B

    .line 467
    .line 468
    invoke-static {v7}, Lt4;->x(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v12

    .line 472
    if-eqz v12, :cond_14

    .line 473
    .line 474
    iput-object v12, v11, Lez;->b:Ljava/lang/String;

    .line 475
    .line 476
    invoke-static {v7}, Lt4;->u(Landroid/app/ApplicationExitInfo;)I

    .line 477
    .line 478
    .line 479
    move-result v12

    .line 480
    iput v12, v11, Lez;->c:I

    .line 481
    .line 482
    iget-byte v12, v11, Lez;->j:B

    .line 483
    .line 484
    const/16 v18, 0x2

    .line 485
    .line 486
    or-int/lit8 v12, v12, 0x2

    .line 487
    .line 488
    int-to-byte v12, v12

    .line 489
    iput-byte v12, v11, Lez;->j:B

    .line 490
    .line 491
    invoke-static {v7}, Lt4;->e(Landroid/app/ApplicationExitInfo;)J

    .line 492
    .line 493
    .line 494
    move-result-wide v12

    .line 495
    iput-wide v12, v11, Lez;->g:J

    .line 496
    .line 497
    iget-byte v12, v11, Lez;->j:B

    .line 498
    .line 499
    or-int/lit8 v12, v12, 0x20

    .line 500
    .line 501
    int-to-byte v12, v12

    .line 502
    iput-byte v12, v11, Lez;->j:B

    .line 503
    .line 504
    invoke-static {v7}, Lt4;->D(Landroid/app/ApplicationExitInfo;)I

    .line 505
    .line 506
    .line 507
    move-result v12

    .line 508
    iput v12, v11, Lez;->a:I

    .line 509
    .line 510
    iget-byte v12, v11, Lez;->j:B

    .line 511
    .line 512
    or-int/lit8 v12, v12, 0x1

    .line 513
    .line 514
    int-to-byte v12, v12

    .line 515
    iput-byte v12, v11, Lez;->j:B

    .line 516
    .line 517
    invoke-static {v7}, Lt4;->C(Landroid/app/ApplicationExitInfo;)J

    .line 518
    .line 519
    .line 520
    move-result-wide v12

    .line 521
    iput-wide v12, v11, Lez;->e:J

    .line 522
    .line 523
    iget-byte v12, v11, Lez;->j:B

    .line 524
    .line 525
    or-int/lit8 v12, v12, 0x8

    .line 526
    .line 527
    int-to-byte v12, v12

    .line 528
    iput-byte v12, v11, Lez;->j:B

    .line 529
    .line 530
    invoke-static {v7}, Lbn6;->d(Landroid/app/ApplicationExitInfo;)J

    .line 531
    .line 532
    .line 533
    move-result-wide v12

    .line 534
    iput-wide v12, v11, Lez;->f:J

    .line 535
    .line 536
    iget-byte v7, v11, Lez;->j:B

    .line 537
    .line 538
    or-int/lit8 v7, v7, 0x10

    .line 539
    .line 540
    int-to-byte v7, v7

    .line 541
    iput-byte v7, v11, Lez;->j:B

    .line 542
    .line 543
    iput-object v0, v11, Lez;->h:Ljava/lang/String;

    .line 544
    .line 545
    invoke-virtual {v11}, Lez;->a()Lfz;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    iget-object v7, v10, Lsa1;->a:Landroid/content/Context;

    .line 550
    .line 551
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 552
    .line 553
    .line 554
    move-result-object v7

    .line 555
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    iget v7, v7, Landroid/content/res/Configuration;->orientation:I

    .line 560
    .line 561
    new-instance v11, Lqz;

    .line 562
    .line 563
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 564
    .line 565
    .line 566
    const-string v12, "anr"

    .line 567
    .line 568
    iput-object v12, v11, Lqz;->b:Ljava/lang/String;

    .line 569
    .line 570
    iget-wide v12, v0, Lfz;->g:J

    .line 571
    .line 572
    iput-wide v12, v11, Lqz;->a:J

    .line 573
    .line 574
    iget-byte v14, v11, Lqz;->g:B

    .line 575
    .line 576
    or-int/lit8 v14, v14, 0x1

    .line 577
    .line 578
    int-to-byte v14, v14

    .line 579
    iput-byte v14, v11, Lqz;->g:B

    .line 580
    .line 581
    iget-object v14, v10, Lsa1;->c:Lwz0;

    .line 582
    .line 583
    move-object/from16 v30, v3

    .line 584
    .line 585
    iget-object v3, v10, Lsa1;->e:Lz00;

    .line 586
    .line 587
    invoke-virtual {v3}, Lz00;->d()Lbo6;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    iget-object v3, v3, Lbo6;->b:Lyn6;

    .line 592
    .line 593
    iget-boolean v3, v3, Lyn6;->c:Z

    .line 594
    .line 595
    if-eqz v3, :cond_f

    .line 596
    .line 597
    iget-object v3, v14, Lwz0;->c:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v3, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-lez v3, :cond_f

    .line 606
    .line 607
    new-instance v3, Ljava/util/ArrayList;

    .line 608
    .line 609
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 610
    .line 611
    .line 612
    iget-object v14, v14, Lwz0;->c:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v14, Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object v14

    .line 620
    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 621
    .line 622
    .line 623
    move-result v22

    .line 624
    if-eqz v22, :cond_e

    .line 625
    .line 626
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v22

    .line 630
    move/from16 v29, v7

    .line 631
    .line 632
    move-object/from16 v7, v22

    .line 633
    .line 634
    check-cast v7, Lid0;

    .line 635
    .line 636
    move-object/from16 p2, v14

    .line 637
    .line 638
    iget-object v14, v7, Lid0;->a:Ljava/lang/String;

    .line 639
    .line 640
    if-eqz v14, :cond_d

    .line 641
    .line 642
    move-object/from16 v31, v6

    .line 643
    .line 644
    iget-object v6, v7, Lid0;->b:Ljava/lang/String;

    .line 645
    .line 646
    if-eqz v6, :cond_c

    .line 647
    .line 648
    iget-object v7, v7, Lid0;->c:Ljava/lang/String;

    .line 649
    .line 650
    if-eqz v7, :cond_b

    .line 651
    .line 652
    new-instance v1, Lgz;

    .line 653
    .line 654
    invoke-direct {v1, v6, v14, v7}, Lgz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-object/from16 v1, p0

    .line 661
    .line 662
    move-object/from16 v14, p2

    .line 663
    .line 664
    move/from16 v7, v29

    .line 665
    .line 666
    move-object/from16 v6, v31

    .line 667
    .line 668
    goto :goto_9

    .line 669
    :cond_b
    const-string v0, "Null buildId"

    .line 670
    .line 671
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :cond_c
    const-string v0, "Null arch"

    .line 676
    .line 677
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    return-void

    .line 681
    :cond_d
    const-string v0, "Null libraryName"

    .line 682
    .line 683
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :cond_e
    move-object/from16 v31, v6

    .line 688
    .line 689
    move/from16 v29, v7

    .line 690
    .line 691
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    goto :goto_a

    .line 696
    :cond_f
    move-object/from16 v31, v6

    .line 697
    .line 698
    move/from16 v29, v7

    .line 699
    .line 700
    const/4 v1, 0x0

    .line 701
    :goto_a
    new-instance v3, Lez;

    .line 702
    .line 703
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 704
    .line 705
    .line 706
    iget v6, v0, Lfz;->d:I

    .line 707
    .line 708
    iput v6, v3, Lez;->d:I

    .line 709
    .line 710
    iget-byte v6, v3, Lez;->j:B

    .line 711
    .line 712
    or-int/lit8 v6, v6, 0x4

    .line 713
    .line 714
    int-to-byte v6, v6

    .line 715
    iput-byte v6, v3, Lez;->j:B

    .line 716
    .line 717
    iget-object v7, v0, Lfz;->b:Ljava/lang/String;

    .line 718
    .line 719
    if-eqz v7, :cond_13

    .line 720
    .line 721
    iput-object v7, v3, Lez;->b:Ljava/lang/String;

    .line 722
    .line 723
    iget v7, v0, Lfz;->c:I

    .line 724
    .line 725
    iput v7, v3, Lez;->c:I

    .line 726
    .line 727
    const/16 v18, 0x2

    .line 728
    .line 729
    or-int/lit8 v6, v6, 0x2

    .line 730
    .line 731
    int-to-byte v6, v6

    .line 732
    iput-wide v12, v3, Lez;->g:J

    .line 733
    .line 734
    or-int/lit8 v6, v6, 0x20

    .line 735
    .line 736
    int-to-byte v6, v6

    .line 737
    iget v7, v0, Lfz;->a:I

    .line 738
    .line 739
    iput v7, v3, Lez;->a:I

    .line 740
    .line 741
    or-int/lit8 v6, v6, 0x1

    .line 742
    .line 743
    int-to-byte v6, v6

    .line 744
    iget-wide v12, v0, Lfz;->e:J

    .line 745
    .line 746
    iput-wide v12, v3, Lez;->e:J

    .line 747
    .line 748
    or-int/lit8 v6, v6, 0x8

    .line 749
    .line 750
    int-to-byte v6, v6

    .line 751
    iget-wide v12, v0, Lfz;->f:J

    .line 752
    .line 753
    iput-wide v12, v3, Lez;->f:J

    .line 754
    .line 755
    or-int/lit8 v6, v6, 0x10

    .line 756
    .line 757
    int-to-byte v6, v6

    .line 758
    iput-byte v6, v3, Lez;->j:B

    .line 759
    .line 760
    iget-object v0, v0, Lfz;->h:Ljava/lang/String;

    .line 761
    .line 762
    iput-object v0, v3, Lez;->h:Ljava/lang/String;

    .line 763
    .line 764
    iput-object v1, v3, Lez;->i:Ljava/util/List;

    .line 765
    .line 766
    invoke-virtual {v3}, Lez;->a()Lfz;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    iget v1, v0, Lfz;->d:I

    .line 771
    .line 772
    const/16 v3, 0x64

    .line 773
    .line 774
    if-eq v1, v3, :cond_10

    .line 775
    .line 776
    move/from16 v3, v20

    .line 777
    .line 778
    goto :goto_b

    .line 779
    :cond_10
    const/4 v3, 0x0

    .line 780
    :goto_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    iget-object v6, v0, Lfz;->b:Ljava/lang/String;

    .line 785
    .line 786
    iget v7, v0, Lfz;->a:I

    .line 787
    .line 788
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    new-instance v12, La00;

    .line 792
    .line 793
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 794
    .line 795
    .line 796
    iput-object v6, v12, La00;->a:Ljava/lang/String;

    .line 797
    .line 798
    iput v7, v12, La00;->b:I

    .line 799
    .line 800
    iget-byte v6, v12, La00;->e:B

    .line 801
    .line 802
    or-int/lit8 v6, v6, 0x1

    .line 803
    .line 804
    int-to-byte v6, v6

    .line 805
    iput v1, v12, La00;->c:I

    .line 806
    .line 807
    const/16 v18, 0x2

    .line 808
    .line 809
    or-int/lit8 v1, v6, 0x2

    .line 810
    .line 811
    int-to-byte v1, v1

    .line 812
    const/4 v6, 0x0

    .line 813
    iput-boolean v6, v12, La00;->d:Z

    .line 814
    .line 815
    or-int/lit8 v1, v1, 0x4

    .line 816
    .line 817
    int-to-byte v1, v1

    .line 818
    iput-byte v1, v12, La00;->e:B

    .line 819
    .line 820
    invoke-virtual {v12}, La00;->a()Lb00;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-static {}, Lsa1;->e()Lwz;

    .line 825
    .line 826
    .line 827
    move-result-object v26

    .line 828
    invoke-virtual {v10}, Lsa1;->a()Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object v27

    .line 832
    if-eqz v27, :cond_12

    .line 833
    .line 834
    new-instance v22, Ltz;

    .line 835
    .line 836
    const/16 v23, 0x0

    .line 837
    .line 838
    const/16 v24, 0x0

    .line 839
    .line 840
    move-object/from16 v25, v0

    .line 841
    .line 842
    invoke-direct/range {v22 .. v27}, Ltz;-><init>(Ljava/util/List;Lvz;Lt91;Lwz;Ljava/util/List;)V

    .line 843
    .line 844
    .line 845
    new-instance v0, Lsz;

    .line 846
    .line 847
    const/16 v25, 0x0

    .line 848
    .line 849
    const/16 v28, 0x0

    .line 850
    .line 851
    move-object/from16 v27, v1

    .line 852
    .line 853
    move-object/from16 v26, v3

    .line 854
    .line 855
    move-object/from16 v23, v22

    .line 856
    .line 857
    move-object/from16 v22, v0

    .line 858
    .line 859
    invoke-direct/range {v22 .. v29}, Lsz;-><init>(Ltz;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lga1;Ljava/util/List;I)V

    .line 860
    .line 861
    .line 862
    move-object/from16 v1, v22

    .line 863
    .line 864
    move/from16 v0, v29

    .line 865
    .line 866
    iput-object v1, v11, Lqz;->c:Lha1;

    .line 867
    .line 868
    invoke-virtual {v10, v0}, Lsa1;->b(I)Ld00;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    iput-object v0, v11, Lqz;->d:Lia1;

    .line 873
    .line 874
    invoke-virtual {v11}, Lqz;->a()Lrz;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    const-string v1, "Persisting anr for session "

    .line 879
    .line 880
    invoke-static {v1, v9}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    const/4 v11, 0x3

    .line 885
    invoke-static {v4, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    if-eqz v3, :cond_11

    .line 890
    .line 891
    const/4 v11, 0x0

    .line 892
    invoke-static {v4, v1, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 893
    .line 894
    .line 895
    :cond_11
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 896
    .line 897
    invoke-static {v0, v15, v8, v1}, Lkd6;->u(Lrz;Lqc3;Lcw0;Ljava/util/Map;)Lrz;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static {v0, v8}, Lkd6;->v(Lrz;Lcw0;)Lna1;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    move/from16 v6, v20

    .line 906
    .line 907
    invoke-virtual {v2, v0, v9, v6}, Lwa1;->d(Lna1;Ljava/lang/String;Z)V

    .line 908
    .line 909
    .line 910
    :goto_c
    const/4 v2, 0x2

    .line 911
    goto :goto_d

    .line 912
    :cond_12
    const-string v0, "Null binaries"

    .line 913
    .line 914
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    return-void

    .line 918
    :cond_13
    const-string v0, "Null processName"

    .line 919
    .line 920
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    return-void

    .line 924
    :cond_14
    const-string v0, "Null processName"

    .line 925
    .line 926
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    return-void

    .line 930
    :cond_15
    move-object/from16 v30, v3

    .line 931
    .line 932
    move-object/from16 v31, v6

    .line 933
    .line 934
    move v6, v13

    .line 935
    const/16 v17, 0x8

    .line 936
    .line 937
    const-string v0, "No ApplicationExitInfo available. Session: "

    .line 938
    .line 939
    invoke-static {v0, v9}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    const/4 v2, 0x2

    .line 944
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    if-eqz v1, :cond_16

    .line 949
    .line 950
    const/4 v11, 0x0

    .line 951
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 952
    .line 953
    .line 954
    goto :goto_e

    .line 955
    :cond_16
    :goto_d
    const/4 v11, 0x0

    .line 956
    goto :goto_e

    .line 957
    :cond_17
    move-object/from16 v30, v3

    .line 958
    .line 959
    move-object/from16 v31, v6

    .line 960
    .line 961
    move v2, v7

    .line 962
    move-object v11, v8

    .line 963
    move v6, v13

    .line 964
    const/16 v17, 0x8

    .line 965
    .line 966
    const-string v0, "ANR feature enabled, but device is API "

    .line 967
    .line 968
    invoke-static {v15, v0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-eqz v1, :cond_19

    .line 977
    .line 978
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 979
    .line 980
    .line 981
    goto :goto_e

    .line 982
    :cond_18
    move-object/from16 v30, v3

    .line 983
    .line 984
    move-object/from16 v31, v6

    .line 985
    .line 986
    move v2, v7

    .line 987
    move-object v11, v8

    .line 988
    move v6, v13

    .line 989
    const/16 v16, 0x4

    .line 990
    .line 991
    const/16 v17, 0x8

    .line 992
    .line 993
    const-string v0, "ANR feature disabled."

    .line 994
    .line 995
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 996
    .line 997
    .line 998
    move-result v1

    .line 999
    if-eqz v1, :cond_19

    .line 1000
    .line 1001
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1002
    .line 1003
    .line 1004
    :cond_19
    :goto_e
    if-eqz p3, :cond_1b

    .line 1005
    .line 1006
    invoke-virtual/range {v30 .. v30}, Lq91;->c()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-eqz v0, :cond_1b

    .line 1011
    .line 1012
    const-string v0, "Finalizing native report for session "

    .line 1013
    .line 1014
    invoke-static {v0, v9}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v1

    .line 1022
    if-eqz v1, :cond_1a

    .line 1023
    .line 1024
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1025
    .line 1026
    .line 1027
    :cond_1a
    invoke-virtual/range {v30 .. v30}, Lq91;->a()Lhz2;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1035
    .line 1036
    const-string v1, "No minidump data found for session "

    .line 1037
    .line 1038
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-static {v4, v0, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1049
    .line 1050
    .line 1051
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1052
    .line 1053
    const-string v1, "No Tombstones data found for session "

    .line 1054
    .line 1055
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-static {v4, v0, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1066
    .line 1067
    .line 1068
    const-string v0, "No native core present"

    .line 1069
    .line 1070
    invoke-static {v4, v0, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1071
    .line 1072
    .line 1073
    :cond_1b
    if-eqz p1, :cond_1c

    .line 1074
    .line 1075
    const/4 v1, 0x0

    .line 1076
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    move-object/from16 v19, v0

    .line 1081
    .line 1082
    check-cast v19, Ljava/lang/String;

    .line 1083
    .line 1084
    move-object/from16 v0, v19

    .line 1085
    .line 1086
    goto :goto_f

    .line 1087
    :cond_1c
    move-object/from16 v2, p0

    .line 1088
    .line 1089
    const/4 v1, 0x0

    .line 1090
    iget-object v0, v2, Lk91;->l:Lh91;

    .line 1091
    .line 1092
    invoke-virtual {v0, v11}, Lh91;->a(Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    const/4 v0, 0x0

    .line 1096
    :goto_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v2

    .line 1100
    const-wide/16 v7, 0x3e8

    .line 1101
    .line 1102
    div-long/2addr v2, v7

    .line 1103
    move-object/from16 v5, v31

    .line 1104
    .line 1105
    iget-object v5, v5, Lkd6;->y:Ljava/lang/Object;

    .line 1106
    .line 1107
    check-cast v5, Lwa1;

    .line 1108
    .line 1109
    iget-object v7, v5, Lwa1;->b:Lmd2;

    .line 1110
    .line 1111
    const-string v8, ".com.google.firebase.crashlytics"

    .line 1112
    .line 1113
    invoke-virtual {v7, v8}, Lmd2;->a(Ljava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    const-string v8, ".com.google.firebase.crashlytics-ndk"

    .line 1117
    .line 1118
    invoke-virtual {v7, v8}, Lmd2;->a(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    iget-object v8, v7, Lmd2;->b:Ljava/lang/Object;

    .line 1122
    .line 1123
    check-cast v8, Ljava/lang/String;

    .line 1124
    .line 1125
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 1126
    .line 1127
    .line 1128
    move-result v8

    .line 1129
    if-nez v8, :cond_1d

    .line 1130
    .line 1131
    const-string v8, ".com.google.firebase.crashlytics.files.v1"

    .line 1132
    .line 1133
    invoke-virtual {v7, v8}, Lmd2;->a(Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1137
    .line 1138
    const-string v9, ".com.google.firebase.crashlytics.files.v2"

    .line 1139
    .line 1140
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    sget-object v9, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 1144
    .line 1145
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v8

    .line 1152
    iget-object v9, v7, Lmd2;->c:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v9, Ljava/io/File;

    .line 1155
    .line 1156
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v10

    .line 1160
    if-eqz v10, :cond_1d

    .line 1161
    .line 1162
    new-instance v10, Lld2;

    .line 1163
    .line 1164
    invoke-direct {v10, v8}, Lld2;-><init>(Ljava/lang/String;)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v9, v10}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v8

    .line 1171
    if-eqz v8, :cond_1d

    .line 1172
    .line 1173
    array-length v9, v8

    .line 1174
    move v10, v1

    .line 1175
    :goto_10
    if-ge v10, v9, :cond_1d

    .line 1176
    .line 1177
    aget-object v11, v8, v10

    .line 1178
    .line 1179
    invoke-virtual {v7, v11}, Lmd2;->a(Ljava/lang/String;)V

    .line 1180
    .line 1181
    .line 1182
    add-int/lit8 v10, v10, 0x1

    .line 1183
    .line 1184
    goto :goto_10

    .line 1185
    :cond_1d
    invoke-virtual {v5}, Lwa1;->c()Ljava/util/NavigableSet;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v8

    .line 1189
    if-eqz v0, :cond_1e

    .line 1190
    .line 1191
    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1192
    .line 1193
    .line 1194
    :cond_1e
    invoke-interface {v8}, Ljava/util/Set;->size()I

    .line 1195
    .line 1196
    .line 1197
    move-result v0

    .line 1198
    move/from16 v9, v17

    .line 1199
    .line 1200
    if-gt v0, v9, :cond_1f

    .line 1201
    .line 1202
    goto :goto_12

    .line 1203
    :cond_1f
    :goto_11
    invoke-interface {v8}, Ljava/util/Set;->size()I

    .line 1204
    .line 1205
    .line 1206
    move-result v0

    .line 1207
    if-le v0, v9, :cond_21

    .line 1208
    .line 1209
    invoke-interface {v8}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    check-cast v0, Ljava/lang/String;

    .line 1214
    .line 1215
    const-string v10, "Removing session over cap: "

    .line 1216
    .line 1217
    invoke-static {v10, v0}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v10

    .line 1221
    const/4 v11, 0x3

    .line 1222
    invoke-static {v4, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v12

    .line 1226
    if-eqz v12, :cond_20

    .line 1227
    .line 1228
    const/4 v11, 0x0

    .line 1229
    invoke-static {v4, v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1230
    .line 1231
    .line 1232
    :cond_20
    new-instance v10, Ljava/io/File;

    .line 1233
    .line 1234
    iget-object v11, v7, Lmd2;->e:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v11, Ljava/io/File;

    .line 1237
    .line 1238
    invoke-direct {v10, v11, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    invoke-static {v10}, Lmd2;->e(Ljava/io/File;)Z

    .line 1242
    .line 1243
    .line 1244
    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    goto :goto_11

    .line 1248
    :cond_21
    :goto_12
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v8

    .line 1252
    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v0

    .line 1256
    if-eqz v0, :cond_32

    .line 1257
    .line 1258
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    move-object v9, v0

    .line 1263
    check-cast v9, Ljava/lang/String;

    .line 1264
    .line 1265
    const-string v0, "Finalizing report for session "

    .line 1266
    .line 1267
    invoke-static {v0, v9}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    const/4 v10, 0x2

    .line 1272
    invoke-static {v4, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v11

    .line 1276
    if-eqz v11, :cond_22

    .line 1277
    .line 1278
    const/4 v11, 0x0

    .line 1279
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1280
    .line 1281
    .line 1282
    :cond_22
    sget-object v10, Lwa1;->g:Lva1;

    .line 1283
    .line 1284
    sget-object v0, Lwa1;->i:Lg91;

    .line 1285
    .line 1286
    new-instance v11, Ljava/io/File;

    .line 1287
    .line 1288
    iget-object v12, v7, Lmd2;->e:Ljava/lang/Object;

    .line 1289
    .line 1290
    check-cast v12, Ljava/io/File;

    .line 1291
    .line 1292
    invoke-direct {v11, v12, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v11, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    invoke-static {v0}, Lmd2;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v11

    .line 1310
    if-eqz v11, :cond_24

    .line 1311
    .line 1312
    const-string v0, "Session "

    .line 1313
    .line 1314
    const-string v10, " has no events."

    .line 1315
    .line 1316
    invoke-static {v0, v9, v10}, Lf21;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v0

    .line 1320
    const/4 v10, 0x2

    .line 1321
    invoke-static {v4, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1322
    .line 1323
    .line 1324
    move-result v11

    .line 1325
    if-eqz v11, :cond_23

    .line 1326
    .line 1327
    const/4 v11, 0x0

    .line 1328
    invoke-static {v4, v0, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1329
    .line 1330
    .line 1331
    :cond_23
    const/4 v11, 0x3

    .line 1332
    const/4 v15, 0x0

    .line 1333
    :goto_14
    const/16 v18, 0x2

    .line 1334
    .line 1335
    goto/16 :goto_24

    .line 1336
    .line 1337
    :cond_24
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1338
    .line 1339
    .line 1340
    new-instance v11, Ljava/util/ArrayList;

    .line 1341
    .line 1342
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1343
    .line 1344
    .line 1345
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v12

    .line 1349
    move v13, v1

    .line 1350
    :goto_15
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1351
    .line 1352
    .line 1353
    move-result v0

    .line 1354
    if-eqz v0, :cond_27

    .line 1355
    .line 1356
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    move-object v14, v0

    .line 1361
    check-cast v14, Ljava/io/File;

    .line 1362
    .line 1363
    :try_start_4
    invoke-static {v14}, Lwa1;->e(Ljava/io/File;)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1368
    .line 1369
    .line 1370
    :try_start_5
    new-instance v15, Landroid/util/JsonReader;

    .line 1371
    .line 1372
    new-instance v1, Ljava/io/StringReader;

    .line 1373
    .line 1374
    invoke-direct {v1, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    invoke-direct {v15, v1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1378
    .line 1379
    .line 1380
    :try_start_6
    invoke-static {v15}, Lva1;->e(Landroid/util/JsonReader;)Lrz;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1384
    :try_start_7
    invoke-virtual {v15}, Landroid/util/JsonReader;->close()V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 1385
    .line 1386
    .line 1387
    :try_start_8
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1388
    .line 1389
    .line 1390
    if-nez v13, :cond_26

    .line 1391
    .line 1392
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    const-string v1, "event"

    .line 1397
    .line 1398
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v1

    .line 1402
    if-eqz v1, :cond_25

    .line 1403
    .line 1404
    const-string v1, "_"

    .line 1405
    .line 1406
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1407
    .line 1408
    .line 1409
    move-result v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 1410
    if-eqz v0, :cond_25

    .line 1411
    .line 1412
    goto :goto_16

    .line 1413
    :cond_25
    const/4 v0, 0x0

    .line 1414
    goto :goto_17

    .line 1415
    :catch_3
    move-exception v0

    .line 1416
    goto :goto_1a

    .line 1417
    :cond_26
    :goto_16
    move v0, v6

    .line 1418
    :goto_17
    move v13, v0

    .line 1419
    goto :goto_1b

    .line 1420
    :catch_4
    move-exception v0

    .line 1421
    goto :goto_19

    .line 1422
    :catchall_2
    move-exception v0

    .line 1423
    move-object v1, v0

    .line 1424
    :try_start_9
    invoke-virtual {v15}, Landroid/util/JsonReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1425
    .line 1426
    .line 1427
    goto :goto_18

    .line 1428
    :catchall_3
    move-exception v0

    .line 1429
    :try_start_a
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1430
    .line 1431
    .line 1432
    :goto_18
    throw v1
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    .line 1433
    :goto_19
    :try_start_b
    new-instance v1, Ljava/io/IOException;

    .line 1434
    .line 1435
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1436
    .line 1437
    .line 1438
    throw v1
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    .line 1439
    :goto_1a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1440
    .line 1441
    const-string v15, "Could not add event to report for "

    .line 1442
    .line 1443
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    invoke-static {v4, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1454
    .line 1455
    .line 1456
    :goto_1b
    const/4 v1, 0x0

    .line 1457
    goto :goto_15

    .line 1458
    :cond_27
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1459
    .line 1460
    .line 1461
    move-result v0

    .line 1462
    if-eqz v0, :cond_28

    .line 1463
    .line 1464
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1465
    .line 1466
    const-string v1, "Could not parse event files for session "

    .line 1467
    .line 1468
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    const/4 v11, 0x0

    .line 1479
    invoke-static {v4, v0, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1480
    .line 1481
    .line 1482
    move-object v15, v11

    .line 1483
    const/4 v11, 0x3

    .line 1484
    goto/16 :goto_14

    .line 1485
    .line 1486
    :cond_28
    new-instance v0, Lfk4;

    .line 1487
    .line 1488
    invoke-direct {v0, v7}, Lfk4;-><init>(Lmd2;)V

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v0, v9}, Lfk4;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    iget-object v1, v5, Lwa1;->d:Lh91;

    .line 1496
    .line 1497
    iget-object v1, v1, Lh91;->b:Lwr0;

    .line 1498
    .line 1499
    monitor-enter v1

    .line 1500
    :try_start_c
    iget-object v12, v1, Lwr0;->y:Ljava/lang/Object;

    .line 1501
    .line 1502
    check-cast v12, Ljava/lang/String;

    .line 1503
    .line 1504
    invoke-static {v12, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1505
    .line 1506
    .line 1507
    move-result v12

    .line 1508
    if-eqz v12, :cond_29

    .line 1509
    .line 1510
    iget-object v12, v1, Lwr0;->z:Ljava/lang/Object;

    .line 1511
    .line 1512
    check-cast v12, Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 1513
    .line 1514
    monitor-exit v1

    .line 1515
    goto :goto_1d

    .line 1516
    :cond_29
    :try_start_d
    iget-object v12, v1, Lwr0;->x:Ljava/lang/Object;

    .line 1517
    .line 1518
    check-cast v12, Lmd2;

    .line 1519
    .line 1520
    sget-object v14, Lwr0;->C:Lg91;

    .line 1521
    .line 1522
    new-instance v15, Ljava/io/File;

    .line 1523
    .line 1524
    iget-object v12, v12, Lmd2;->e:Ljava/lang/Object;

    .line 1525
    .line 1526
    check-cast v12, Ljava/io/File;

    .line 1527
    .line 1528
    invoke-direct {v15, v12, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v15}, Ljava/io/File;->mkdirs()Z

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v15, v14}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v12

    .line 1538
    invoke-static {v12}, Lmd2;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v12

    .line 1542
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1543
    .line 1544
    .line 1545
    move-result v14

    .line 1546
    if-eqz v14, :cond_2a

    .line 1547
    .line 1548
    const-string v12, "Unable to read App Quality Sessions session id."

    .line 1549
    .line 1550
    const-string v14, "FirebaseCrashlytics"

    .line 1551
    .line 1552
    const/4 v15, 0x0

    .line 1553
    invoke-static {v14, v12, v15}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1554
    .line 1555
    .line 1556
    const/4 v12, 0x0

    .line 1557
    goto :goto_1c

    .line 1558
    :cond_2a
    sget-object v14, Lwr0;->D:Lwh;

    .line 1559
    .line 1560
    invoke-static {v12, v14}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v12

    .line 1564
    check-cast v12, Ljava/io/File;

    .line 1565
    .line 1566
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v12

    .line 1570
    move/from16 v14, v16

    .line 1571
    .line 1572
    invoke-virtual {v12, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 1576
    :goto_1c
    monitor-exit v1

    .line 1577
    :goto_1d
    const-string v1, "report"

    .line 1578
    .line 1579
    invoke-virtual {v7, v9, v1}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v1

    .line 1583
    const-string v14, "appQualitySessionId: "

    .line 1584
    .line 1585
    :try_start_e
    invoke-static {v1}, Lwa1;->e(Ljava/io/File;)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v15

    .line 1589
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    invoke-static {v15}, Lva1;->i(Ljava/lang/String;)Lcz;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v10

    .line 1596
    invoke-virtual {v10}, Lcz;->a()Lbz;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v15

    .line 1600
    iget-object v10, v10, Lcz;->k:Lqa1;
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9

    .line 1601
    .line 1602
    if-eqz v10, :cond_2c

    .line 1603
    .line 1604
    :try_start_f
    invoke-virtual {v10}, Lqa1;->a()Lkz;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v10

    .line 1608
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v6

    .line 1612
    iput-object v6, v10, Lkz;->e:Ljava/lang/Long;

    .line 1613
    .line 1614
    iput-boolean v13, v10, Lkz;->f:Z

    .line 1615
    .line 1616
    iget-byte v6, v10, Lkz;->m:B
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    .line 1617
    .line 1618
    const/16 v18, 0x2

    .line 1619
    .line 1620
    or-int/lit8 v6, v6, 0x2

    .line 1621
    .line 1622
    int-to-byte v6, v6

    .line 1623
    :try_start_10
    iput-byte v6, v10, Lkz;->m:B

    .line 1624
    .line 1625
    if-eqz v0, :cond_2b

    .line 1626
    .line 1627
    new-instance v6, Ll00;

    .line 1628
    .line 1629
    invoke-direct {v6, v0}, Ll00;-><init>(Ljava/lang/String;)V

    .line 1630
    .line 1631
    .line 1632
    iput-object v6, v10, Lkz;->h:Lpa1;

    .line 1633
    .line 1634
    :cond_2b
    invoke-virtual {v10}, Lkz;->a()Llz;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    iput-object v0, v15, Lbz;->j:Lqa1;

    .line 1639
    .line 1640
    goto :goto_1e

    .line 1641
    :catch_5
    move-exception v0

    .line 1642
    const/16 v18, 0x2

    .line 1643
    .line 1644
    goto/16 :goto_21

    .line 1645
    .line 1646
    :cond_2c
    const/16 v18, 0x2

    .line 1647
    .line 1648
    :goto_1e
    invoke-virtual {v15}, Lbz;->a()Lcz;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v0

    .line 1652
    invoke-virtual {v0}, Lcz;->a()Lbz;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v6

    .line 1656
    iput-object v12, v6, Lbz;->g:Ljava/lang/String;

    .line 1657
    .line 1658
    iget-object v0, v0, Lcz;->k:Lqa1;

    .line 1659
    .line 1660
    if-eqz v0, :cond_2d

    .line 1661
    .line 1662
    invoke-virtual {v0}, Lqa1;->a()Lkz;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v0

    .line 1666
    iput-object v12, v0, Lkz;->c:Ljava/lang/String;

    .line 1667
    .line 1668
    invoke-virtual {v0}, Lkz;->a()Llz;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    iput-object v0, v6, Lbz;->j:Lqa1;

    .line 1673
    .line 1674
    :cond_2d
    invoke-virtual {v6}, Lbz;->a()Lcz;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    iget-object v6, v0, Lcz;->k:Lqa1;

    .line 1679
    .line 1680
    if-eqz v6, :cond_31

    .line 1681
    .line 1682
    invoke-virtual {v0}, Lcz;->a()Lbz;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-virtual {v6}, Lqa1;->a()Lkz;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v6

    .line 1690
    iput-object v11, v6, Lkz;->k:Ljava/util/List;

    .line 1691
    .line 1692
    invoke-virtual {v6}, Lkz;->a()Llz;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v6

    .line 1696
    iput-object v6, v0, Lbz;->j:Lqa1;

    .line 1697
    .line 1698
    invoke-virtual {v0}, Lbz;->a()Lcz;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v0

    .line 1702
    iget-object v6, v0, Lcz;->k:Lqa1;

    .line 1703
    .line 1704
    if-nez v6, :cond_2e

    .line 1705
    .line 1706
    const/4 v11, 0x3

    .line 1707
    const/4 v15, 0x0

    .line 1708
    goto :goto_24

    .line 1709
    :cond_2e
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1710
    .line 1711
    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v10
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    .line 1721
    const/4 v11, 0x3

    .line 1722
    :try_start_11
    invoke-static {v4, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v12
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_7

    .line 1726
    if-eqz v12, :cond_2f

    .line 1727
    .line 1728
    const/4 v15, 0x0

    .line 1729
    :try_start_12
    invoke-static {v4, v10, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1730
    .line 1731
    .line 1732
    goto :goto_1f

    .line 1733
    :cond_2f
    const/4 v15, 0x0

    .line 1734
    :goto_1f
    if-eqz v13, :cond_30

    .line 1735
    .line 1736
    check-cast v6, Llz;

    .line 1737
    .line 1738
    iget-object v6, v6, Llz;->b:Ljava/lang/String;

    .line 1739
    .line 1740
    new-instance v10, Ljava/io/File;

    .line 1741
    .line 1742
    iget-object v12, v7, Lmd2;->g:Ljava/lang/Object;

    .line 1743
    .line 1744
    check-cast v12, Ljava/io/File;

    .line 1745
    .line 1746
    invoke-direct {v10, v12, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1747
    .line 1748
    .line 1749
    goto :goto_20

    .line 1750
    :cond_30
    check-cast v6, Llz;

    .line 1751
    .line 1752
    iget-object v6, v6, Llz;->b:Ljava/lang/String;

    .line 1753
    .line 1754
    new-instance v10, Ljava/io/File;

    .line 1755
    .line 1756
    iget-object v12, v7, Lmd2;->f:Ljava/lang/Object;

    .line 1757
    .line 1758
    check-cast v12, Ljava/io/File;

    .line 1759
    .line 1760
    invoke-direct {v10, v12, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    :goto_20
    sget-object v6, Lva1;->a:Lji8;

    .line 1764
    .line 1765
    invoke-virtual {v6, v0}, Lji8;->u(Ljava/lang/Object;)Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    invoke-static {v10, v0}, Lwa1;->f(Ljava/io/File;Ljava/lang/String;)V

    .line 1770
    .line 1771
    .line 1772
    goto :goto_24

    .line 1773
    :catch_6
    move-exception v0

    .line 1774
    goto :goto_23

    .line 1775
    :catch_7
    move-exception v0

    .line 1776
    goto :goto_22

    .line 1777
    :catch_8
    move-exception v0

    .line 1778
    :goto_21
    const/4 v11, 0x3

    .line 1779
    :goto_22
    const/4 v15, 0x0

    .line 1780
    goto :goto_23

    .line 1781
    :cond_31
    const/4 v11, 0x3

    .line 1782
    const/4 v15, 0x0

    .line 1783
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1784
    .line 1785
    const-string v6, "Reports without sessions cannot have events added to them."

    .line 1786
    .line 1787
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1788
    .line 1789
    .line 1790
    throw v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_6

    .line 1791
    :catch_9
    move-exception v0

    .line 1792
    const/4 v11, 0x3

    .line 1793
    const/4 v15, 0x0

    .line 1794
    const/16 v18, 0x2

    .line 1795
    .line 1796
    :goto_23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1797
    .line 1798
    const-string v10, "Could not synthesize final report file for "

    .line 1799
    .line 1800
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1801
    .line 1802
    .line 1803
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v1

    .line 1810
    invoke-static {v4, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1811
    .line 1812
    .line 1813
    :goto_24
    new-instance v0, Ljava/io/File;

    .line 1814
    .line 1815
    iget-object v1, v7, Lmd2;->e:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v1, Ljava/io/File;

    .line 1818
    .line 1819
    invoke-direct {v0, v1, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1820
    .line 1821
    .line 1822
    invoke-static {v0}, Lmd2;->e(Ljava/io/File;)Z

    .line 1823
    .line 1824
    .line 1825
    const/4 v1, 0x0

    .line 1826
    const/4 v6, 0x1

    .line 1827
    const/16 v16, 0x4

    .line 1828
    .line 1829
    goto/16 :goto_13

    .line 1830
    .line 1831
    :catchall_4
    move-exception v0

    .line 1832
    :try_start_13
    monitor-exit v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 1833
    throw v0

    .line 1834
    :cond_32
    iget-object v0, v5, Lwa1;->c:Lz00;

    .line 1835
    .line 1836
    invoke-virtual {v0}, Lz00;->d()Lbo6;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v0

    .line 1840
    iget-object v0, v0, Lbo6;->a:Lbc4;

    .line 1841
    .line 1842
    invoke-virtual {v5}, Lwa1;->b()Ljava/util/ArrayList;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v0

    .line 1846
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1847
    .line 1848
    .line 1849
    move-result v1

    .line 1850
    const/4 v14, 0x4

    .line 1851
    if-gt v1, v14, :cond_33

    .line 1852
    .line 1853
    goto :goto_26

    .line 1854
    :cond_33
    invoke-virtual {v0, v14, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0

    .line 1858
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v0

    .line 1862
    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1863
    .line 1864
    .line 1865
    move-result v1

    .line 1866
    if-eqz v1, :cond_34

    .line 1867
    .line 1868
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v1

    .line 1872
    check-cast v1, Ljava/io/File;

    .line 1873
    .line 1874
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1875
    .line 1876
    .line 1877
    goto :goto_25

    .line 1878
    :cond_34
    :goto_26
    return-void
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/16 v7, 0x3e8

    .line 10
    .line 11
    div-long v9, v1, v7

    .line 12
    .line 13
    const-string v1, "Opening a new session with ID "

    .line 14
    .line 15
    invoke-static {v1, v3}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "FirebaseCrashlytics"

    .line 20
    .line 21
    const/4 v11, 0x3

    .line 22
    invoke-static {v2, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v12, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const-string v2, "FirebaseCrashlytics"

    .line 30
    .line 31
    invoke-static {v2, v1, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 35
    .line 36
    iget-object v1, v0, Lk91;->f:Lf83;

    .line 37
    .line 38
    iget-object v2, v0, Lk91;->h:Lwz0;

    .line 39
    .line 40
    iget-object v15, v1, Lf83;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v4, v2, Lwz0;->f:Ljava/lang/Object;

    .line 43
    .line 44
    move-object/from16 v16, v4

    .line 45
    .line 46
    check-cast v16, Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, v2, Lwz0;->g:Ljava/lang/Object;

    .line 49
    .line 50
    move-object/from16 v17, v4

    .line 51
    .line 52
    check-cast v17, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1}, Lf83;->c()Lv00;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v1, v1, Lv00;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, v2, Lwz0;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    const/16 v21, 0x1

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    const/4 v4, 0x4

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move/from16 v4, v21

    .line 71
    .line 72
    :goto_0
    invoke-static {v4}, Lf21;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v19

    .line 76
    iget-object v2, v2, Lwz0;->h:Ljava/lang/Object;

    .line 77
    .line 78
    move-object/from16 v20, v2

    .line 79
    .line 80
    check-cast v20, Ljz0;

    .line 81
    .line 82
    new-instance v14, Lq10;

    .line 83
    .line 84
    move-object/from16 v18, v1

    .line 85
    .line 86
    invoke-direct/range {v14 .. v20}, Lq10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjz0;)V

    .line 87
    .line 88
    .line 89
    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, Lsu0;->F()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    new-instance v4, Ls10;

    .line 98
    .line 99
    invoke-direct {v4, v2}, Ls10;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, Lk91;->a:Landroid/content/Context;

    .line 103
    .line 104
    new-instance v6, Landroid/os/StatFs;

    .line 105
    .line 106
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-direct {v6, v5}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockCount()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    move-wide/from16 v18, v7

    .line 122
    .line 123
    int-to-long v7, v5

    .line 124
    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSize()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    int-to-long v5, v5

    .line 129
    mul-long v27, v7, v5

    .line 130
    .line 131
    sget-object v5, Lru0;->w:Lru0;

    .line 132
    .line 133
    const-string v6, "FirebaseCrashlytics"

    .line 134
    .line 135
    sget-object v7, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    const/4 v11, 0x2

    .line 142
    if-eqz v8, :cond_2

    .line 143
    .line 144
    const-string v8, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    .line 145
    .line 146
    invoke-static {v6, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 147
    .line 148
    .line 149
    move-result v20

    .line 150
    if-eqz v20, :cond_4

    .line 151
    .line 152
    invoke-static {v6, v8, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    invoke-virtual {v7, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    sget-object v8, Lru0;->x:Ljava/util/HashMap;

    .line 161
    .line 162
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Lru0;

    .line 167
    .line 168
    if-nez v6, :cond_3

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    move-object v5, v6

    .line 172
    :cond_4
    :goto_1
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 173
    .line 174
    .line 175
    move-result v23

    .line 176
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 183
    .line 184
    .line 185
    move-result v24

    .line 186
    invoke-static {v2}, Lsu0;->f(Landroid/content/Context;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v25

    .line 190
    invoke-static {}, Lsu0;->E()Z

    .line 191
    .line 192
    .line 193
    move-result v29

    .line 194
    invoke-static {}, Lsu0;->s()I

    .line 195
    .line 196
    .line 197
    move-result v30

    .line 198
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 199
    .line 200
    sget-object v5, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 201
    .line 202
    new-instance v22, Lr10;

    .line 203
    .line 204
    invoke-direct/range {v22 .. v30}, Lr10;-><init>(IIJJZI)V

    .line 205
    .line 206
    .line 207
    move/from16 v20, v11

    .line 208
    .line 209
    move-object/from16 v6, v22

    .line 210
    .line 211
    iget-object v11, v0, Lk91;->j:Lq91;

    .line 212
    .line 213
    new-instance v12, Lp10;

    .line 214
    .line 215
    invoke-direct {v12, v14, v4, v6}, Lp10;-><init>(Lq10;Ls10;Lr10;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v3, v9, v10, v12}, Lq91;->d(Ljava/lang/String;JLp10;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_5

    .line 226
    .line 227
    if-eqz v3, :cond_5

    .line 228
    .line 229
    move-object v4, v2

    .line 230
    iget-object v2, v0, Lk91;->d:Lcw0;

    .line 231
    .line 232
    iget-object v6, v2, Lcw0;->y:Ljava/lang/Object;

    .line 233
    .line 234
    move-object v11, v6

    .line 235
    check-cast v11, Ljava/lang/String;

    .line 236
    .line 237
    monitor-enter v11

    .line 238
    :try_start_0
    iput-object v3, v2, Lcw0;->y:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v6, v2, Lcw0;->z:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v6, Ll90;

    .line 243
    .line 244
    iget-object v6, v6, Ll90;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v6, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    check-cast v6, Ljt3;

    .line 253
    .line 254
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :try_start_1
    new-instance v12, Ljava/util/HashMap;

    .line 256
    .line 257
    iget-object v14, v6, Ljt3;->a:Ljava/util/HashMap;

    .line 258
    .line 259
    invoke-direct {v12, v14}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 263
    .line 264
    .line 265
    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 266
    :try_start_2
    monitor-exit v6

    .line 267
    iget-object v6, v2, Lcw0;->B:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v6, Lv86;

    .line 270
    .line 271
    invoke-virtual {v6}, Lv86;->a()Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    iget-object v14, v2, Lcw0;->x:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v14, Lwr0;

    .line 278
    .line 279
    iget-object v14, v14, Lwr0;->y:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v14, Lya1;

    .line 282
    .line 283
    move-object/from16 v23, v1

    .line 284
    .line 285
    new-instance v1, Llm0;

    .line 286
    .line 287
    move-object/from16 v24, v5

    .line 288
    .line 289
    move-object v5, v6

    .line 290
    const/4 v6, 0x3

    .line 291
    move-object/from16 v31, v4

    .line 292
    .line 293
    move-object/from16 v17, v8

    .line 294
    .line 295
    move-object v4, v12

    .line 296
    move-object/from16 v12, v23

    .line 297
    .line 298
    move-object/from16 v32, v24

    .line 299
    .line 300
    const/4 v8, 0x4

    .line 301
    invoke-direct/range {v1 .. v6}, Llm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v14, v1}, Lya1;->a(Ljava/lang/Runnable;)Lyb9;

    .line 305
    .line 306
    .line 307
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 308
    goto :goto_3

    .line 309
    :catchall_0
    move-exception v0

    .line 310
    goto :goto_2

    .line 311
    :catchall_1
    move-exception v0

    .line 312
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 313
    :try_start_4
    throw v0

    .line 314
    :goto_2
    monitor-exit v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 315
    throw v0

    .line 316
    :cond_5
    move-object v12, v1

    .line 317
    move-object/from16 v31, v2

    .line 318
    .line 319
    move-object/from16 v32, v5

    .line 320
    .line 321
    move-object/from16 v17, v8

    .line 322
    .line 323
    const/4 v8, 0x4

    .line 324
    :goto_3
    iget-object v1, v0, Lk91;->i:Lqc3;

    .line 325
    .line 326
    iget-object v2, v1, Lqc3;->y:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v2, Lzc2;

    .line 329
    .line 330
    invoke-interface {v2}, Lzc2;->b()V

    .line 331
    .line 332
    .line 333
    sget-object v2, Lqc3;->C:Ltz2;

    .line 334
    .line 335
    iput-object v2, v1, Lqc3;->y:Ljava/lang/Object;

    .line 336
    .line 337
    if-nez v3, :cond_6

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_6
    iget-object v2, v1, Lqc3;->x:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v2, Lmd2;

    .line 343
    .line 344
    const-string v4, "userlog"

    .line 345
    .line 346
    invoke-virtual {v2, v3, v4}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    new-instance v4, Lhv5;

    .line 351
    .line 352
    invoke-direct {v4, v2}, Lhv5;-><init>(Ljava/io/File;)V

    .line 353
    .line 354
    .line 355
    iput-object v4, v1, Lqc3;->y:Ljava/lang/Object;

    .line 356
    .line 357
    :goto_4
    iget-object v1, v0, Lk91;->l:Lh91;

    .line 358
    .line 359
    invoke-virtual {v1, v3}, Lh91;->a(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    iget-object v0, v0, Lk91;->m:Lkd6;

    .line 363
    .line 364
    iget-object v1, v0, Lkd6;->x:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v1, Lsa1;

    .line 367
    .line 368
    sget-object v2, Lra1;->a:Ljava/nio/charset/Charset;

    .line 369
    .line 370
    new-instance v2, Lbz;

    .line 371
    .line 372
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 373
    .line 374
    .line 375
    const-string v4, "20.0.6"

    .line 376
    .line 377
    iput-object v4, v2, Lbz;->a:Ljava/lang/String;

    .line 378
    .line 379
    iget-object v4, v1, Lsa1;->c:Lwz0;

    .line 380
    .line 381
    iget-object v5, v4, Lwz0;->a:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v5, Ljava/lang/String;

    .line 384
    .line 385
    if-eqz v5, :cond_18

    .line 386
    .line 387
    iput-object v5, v2, Lbz;->b:Ljava/lang/String;

    .line 388
    .line 389
    iget-object v5, v1, Lsa1;->b:Lf83;

    .line 390
    .line 391
    invoke-virtual {v5}, Lf83;->c()Lv00;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    iget-object v6, v6, Lv00;->a:Ljava/lang/String;

    .line 396
    .line 397
    if-eqz v6, :cond_17

    .line 398
    .line 399
    iput-object v6, v2, Lbz;->d:Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v5}, Lf83;->c()Lv00;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    iget-object v6, v6, Lv00;->b:Ljava/lang/String;

    .line 406
    .line 407
    iput-object v6, v2, Lbz;->e:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v5}, Lf83;->c()Lv00;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    iget-object v6, v6, Lv00;->c:Ljava/lang/String;

    .line 414
    .line 415
    iput-object v6, v2, Lbz;->f:Ljava/lang/String;

    .line 416
    .line 417
    iget-object v6, v4, Lwz0;->f:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v6, Ljava/lang/String;

    .line 420
    .line 421
    if-eqz v6, :cond_16

    .line 422
    .line 423
    iput-object v6, v2, Lbz;->h:Ljava/lang/String;

    .line 424
    .line 425
    iget-object v11, v4, Lwz0;->g:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v11, Ljava/lang/String;

    .line 428
    .line 429
    if-eqz v11, :cond_15

    .line 430
    .line 431
    iput-object v11, v2, Lbz;->i:Ljava/lang/String;

    .line 432
    .line 433
    iput v8, v2, Lbz;->c:I

    .line 434
    .line 435
    iget-byte v14, v2, Lbz;->m:B

    .line 436
    .line 437
    or-int/lit8 v14, v14, 0x1

    .line 438
    .line 439
    int-to-byte v14, v14

    .line 440
    iput-byte v14, v2, Lbz;->m:B

    .line 441
    .line 442
    new-instance v14, Lkz;

    .line 443
    .line 444
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 445
    .line 446
    .line 447
    move/from16 v30, v8

    .line 448
    .line 449
    const/4 v8, 0x0

    .line 450
    iput-boolean v8, v14, Lkz;->f:Z

    .line 451
    .line 452
    iget-byte v8, v14, Lkz;->m:B

    .line 453
    .line 454
    or-int/lit8 v8, v8, 0x2

    .line 455
    .line 456
    int-to-byte v8, v8

    .line 457
    iput-wide v9, v14, Lkz;->d:J

    .line 458
    .line 459
    or-int/lit8 v8, v8, 0x1

    .line 460
    .line 461
    int-to-byte v8, v8

    .line 462
    iput-byte v8, v14, Lkz;->m:B

    .line 463
    .line 464
    if-eqz v3, :cond_14

    .line 465
    .line 466
    iput-object v3, v14, Lkz;->b:Ljava/lang/String;

    .line 467
    .line 468
    sget-object v3, Lsa1;->g:Ljava/lang/String;

    .line 469
    .line 470
    if-eqz v3, :cond_13

    .line 471
    .line 472
    iput-object v3, v14, Lkz;->a:Ljava/lang/String;

    .line 473
    .line 474
    iget-object v3, v5, Lf83;->c:Ljava/lang/String;

    .line 475
    .line 476
    if-eqz v3, :cond_12

    .line 477
    .line 478
    invoke-virtual {v5}, Lf83;->c()Lv00;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    iget-object v5, v5, Lv00;->a:Ljava/lang/String;

    .line 483
    .line 484
    iget-object v4, v4, Lwz0;->h:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v4, Ljz0;

    .line 487
    .line 488
    iget-object v8, v4, Ljz0;->y:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v8, Lyt1;

    .line 491
    .line 492
    if-nez v8, :cond_7

    .line 493
    .line 494
    new-instance v8, Lyt1;

    .line 495
    .line 496
    invoke-direct {v8, v4}, Lyt1;-><init>(Ljz0;)V

    .line 497
    .line 498
    .line 499
    iput-object v8, v4, Ljz0;->y:Ljava/lang/Object;

    .line 500
    .line 501
    :cond_7
    iget-object v8, v4, Ljz0;->y:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v8, Lyt1;

    .line 504
    .line 505
    iget-object v9, v8, Lyt1;->w:Ljava/lang/String;

    .line 506
    .line 507
    if-nez v8, :cond_8

    .line 508
    .line 509
    new-instance v8, Lyt1;

    .line 510
    .line 511
    invoke-direct {v8, v4}, Lyt1;-><init>(Ljz0;)V

    .line 512
    .line 513
    .line 514
    iput-object v8, v4, Ljz0;->y:Ljava/lang/Object;

    .line 515
    .line 516
    :cond_8
    iget-object v4, v4, Ljz0;->y:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v4, Lyt1;

    .line 519
    .line 520
    iget-object v4, v4, Lyt1;->x:Ljava/lang/String;

    .line 521
    .line 522
    new-instance v23, Lmz;

    .line 523
    .line 524
    move-object/from16 v24, v3

    .line 525
    .line 526
    move-object/from16 v29, v4

    .line 527
    .line 528
    move-object/from16 v27, v5

    .line 529
    .line 530
    move-object/from16 v25, v6

    .line 531
    .line 532
    move-object/from16 v28, v9

    .line 533
    .line 534
    move-object/from16 v26, v11

    .line 535
    .line 536
    invoke-direct/range {v23 .. v29}, Lmz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v3, v23

    .line 540
    .line 541
    iput-object v3, v14, Lkz;->g:Ly91;

    .line 542
    .line 543
    new-instance v3, Lj00;

    .line 544
    .line 545
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 546
    .line 547
    .line 548
    const/4 v4, 0x3

    .line 549
    iput v4, v3, Lj00;->a:I

    .line 550
    .line 551
    iget-byte v4, v3, Lj00;->e:B

    .line 552
    .line 553
    or-int/lit8 v4, v4, 0x1

    .line 554
    .line 555
    int-to-byte v4, v4

    .line 556
    iput-byte v4, v3, Lj00;->e:B

    .line 557
    .line 558
    if-eqz v15, :cond_11

    .line 559
    .line 560
    iput-object v15, v3, Lj00;->b:Ljava/lang/String;

    .line 561
    .line 562
    if-eqz v12, :cond_10

    .line 563
    .line 564
    iput-object v12, v3, Lj00;->c:Ljava/lang/String;

    .line 565
    .line 566
    invoke-static {}, Lsu0;->F()Z

    .line 567
    .line 568
    .line 569
    move-result v4

    .line 570
    iput-boolean v4, v3, Lj00;->d:Z

    .line 571
    .line 572
    iget-byte v4, v3, Lj00;->e:B

    .line 573
    .line 574
    or-int/lit8 v4, v4, 0x2

    .line 575
    .line 576
    int-to-byte v4, v4

    .line 577
    iput-byte v4, v3, Lj00;->e:B

    .line 578
    .line 579
    invoke-virtual {v3}, Lj00;->a()Lk00;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    iput-object v3, v14, Lkz;->i:Loa1;

    .line 584
    .line 585
    new-instance v3, Landroid/os/StatFs;

    .line 586
    .line 587
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    invoke-direct {v3, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    const/4 v5, 0x7

    .line 603
    if-eqz v4, :cond_9

    .line 604
    .line 605
    goto :goto_5

    .line 606
    :cond_9
    sget-object v4, Lsa1;->f:Ljava/util/HashMap;

    .line 607
    .line 608
    invoke-virtual {v7, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    check-cast v4, Ljava/lang/Integer;

    .line 617
    .line 618
    if-nez v4, :cond_a

    .line 619
    .line 620
    goto :goto_5

    .line 621
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v5

    .line 625
    :goto_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    invoke-virtual {v4}, Ljava/lang/Runtime;->availableProcessors()I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    iget-object v1, v1, Lsa1;->a:Landroid/content/Context;

    .line 634
    .line 635
    invoke-static {v1}, Lsu0;->f(Landroid/content/Context;)J

    .line 636
    .line 637
    .line 638
    move-result-wide v6

    .line 639
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    int-to-long v8, v1

    .line 644
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    int-to-long v10, v1

    .line 649
    mul-long/2addr v8, v10

    .line 650
    invoke-static {}, Lsu0;->E()Z

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    invoke-static {}, Lsu0;->s()I

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    new-instance v10, Loz;

    .line 659
    .line 660
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 661
    .line 662
    .line 663
    iput v5, v10, Loz;->a:I

    .line 664
    .line 665
    iget-byte v5, v10, Loz;->j:B

    .line 666
    .line 667
    or-int/lit8 v5, v5, 0x1

    .line 668
    .line 669
    int-to-byte v5, v5

    .line 670
    iput-byte v5, v10, Loz;->j:B

    .line 671
    .line 672
    if-eqz v17, :cond_f

    .line 673
    .line 674
    move-object/from16 v11, v17

    .line 675
    .line 676
    iput-object v11, v10, Loz;->b:Ljava/lang/String;

    .line 677
    .line 678
    iput v4, v10, Loz;->c:I

    .line 679
    .line 680
    or-int/lit8 v4, v5, 0x2

    .line 681
    .line 682
    int-to-byte v4, v4

    .line 683
    iput-wide v6, v10, Loz;->d:J

    .line 684
    .line 685
    or-int/lit8 v4, v4, 0x4

    .line 686
    .line 687
    int-to-byte v4, v4

    .line 688
    iput-wide v8, v10, Loz;->e:J

    .line 689
    .line 690
    or-int/lit8 v4, v4, 0x8

    .line 691
    .line 692
    int-to-byte v4, v4

    .line 693
    iput-boolean v1, v10, Loz;->f:Z

    .line 694
    .line 695
    or-int/lit8 v1, v4, 0x10

    .line 696
    .line 697
    int-to-byte v1, v1

    .line 698
    iput v3, v10, Loz;->g:I

    .line 699
    .line 700
    or-int/lit8 v1, v1, 0x20

    .line 701
    .line 702
    int-to-byte v1, v1

    .line 703
    iput-byte v1, v10, Loz;->j:B

    .line 704
    .line 705
    move-object/from16 v4, v31

    .line 706
    .line 707
    if-eqz v4, :cond_e

    .line 708
    .line 709
    iput-object v4, v10, Loz;->h:Ljava/lang/String;

    .line 710
    .line 711
    move-object/from16 v1, v32

    .line 712
    .line 713
    if-eqz v1, :cond_d

    .line 714
    .line 715
    iput-object v1, v10, Loz;->i:Ljava/lang/String;

    .line 716
    .line 717
    invoke-virtual {v10}, Loz;->a()Lpz;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    iput-object v1, v14, Lkz;->j:Lz91;

    .line 722
    .line 723
    const/4 v4, 0x3

    .line 724
    iput v4, v14, Lkz;->l:I

    .line 725
    .line 726
    iget-byte v1, v14, Lkz;->m:B

    .line 727
    .line 728
    or-int/lit8 v1, v1, 0x4

    .line 729
    .line 730
    int-to-byte v1, v1

    .line 731
    iput-byte v1, v14, Lkz;->m:B

    .line 732
    .line 733
    invoke-virtual {v14}, Lkz;->a()Llz;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    iput-object v1, v2, Lbz;->j:Lqa1;

    .line 738
    .line 739
    invoke-virtual {v2}, Lbz;->a()Lcz;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    iget-object v0, v0, Lkd6;->y:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, Lwa1;

    .line 746
    .line 747
    iget-object v0, v0, Lwa1;->b:Lmd2;

    .line 748
    .line 749
    const-string v2, "FirebaseCrashlytics"

    .line 750
    .line 751
    iget-object v3, v1, Lcz;->k:Lqa1;

    .line 752
    .line 753
    if-nez v3, :cond_b

    .line 754
    .line 755
    const-string v0, "Could not get session for report"

    .line 756
    .line 757
    const/4 v4, 0x3

    .line 758
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    if-eqz v1, :cond_c

    .line 763
    .line 764
    const/4 v1, 0x0

    .line 765
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :cond_b
    move-object v4, v3

    .line 770
    check-cast v4, Llz;

    .line 771
    .line 772
    iget-object v4, v4, Llz;->b:Ljava/lang/String;

    .line 773
    .line 774
    :try_start_5
    sget-object v5, Lwa1;->g:Lva1;

    .line 775
    .line 776
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    sget-object v5, Lva1;->a:Lji8;

    .line 780
    .line 781
    invoke-virtual {v5, v1}, Lji8;->u(Ljava/lang/Object;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    const-string v5, "report"

    .line 786
    .line 787
    invoke-virtual {v0, v4, v5}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    invoke-static {v5, v1}, Lwa1;->f(Ljava/io/File;Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    const-string v1, "start-time"

    .line 795
    .line 796
    invoke-virtual {v0, v4, v1}, Lmd2;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    const-string v1, ""

    .line 801
    .line 802
    check-cast v3, Llz;

    .line 803
    .line 804
    iget-wide v5, v3, Llz;->d:J

    .line 805
    .line 806
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 807
    .line 808
    new-instance v7, Ljava/io/FileOutputStream;

    .line 809
    .line 810
    invoke-direct {v7, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 811
    .line 812
    .line 813
    sget-object v8, Lwa1;->e:Ljava/nio/charset/Charset;

    .line 814
    .line 815
    invoke-direct {v3, v7, v8}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 816
    .line 817
    .line 818
    :try_start_6
    invoke-virtual {v3, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    mul-long v5, v5, v18

    .line 822
    .line 823
    invoke-virtual {v0, v5, v6}, Ljava/io/File;->setLastModified(J)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 824
    .line 825
    .line 826
    :try_start_7
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 827
    .line 828
    .line 829
    return-void

    .line 830
    :catchall_2
    move-exception v0

    .line 831
    move-object v1, v0

    .line 832
    :try_start_8
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 833
    .line 834
    .line 835
    goto :goto_6

    .line 836
    :catchall_3
    move-exception v0

    .line 837
    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 838
    .line 839
    .line 840
    :goto_6
    throw v1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 841
    :catch_0
    move-exception v0

    .line 842
    const-string v1, "Could not persist report for session "

    .line 843
    .line 844
    invoke-static {v1, v4}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    const/4 v4, 0x3

    .line 849
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    if-eqz v3, :cond_c

    .line 854
    .line 855
    invoke-static {v2, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 856
    .line 857
    .line 858
    :cond_c
    return-void

    .line 859
    :cond_d
    const-string v0, "Null modelClass"

    .line 860
    .line 861
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    return-void

    .line 865
    :cond_e
    const-string v0, "Null manufacturer"

    .line 866
    .line 867
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :cond_f
    const-string v0, "Null model"

    .line 872
    .line 873
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    return-void

    .line 877
    :cond_10
    const-string v0, "Null buildVersion"

    .line 878
    .line 879
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    return-void

    .line 883
    :cond_11
    const-string v0, "Null version"

    .line 884
    .line 885
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :cond_12
    const-string v0, "Null identifier"

    .line 890
    .line 891
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    return-void

    .line 895
    :cond_13
    const-string v0, "Null generator"

    .line 896
    .line 897
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    return-void

    .line 901
    :cond_14
    const-string v0, "Null identifier"

    .line 902
    .line 903
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    return-void

    .line 907
    :cond_15
    const-string v0, "Null displayVersion"

    .line 908
    .line 909
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    return-void

    .line 913
    :cond_16
    const-string v0, "Null buildVersion"

    .line 914
    .line 915
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    return-void

    .line 919
    :cond_17
    const-string v0, "Null installationUuid"

    .line 920
    .line 921
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    return-void

    .line 925
    :cond_18
    const-string v0, "Null gmpAppId"

    .line 926
    .line 927
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    return-void
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method

.method public final d(Lz00;)Z
    .locals 5

    .line 1
    invoke-static {}, Lwr0;->p()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk91;->n:Lxa1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "FirebaseCrashlytics"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lxa1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string p0, "Skipping session finalization because a crash has already occurred."

    .line 21
    .line 22
    invoke-static {v3, p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const-string v4, "Finalizing previously open sessions."

    .line 34
    .line 35
    invoke-static {v3, v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v4, 0x1

    .line 39
    :try_start_0
    invoke-virtual {p0, v4, p1, v4}, Lk91;->b(ZLz00;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    const-string p0, "Closed all previously open sessions."

    .line 49
    .line 50
    invoke-static {v3, p0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    .line 52
    .line 53
    :cond_2
    return v4

    .line 54
    :catch_0
    move-exception p0

    .line 55
    const-string p1, "Unable to finalize previously open sessions."

    .line 56
    .line 57
    invoke-static {v3, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    return v2
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final e()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "com.google.firebase.crashlytics.version_control_info"

    .line 2
    .line 3
    const-string v1, "string"

    .line 4
    .line 5
    iget-object p0, p0, Lk91;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lsu0;->v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move-object p0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    const/4 v0, 0x3

    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v3, "FirebaseCrashlytics"

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const-string v0, "Read version control info from string resource"

    .line 37
    .line 38
    invoke-static {v3, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object v0, Lk91;->s:Ljava/nio/charset/Charset;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    const-class p0, Lk91;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    const-string p0, "Couldn\'t get Class Loader"

    .line 61
    .line 62
    invoke-static {v3, p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    move-object p0, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const-string v4, "META-INF/version-control-info.textproto"

    .line 68
    .line 69
    invoke-virtual {p0, v4}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_1
    if-eqz p0, :cond_6

    .line 74
    .line 75
    :try_start_0
    const-string v4, "Read version control info from file"

    .line 76
    .line 77
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-static {v3, v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    .line 85
    .line 86
    :cond_4
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    .line 90
    .line 91
    const/16 v1, 0x400

    .line 92
    .line 93
    :try_start_1
    new-array v1, v1, [B

    .line 94
    .line 95
    :goto_2
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/4 v4, -0x1

    .line 100
    if-eq v3, v4, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v1

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 109
    .line 110
    .line 111
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 113
    .line 114
    .line 115
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 119
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_5

    .line 125
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :catchall_2
    move-exception v0

    .line 130
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    :goto_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 134
    :goto_5
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :catchall_3
    move-exception p0

    .line 139
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :goto_6
    throw v0

    .line 143
    :cond_6
    if-eqz p0, :cond_7

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 146
    .line 147
    .line 148
    :cond_7
    const-string p0, "No version control information found"

    .line 149
    .line 150
    invoke-static {v3, p0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 151
    .line 152
    .line 153
    return-object v1
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final f()V
    .locals 4

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lk91;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_1
    iget-object v3, p0, Lk91;->d:Lcw0;

    .line 11
    .line 12
    invoke-virtual {v3, v1}, Lcw0;->j(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception v1

    .line 17
    :try_start_2
    iget-object p0, p0, Lk91;->a:Landroid/content/Context;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 26
    .line 27
    and-int/lit8 p0, p0, 0x2

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    throw v1

    .line 33
    :cond_1
    :goto_0
    const-string p0, "Attempting to set custom attribute with null key, ignoring."

    .line 34
    .line 35
    invoke-static {v0, p0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :goto_1
    const-string p0, "Saved version control info"

    .line 39
    .line 40
    invoke-static {v0, p0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_1
    move-exception p0

    .line 45
    const-string v1, "Unable to save version control info"

    .line 46
    .line 47
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_2
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final g(Lyb9;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk91;->o:Lxb7;

    .line 2
    .line 3
    const-string v1, "FirebaseCrashlytics"

    .line 4
    .line 5
    iget-object v2, p0, Lk91;->m:Lkd6;

    .line 6
    .line 7
    iget-object v2, v2, Lkd6;->y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lwa1;

    .line 10
    .line 11
    iget-object v2, v2, Lwa1;->b:Lmd2;

    .line 12
    .line 13
    iget-object v3, v2, Lmd2;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, Lmd2;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v3, v2, Lmd2;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, Lmd2;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object v2, v2, Lmd2;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/io/File;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Lmd2;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const-string p0, "No crash reports are available to be sent."

    .line 70
    .line 71
    const/4 p1, 0x2

    .line 72
    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-static {v1, p0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Lxb7;->d(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    :goto_0
    sget-object v2, Lg22;->D:Lg22;

    .line 88
    .line 89
    const-string v3, "Crash reports are available to be sent."

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lg22;->u(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p0, Lk91;->b:Lge1;

    .line 95
    .line 96
    invoke-virtual {v3}, Lge1;->a()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    const-string v2, "Automatic data collection is enabled. Allowing upload."

    .line 103
    .line 104
    const/4 v3, 0x3

    .line 105
    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    invoke-static {v1, v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lxb7;->d(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-static {v0}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const-string v1, "Automatic data collection is disabled."

    .line 127
    .line 128
    invoke-virtual {v2, v1}, Lg22;->o(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v1, "Notifying that unsent reports are available."

    .line 132
    .line 133
    invoke-virtual {v2, v1}, Lg22;->u(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lxb7;->d(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v0, v3, Lge1;->x:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v0

    .line 144
    :try_start_0
    iget-object v1, v3, Lge1;->z:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Lxb7;

    .line 147
    .line 148
    iget-object v1, v1, Lxb7;->a:Lyb9;

    .line 149
    .line 150
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    new-instance v0, Lpe2;

    .line 152
    .line 153
    const/16 v3, 0x19

    .line 154
    .line 155
    invoke-direct {v0, v3}, Lpe2;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    sget-object v3, Lyb7;->a:Liy2;

    .line 162
    .line 163
    new-instance v4, Lyb9;

    .line 164
    .line 165
    invoke-direct {v4}, Lyb9;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance v5, La09;

    .line 169
    .line 170
    invoke-direct {v5, v3, v0, v4}, La09;-><init>(Ljava/util/concurrent/Executor;Le77;Lyb9;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v1, Lyb9;->b:Lzc9;

    .line 174
    .line 175
    invoke-virtual {v0, v5}, Lzc9;->g(Lk99;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Lyb9;->r()V

    .line 179
    .line 180
    .line 181
    const-string v0, "Waiting for send/deleteUnsentReports to be called."

    .line 182
    .line 183
    invoke-virtual {v2, v0}, Lg22;->o(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lk91;->p:Lxb7;

    .line 187
    .line 188
    iget-object v0, v0, Lxb7;->a:Lyb9;

    .line 189
    .line 190
    invoke-static {v4, v0}, Lrj1;->C(Lyb9;Lyb9;)Lyb9;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_1
    iget-object v1, p0, Lk91;->e:Lwr0;

    .line 195
    .line 196
    iget-object v1, v1, Lwr0;->x:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Lya1;

    .line 199
    .line 200
    new-instance v2, Ljz0;

    .line 201
    .line 202
    const/4 v3, 0x5

    .line 203
    const/4 v4, 0x0

    .line 204
    invoke-direct {v2, p0, v4, p1, v3}, Ljz0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1, v2}, Lyb9;->l(Ljava/util/concurrent/Executor;Le77;)Lyb9;

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :catchall_0
    move-exception p0

    .line 212
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    throw p0
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method
