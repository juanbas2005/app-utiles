.class public final Lys2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lws2;


# instance fields
.field public A:Lxs2;

.field public B:I

.field public C:Ljava/util/List;

.field public final D:Ljava/util/List;

.field public E:Lqz3;

.field public F:Lqz3;

.field public G:Lvw3;

.field public H:Luq4;

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:La42;

.field public O:Lrm;

.field public P:Z

.field public final Q:Ljava/util/LinkedHashMap;

.field public R:Ljava/lang/Boolean;

.field public S:Z

.field public final synthetic T:Lzs2;

.field public w:Lbq7;

.field public x:Lvj1;

.field public y:Lfl4;

.field public z:Lus1;


# direct methods
.method public constructor <init>(Lzs2;Lbq7;Lvj1;Lfl4;Lus1;ILjava/util/List;Ljava/util/List;Lqz3;Lvw3;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_7

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p3, :cond_6

    .line 7
    .line 8
    if-eqz p4, :cond_5

    .line 9
    .line 10
    if-eqz p5, :cond_4

    .line 11
    .line 12
    if-eqz p6, :cond_3

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    if-eqz p8, :cond_1

    .line 17
    .line 18
    if-eqz p10, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lys2;->T:Lzs2;

    .line 24
    .line 25
    iput-object v0, p0, Lys2;->A:Lxs2;

    .line 26
    .line 27
    iget-object v3, p1, Lzs2;->F:Lqz3;

    .line 28
    .line 29
    iput-object v3, p0, Lys2;->F:Lqz3;

    .line 30
    .line 31
    iput-boolean v2, p0, Lys2;->I:Z

    .line 32
    .line 33
    iput-boolean v1, p0, Lys2;->J:Z

    .line 34
    .line 35
    iput-boolean v1, p0, Lys2;->K:Z

    .line 36
    .line 37
    iput-boolean v1, p0, Lys2;->L:Z

    .line 38
    .line 39
    iget-boolean v2, p1, Lzs2;->O:Z

    .line 40
    .line 41
    iput-boolean v2, p0, Lys2;->M:Z

    .line 42
    .line 43
    iput-object v0, p0, Lys2;->N:La42;

    .line 44
    .line 45
    iput-object v0, p0, Lys2;->O:Lrm;

    .line 46
    .line 47
    iget-boolean p1, p1, Lzs2;->P:Z

    .line 48
    .line 49
    iput-boolean p1, p0, Lys2;->P:Z

    .line 50
    .line 51
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lys2;->Q:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    iput-object v0, p0, Lys2;->R:Ljava/lang/Boolean;

    .line 59
    .line 60
    iput-boolean v1, p0, Lys2;->S:Z

    .line 61
    .line 62
    iput-object p2, p0, Lys2;->w:Lbq7;

    .line 63
    .line 64
    iput-object p3, p0, Lys2;->x:Lvj1;

    .line 65
    .line 66
    iput-object p4, p0, Lys2;->y:Lfl4;

    .line 67
    .line 68
    iput-object p5, p0, Lys2;->z:Lus1;

    .line 69
    .line 70
    iput p6, p0, Lys2;->B:I

    .line 71
    .line 72
    iput-object p7, p0, Lys2;->C:Ljava/util/List;

    .line 73
    .line 74
    iput-object p8, p0, Lys2;->D:Ljava/util/List;

    .line 75
    .line 76
    iput-object p9, p0, Lys2;->E:Lqz3;

    .line 77
    .line 78
    iput-object p10, p0, Lys2;->G:Lvw3;

    .line 79
    .line 80
    iput-object v0, p0, Lys2;->H:Luq4;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    const/4 p0, 0x7

    .line 84
    invoke-static {p0}, Lys2;->b(I)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_1
    const/4 p0, 0x6

    .line 89
    invoke-static {p0}, Lys2;->b(I)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_2
    const/4 p0, 0x5

    .line 94
    invoke-static {p0}, Lys2;->b(I)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_3
    const/4 p0, 0x4

    .line 99
    invoke-static {p0}, Lys2;->b(I)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_4
    const/4 p0, 0x3

    .line 104
    invoke-static {p0}, Lys2;->b(I)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :cond_5
    const/4 p0, 0x2

    .line 109
    invoke-static {p0}, Lys2;->b(I)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_6
    invoke-static {v2}, Lys2;->b(I)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_7
    invoke-static {v1}, Lys2;->b(I)V

    .line 118
    .line 119
    .line 120
    throw v0
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
.end method

.method public static synthetic b(I)V
    .locals 17

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    .line 8
    .line 9
    :goto_0
    const/4 v1, 0x2

    .line 10
    packed-switch p0, :pswitch_data_1

    .line 11
    .line 12
    .line 13
    :pswitch_2
    const/4 v2, 0x3

    .line 14
    goto :goto_1

    .line 15
    :pswitch_3
    move v2, v1

    .line 16
    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    packed-switch p0, :pswitch_data_2

    .line 22
    .line 23
    .line 24
    :pswitch_4
    const-string v5, "substitution"

    .line 25
    .line 26
    aput-object v5, v2, v4

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :pswitch_5
    const-string v5, "userDataKey"

    .line 30
    .line 31
    aput-object v5, v2, v4

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :pswitch_6
    const-string v5, "additionalAnnotations"

    .line 35
    .line 36
    aput-object v5, v2, v4

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :pswitch_7
    const-string v5, "contextReceiverParameters"

    .line 40
    .line 41
    aput-object v5, v2, v4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_8
    const-string v5, "type"

    .line 45
    .line 46
    aput-object v5, v2, v4

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :pswitch_9
    const-string v5, "parameters"

    .line 50
    .line 51
    aput-object v5, v2, v4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_a
    const-string v5, "name"

    .line 55
    .line 56
    aput-object v5, v2, v4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :pswitch_b
    const-string v5, "visibility"

    .line 60
    .line 61
    aput-object v5, v2, v4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :pswitch_c
    const-string v5, "modality"

    .line 65
    .line 66
    aput-object v5, v2, v4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :pswitch_d
    aput-object v3, v2, v4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :pswitch_e
    const-string v5, "owner"

    .line 73
    .line 74
    aput-object v5, v2, v4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :pswitch_f
    const-string v5, "newReturnType"

    .line 78
    .line 79
    aput-object v5, v2, v4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :pswitch_10
    const-string v5, "newContextReceiverParameters"

    .line 83
    .line 84
    aput-object v5, v2, v4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :pswitch_11
    const-string v5, "newValueParameterDescriptors"

    .line 88
    .line 89
    aput-object v5, v2, v4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :pswitch_12
    const-string v5, "kind"

    .line 93
    .line 94
    aput-object v5, v2, v4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_13
    const-string v5, "newVisibility"

    .line 98
    .line 99
    aput-object v5, v2, v4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :pswitch_14
    const-string v5, "newModality"

    .line 103
    .line 104
    aput-object v5, v2, v4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :pswitch_15
    const-string v5, "newOwner"

    .line 108
    .line 109
    aput-object v5, v2, v4

    .line 110
    .line 111
    :goto_2
    const-string v4, "setOwner"

    .line 112
    .line 113
    const-string v5, "setModality"

    .line 114
    .line 115
    const-string v6, "setVisibility"

    .line 116
    .line 117
    const-string v7, "setKind"

    .line 118
    .line 119
    const-string v8, "setName"

    .line 120
    .line 121
    const-string v9, "setValueParameters"

    .line 122
    .line 123
    const-string v10, "setTypeParameters"

    .line 124
    .line 125
    const-string v11, "setReturnType"

    .line 126
    .line 127
    const-string v12, "setContextReceiverParameters"

    .line 128
    .line 129
    const-string v13, "setAdditionalAnnotations"

    .line 130
    .line 131
    const-string v14, "setSubstitution"

    .line 132
    .line 133
    const-string v15, "putUserData"

    .line 134
    .line 135
    const/16 v16, 0x1

    .line 136
    .line 137
    packed-switch p0, :pswitch_data_3

    .line 138
    .line 139
    .line 140
    :pswitch_16
    aput-object v3, v2, v16

    .line 141
    .line 142
    goto/16 :goto_3

    .line 143
    .line 144
    :pswitch_17
    const-string v3, "setJustForTypeSubstitution"

    .line 145
    .line 146
    aput-object v3, v2, v16

    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :pswitch_18
    const-string v3, "getSubstitution"

    .line 151
    .line 152
    aput-object v3, v2, v16

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :pswitch_19
    aput-object v15, v2, v16

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :pswitch_1a
    aput-object v14, v2, v16

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :pswitch_1b
    aput-object v13, v2, v16

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :pswitch_1c
    const-string v3, "setHiddenForResolutionEverywhereBesideSupercalls"

    .line 165
    .line 166
    aput-object v3, v2, v16

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :pswitch_1d
    const-string v3, "setHiddenToOvercomeSignatureClash"

    .line 170
    .line 171
    aput-object v3, v2, v16

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :pswitch_1e
    const-string v3, "setDropOriginalInContainingParts"

    .line 175
    .line 176
    aput-object v3, v2, v16

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_1f
    const-string v3, "setPreserveSourceElement"

    .line 180
    .line 181
    aput-object v3, v2, v16

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :pswitch_20
    const-string v3, "setSignatureChange"

    .line 185
    .line 186
    aput-object v3, v2, v16

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :pswitch_21
    const-string v3, "setOriginal"

    .line 190
    .line 191
    aput-object v3, v2, v16

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :pswitch_22
    const-string v3, "setDispatchReceiverParameter"

    .line 195
    .line 196
    aput-object v3, v2, v16

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_23
    const-string v3, "setExtensionReceiverParameter"

    .line 200
    .line 201
    aput-object v3, v2, v16

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :pswitch_24
    aput-object v12, v2, v16

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :pswitch_25
    aput-object v11, v2, v16

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :pswitch_26
    aput-object v10, v2, v16

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :pswitch_27
    aput-object v9, v2, v16

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :pswitch_28
    aput-object v8, v2, v16

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :pswitch_29
    const-string v3, "setCopyOverrides"

    .line 220
    .line 221
    aput-object v3, v2, v16

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :pswitch_2a
    aput-object v7, v2, v16

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :pswitch_2b
    aput-object v6, v2, v16

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :pswitch_2c
    aput-object v5, v2, v16

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :pswitch_2d
    aput-object v4, v2, v16

    .line 234
    .line 235
    :goto_3
    packed-switch p0, :pswitch_data_4

    .line 236
    .line 237
    .line 238
    const-string v3, "<init>"

    .line 239
    .line 240
    aput-object v3, v2, v1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :pswitch_2e
    aput-object v15, v2, v1

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :pswitch_2f
    aput-object v14, v2, v1

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :pswitch_30
    aput-object v13, v2, v1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :pswitch_31
    aput-object v12, v2, v1

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :pswitch_32
    aput-object v11, v2, v1

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :pswitch_33
    aput-object v10, v2, v1

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :pswitch_34
    aput-object v9, v2, v1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :pswitch_35
    aput-object v8, v2, v1

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :pswitch_36
    aput-object v7, v2, v1

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :pswitch_37
    aput-object v6, v2, v1

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_38
    aput-object v5, v2, v1

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :pswitch_39
    aput-object v4, v2, v1

    .line 277
    .line 278
    :goto_4
    :pswitch_3a
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    packed-switch p0, :pswitch_data_5

    .line 283
    .line 284
    .line 285
    :pswitch_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 286
    .line 287
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :pswitch_3c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :goto_5
    throw v1

    .line 297
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_d
        :pswitch_12
        :pswitch_d
        :pswitch_d
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_7
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_6
        :pswitch_d
        :pswitch_4
        :pswitch_d
        :pswitch_5
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_2d
        :pswitch_16
        :pswitch_2c
        :pswitch_16
        :pswitch_2b
        :pswitch_16
        :pswitch_2a
        :pswitch_29
        :pswitch_16
        :pswitch_28
        :pswitch_16
        :pswitch_27
        :pswitch_16
        :pswitch_26
        :pswitch_16
        :pswitch_25
        :pswitch_16
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_16
        :pswitch_1b
        :pswitch_16
        :pswitch_1a
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x8
        :pswitch_39
        :pswitch_3a
        :pswitch_38
        :pswitch_3a
        :pswitch_37
        :pswitch_3a
        :pswitch_36
        :pswitch_3a
        :pswitch_3a
        :pswitch_35
        :pswitch_3a
        :pswitch_34
        :pswitch_3a
        :pswitch_33
        :pswitch_3a
        :pswitch_32
        :pswitch_3a
        :pswitch_31
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_30
        :pswitch_3a
        :pswitch_2f
        :pswitch_3a
        :pswitch_2e
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
    .end packed-switch
.end method


# virtual methods
.method public final A(Lfl4;)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lys2;->y:Lfl4;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0xa

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final B()Lws2;
    .locals 1

    .line 1
    sget-object v0, La42;->w:La42;

    .line 2
    .line 3
    iput-object v0, p0, Lys2;->N:La42;

    .line 4
    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final C(Lvw3;)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lys2;->G:Lvw3;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x17

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final G()Lws2;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lys2;->M:Z

    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final H(Lvj1;)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lys2;->x:Lvj1;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x8

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final J(Luq4;)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lys2;->H:Luq4;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x11

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final N()Lws2;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lys2;->J:Z

    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final a(Ljava/util/List;)Lws2;
    .locals 0

    .line 1
    iput-object p1, p0, Lys2;->C:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final build()Lxs2;
    .locals 1

    .line 1
    iget-object v0, p0, Lys2;->T:Lzs2;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lzs2;->i1(Lys2;)Lzs2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final h(I)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lys2;->B:I

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0xe

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final i(Lqz3;)Lws2;
    .locals 0

    .line 1
    iput-object p1, p0, Lys2;->F:Lqz3;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final j()Lws2;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lys2;->K:Z

    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final o()Lws2;
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    iget-object v1, p0, Lys2;->Q:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v2, Llj3;->c0:Ljt1;

    .line 6
    .line 7
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final p()Lws2;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lys2;->P:Z

    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final r(Lrm;)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lys2;->O:Lrm;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x23

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final v(Lus1;)Lws2;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lys2;->z:Lus1;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0xc

    .line 7
    .line 8
    invoke-static {p0}, Lys2;->b(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final w()Lws2;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lys2;->I:Z

    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
