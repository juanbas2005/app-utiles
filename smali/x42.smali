.class public final Lx42;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljx5;

.field public final b:Lda7;

.field public final c:Lkg5;

.field public final d:Lf96;


# direct methods
.method public constructor <init>(Ljx5;Lda7;Lkg5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx42;->a:Ljx5;

    .line 5
    .line 6
    iput-object p2, p0, Lx42;->b:Lda7;

    .line 7
    .line 8
    iput-object p3, p0, Lx42;->c:Lkg5;

    .line 9
    .line 10
    new-instance p2, Lf96;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, Lf96;-><init>(Ljx5;Lkg5;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lx42;->d:Lf96;

    .line 16
    .line 17
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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
.end method

.method public static final a(Lx42;Lxy6;Lzv0;Ls83;Ljava/lang/Object;Lv75;Lg72;Lh61;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p7, Ls42;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p7

    .line 9
    check-cast v0, Ls42;

    .line 10
    .line 11
    iget v1, v0, Ls42;->J:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Ls42;->J:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ls42;

    .line 24
    .line 25
    invoke-direct {v0, p0, p7}, Ls42;-><init>(Lx42;Lh61;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p7, v0, Ls42;->H:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Ls42;->J:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    iget p0, v0, Ls42;->G:I

    .line 39
    .line 40
    iget-object p1, v0, Ls42;->F:Lg72;

    .line 41
    .line 42
    iget-object p2, v0, Ls42;->E:Lv75;

    .line 43
    .line 44
    iget-object p3, v0, Ls42;->D:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p4, v0, Ls42;->C:Ls83;

    .line 47
    .line 48
    iget-object p5, v0, Ls42;->B:Lzv0;

    .line 49
    .line 50
    iget-object p6, v0, Ls42;->A:Lxy6;

    .line 51
    .line 52
    iget-object v1, v0, Ls42;->z:Lx42;

    .line 53
    .line 54
    invoke-static {p7}, Lo85;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object v6, v1

    .line 58
    move v1, p0

    .line 59
    move-object p0, v6

    .line 60
    move-object v6, p6

    .line 61
    move-object p6, p1

    .line 62
    move-object p1, v6

    .line 63
    move-object v6, p5

    .line 64
    move-object p5, p2

    .line 65
    move-object p2, v6

    .line 66
    move-object v6, p4

    .line 67
    move-object p4, p3

    .line 68
    move-object p3, v6

    .line 69
    goto :goto_4

    .line 70
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_2
    invoke-static {p7}, Lo85;->q(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/4 p7, 0x0

    .line 80
    :goto_1
    iget-object v1, p0, Lx42;->a:Ljx5;

    .line 81
    .line 82
    iget-object v1, p2, Lzv0;->e:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    :goto_2
    if-ge p7, v4, :cond_4

    .line 89
    .line 90
    invoke-interface {v1, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lmk1;

    .line 95
    .line 96
    invoke-interface {v5, p1, p5}, Lmk1;->a(Lxy6;Lv75;)Lpk1;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p7

    .line 106
    new-instance v1, Lyb5;

    .line 107
    .line 108
    invoke-direct {v1, v5, p7}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    add-int/lit8 p7, p7, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move-object v1, v2

    .line 116
    :goto_3
    if-eqz v1, :cond_9

    .line 117
    .line 118
    iget-object p7, v1, Lyb5;->w:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p7, Lpk1;

    .line 121
    .line 122
    iget-object v1, v1, Lyb5;->x:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-int/2addr v1, v3

    .line 131
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iput-object p0, v0, Ls42;->z:Lx42;

    .line 135
    .line 136
    iput-object p1, v0, Ls42;->A:Lxy6;

    .line 137
    .line 138
    iput-object p2, v0, Ls42;->B:Lzv0;

    .line 139
    .line 140
    iput-object p3, v0, Ls42;->C:Ls83;

    .line 141
    .line 142
    iput-object p4, v0, Ls42;->D:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object p5, v0, Ls42;->E:Lv75;

    .line 145
    .line 146
    iput-object p6, v0, Ls42;->F:Lg72;

    .line 147
    .line 148
    iput v1, v0, Ls42;->G:I

    .line 149
    .line 150
    iput v3, v0, Ls42;->J:I

    .line 151
    .line 152
    invoke-interface {p7, v0}, Lpk1;->a(Lf61;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p7

    .line 156
    sget-object v4, Lp81;->w:Lp81;

    .line 157
    .line 158
    if-ne p7, v4, :cond_5

    .line 159
    .line 160
    return-object v4

    .line 161
    :cond_5
    :goto_4
    check-cast p7, Lgk1;

    .line 162
    .line 163
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    if-eqz p7, :cond_8

    .line 167
    .line 168
    new-instance p0, Lr42;

    .line 169
    .line 170
    iget-object p2, p7, Lgk1;->a:Landroid/graphics/drawable/BitmapDrawable;

    .line 171
    .line 172
    iget-boolean p3, p7, Lgk1;->b:Z

    .line 173
    .line 174
    iget-object p4, p1, Lxy6;->c:Lpe1;

    .line 175
    .line 176
    iget-object p1, p1, Lxy6;->a:Lu83;

    .line 177
    .line 178
    instance-of p5, p1, Lxc2;

    .line 179
    .line 180
    if-eqz p5, :cond_6

    .line 181
    .line 182
    check-cast p1, Lxc2;

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_6
    move-object p1, v2

    .line 186
    :goto_5
    if-eqz p1, :cond_7

    .line 187
    .line 188
    iget-object v2, p1, Lxc2;->y:Ljava/lang/String;

    .line 189
    .line 190
    :cond_7
    invoke-direct {p0, p2, p3, p4, v2}, Lr42;-><init>(Landroid/graphics/drawable/Drawable;ZLpe1;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_8
    move p7, v1

    .line 195
    goto :goto_1

    .line 196
    :cond_9
    const-string p0, "Unable to create a decoder that supports: "

    .line 197
    .line 198
    invoke-static {p0, p4}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    return-object v2
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
.end method

.method public static final b(Lx42;Ls83;Ljava/lang/Object;Lv75;Lg72;Lh61;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    instance-of v3, v1, Lt42;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v1

    .line 12
    check-cast v3, Lt42;

    .line 13
    .line 14
    iget v4, v3, Lt42;->J:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lt42;->J:I

    .line 24
    .line 25
    :goto_0
    move-object v6, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lt42;

    .line 28
    .line 29
    invoke-direct {v3, v0, v1}, Lt42;-><init>(Lx42;Lh61;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v1, v6, Lt42;->H:Ljava/lang/Object;

    .line 34
    .line 35
    iget v3, v6, Lt42;->J:I

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    sget-object v10, Lp81;->w:Lp81;

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    if-eq v3, v4, :cond_3

    .line 46
    .line 47
    if-eq v3, v8, :cond_2

    .line 48
    .line 49
    if-ne v3, v7, :cond_1

    .line 50
    .line 51
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v9

    .line 62
    :cond_2
    iget-object v2, v6, Lt42;->D:Lh06;

    .line 63
    .line 64
    iget-object v0, v6, Lt42;->C:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lh06;

    .line 67
    .line 68
    iget-object v3, v6, Lt42;->B:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Lg72;

    .line 71
    .line 72
    iget-object v4, v6, Lt42;->A:Ls83;

    .line 73
    .line 74
    iget-object v5, v6, Lt42;->z:Lx42;

    .line 75
    .line 76
    :try_start_0
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto/16 :goto_c

    .line 83
    .line 84
    :cond_3
    iget-object v0, v6, Lt42;->G:Lh06;

    .line 85
    .line 86
    iget-object v2, v6, Lt42;->F:Lh06;

    .line 87
    .line 88
    iget-object v3, v6, Lt42;->E:Lh06;

    .line 89
    .line 90
    iget-object v4, v6, Lt42;->D:Lh06;

    .line 91
    .line 92
    iget-object v5, v6, Lt42;->C:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Lg72;

    .line 95
    .line 96
    iget-object v11, v6, Lt42;->B:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v12, v6, Lt42;->A:Ls83;

    .line 99
    .line 100
    iget-object v13, v6, Lt42;->z:Lx42;

    .line 101
    .line 102
    :try_start_1
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v3

    .line 106
    .line 107
    move-object/from16 v23, v4

    .line 108
    .line 109
    move-object/from16 v24, v5

    .line 110
    .line 111
    move-object/from16 v22, v11

    .line 112
    .line 113
    move-object/from16 v18, v13

    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_4
    invoke-static {v1}, Lo85;->q(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance v11, Lh06;

    .line 121
    .line 122
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    move-object/from16 v1, p3

    .line 126
    .line 127
    iput-object v1, v11, Lh06;->w:Ljava/lang/Object;

    .line 128
    .line 129
    new-instance v12, Lh06;

    .line 130
    .line 131
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    iget-object v1, v0, Lx42;->a:Ljx5;

    .line 135
    .line 136
    iget-object v1, v1, Ljx5;->f:Lzv0;

    .line 137
    .line 138
    iput-object v1, v12, Lh06;->w:Ljava/lang/Object;

    .line 139
    .line 140
    new-instance v13, Lh06;

    .line 141
    .line 142
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    :try_start_2
    iget-object v1, v0, Lx42;->c:Lkg5;

    .line 146
    .line 147
    iget-object v3, v11, Lh06;->w:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v3, Lv75;

    .line 150
    .line 151
    invoke-virtual {v1, v3}, Lkg5;->T(Lv75;)Lv75;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput-object v1, v11, Lh06;->w:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    .line 159
    .line 160
    iget-object v1, v2, Ls83;->f:Lmk1;

    .line 161
    .line 162
    if-eqz v1, :cond_6

    .line 163
    .line 164
    :try_start_3
    iget-object v3, v12, Lh06;->w:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v3, Lzv0;

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v5, v3, Lzv0;->a:Ljava/util/List;

    .line 172
    .line 173
    invoke-static {v5}, Ldt0;->d1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget-object v14, v3, Lzv0;->b:Ljava/util/List;

    .line 178
    .line 179
    invoke-static {v14}, Ldt0;->d1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    iget-object v15, v3, Lzv0;->c:Ljava/util/List;

    .line 184
    .line 185
    invoke-static {v15}, Ldt0;->d1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    iget-object v7, v3, Lzv0;->d:Ljava/util/List;

    .line 190
    .line 191
    invoke-static {v7}, Ldt0;->d1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    iget-object v3, v3, Lzv0;->e:Ljava/util/List;

    .line 196
    .line 197
    invoke-static {v3}, Ldt0;->d1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    if-eqz v1, :cond_5

    .line 202
    .line 203
    const/4 v8, 0x0

    .line 204
    invoke-virtual {v3, v8, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :catchall_1
    move-exception v0

    .line 209
    move-object v2, v13

    .line 210
    goto/16 :goto_c

    .line 211
    .line 212
    :cond_5
    :goto_2
    new-instance v17, Lzv0;

    .line 213
    .line 214
    invoke-static {v5}, Ltf4;->P(Ljava/util/ArrayList;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v18

    .line 218
    invoke-static {v14}, Ltf4;->P(Ljava/util/ArrayList;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v19

    .line 222
    invoke-static {v15}, Ltf4;->P(Ljava/util/ArrayList;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v20

    .line 226
    invoke-static {v7}, Ltf4;->P(Ljava/util/ArrayList;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v21

    .line 230
    invoke-static {v3}, Ltf4;->P(Ljava/util/ArrayList;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v22

    .line 234
    invoke-direct/range {v17 .. v22}, Lzv0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 235
    .line 236
    .line 237
    move-object/from16 v1, v17

    .line 238
    .line 239
    iput-object v1, v12, Lh06;->w:Ljava/lang/Object;

    .line 240
    .line 241
    :cond_6
    iget-object v1, v12, Lh06;->w:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Lzv0;

    .line 244
    .line 245
    iget-object v3, v11, Lh06;->w:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v3, Lv75;

    .line 248
    .line 249
    iput-object v0, v6, Lt42;->z:Lx42;

    .line 250
    .line 251
    iput-object v2, v6, Lt42;->A:Ls83;

    .line 252
    .line 253
    move-object/from16 v5, p2

    .line 254
    .line 255
    iput-object v5, v6, Lt42;->B:Ljava/lang/Object;

    .line 256
    .line 257
    move-object/from16 v7, p4

    .line 258
    .line 259
    iput-object v7, v6, Lt42;->C:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v11, v6, Lt42;->D:Lh06;

    .line 262
    .line 263
    iput-object v12, v6, Lt42;->E:Lh06;

    .line 264
    .line 265
    iput-object v13, v6, Lt42;->F:Lh06;

    .line 266
    .line 267
    iput-object v13, v6, Lt42;->G:Lh06;

    .line 268
    .line 269
    iput v4, v6, Lt42;->J:I

    .line 270
    .line 271
    move-object v4, v3

    .line 272
    move-object v3, v5

    .line 273
    move-object v5, v7

    .line 274
    invoke-virtual/range {v0 .. v6}, Lx42;->c(Lzv0;Ls83;Ljava/lang/Object;Lv75;Lg72;Lh61;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 278
    if-ne v1, v10, :cond_7

    .line 279
    .line 280
    goto/16 :goto_a

    .line 281
    .line 282
    :cond_7
    move-object/from16 v18, p0

    .line 283
    .line 284
    move-object/from16 v22, p2

    .line 285
    .line 286
    move-object/from16 v24, p4

    .line 287
    .line 288
    move-object/from16 v23, v11

    .line 289
    .line 290
    move-object/from16 v20, v12

    .line 291
    .line 292
    move-object v0, v13

    .line 293
    move-object v2, v0

    .line 294
    move-object/from16 v12, p1

    .line 295
    .line 296
    :goto_3
    :try_start_4
    iput-object v1, v0, Lh06;->w:Ljava/lang/Object;

    .line 297
    .line 298
    iget-object v0, v2, Lh06;->w:Ljava/lang/Object;

    .line 299
    .line 300
    move-object v1, v0

    .line 301
    check-cast v1, Lhc2;

    .line 302
    .line 303
    instance-of v3, v1, Lxy6;

    .line 304
    .line 305
    if-eqz v3, :cond_9

    .line 306
    .line 307
    iget-object v0, v12, Ls83;->t:Lh81;

    .line 308
    .line 309
    new-instance v17, Lp6;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 310
    .line 311
    const/16 v25, 0x0

    .line 312
    .line 313
    const/16 v26, 0x1

    .line 314
    .line 315
    move-object/from16 v19, v2

    .line 316
    .line 317
    move-object/from16 v21, v12

    .line 318
    .line 319
    :try_start_5
    invoke-direct/range {v17 .. v26}, Lp6;-><init>(Lx42;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 320
    .line 321
    .line 322
    move-object/from16 v1, v17

    .line 323
    .line 324
    move-object/from16 v5, v18

    .line 325
    .line 326
    move-object/from16 v4, v21

    .line 327
    .line 328
    move-object/from16 v11, v23

    .line 329
    .line 330
    move-object/from16 v3, v24

    .line 331
    .line 332
    :try_start_6
    iput-object v5, v6, Lt42;->z:Lx42;

    .line 333
    .line 334
    iput-object v4, v6, Lt42;->A:Ls83;

    .line 335
    .line 336
    iput-object v3, v6, Lt42;->B:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v11, v6, Lt42;->C:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v2, v6, Lt42;->D:Lh06;

    .line 341
    .line 342
    iput-object v9, v6, Lt42;->E:Lh06;

    .line 343
    .line 344
    iput-object v9, v6, Lt42;->F:Lh06;

    .line 345
    .line 346
    iput-object v9, v6, Lt42;->G:Lh06;

    .line 347
    .line 348
    const/4 v7, 0x2

    .line 349
    iput v7, v6, Lt42;->J:I

    .line 350
    .line 351
    invoke-static {v0, v1, v6}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    if-ne v1, v10, :cond_8

    .line 356
    .line 357
    goto/16 :goto_a

    .line 358
    .line 359
    :cond_8
    move-object v0, v11

    .line 360
    :goto_4
    check-cast v1, Lr42;

    .line 361
    .line 362
    move-object v11, v0

    .line 363
    :goto_5
    move-object v14, v1

    .line 364
    move-object/from16 v17, v3

    .line 365
    .line 366
    move-object v12, v4

    .line 367
    move-object v13, v5

    .line 368
    goto :goto_6

    .line 369
    :catchall_2
    move-exception v0

    .line 370
    move-object/from16 v2, v19

    .line 371
    .line 372
    goto/16 :goto_c

    .line 373
    .line 374
    :cond_9
    move-object v4, v12

    .line 375
    move-object/from16 v5, v18

    .line 376
    .line 377
    move-object/from16 v11, v23

    .line 378
    .line 379
    move-object/from16 v3, v24

    .line 380
    .line 381
    instance-of v1, v1, Lpz1;

    .line 382
    .line 383
    if-eqz v1, :cond_11

    .line 384
    .line 385
    new-instance v1, Lr42;

    .line 386
    .line 387
    move-object v7, v0

    .line 388
    check-cast v7, Lpz1;

    .line 389
    .line 390
    iget-object v7, v7, Lpz1;->a:Landroid/graphics/drawable/Drawable;

    .line 391
    .line 392
    move-object v8, v0

    .line 393
    check-cast v8, Lpz1;

    .line 394
    .line 395
    iget-boolean v8, v8, Lpz1;->b:Z

    .line 396
    .line 397
    check-cast v0, Lpz1;

    .line 398
    .line 399
    iget-object v0, v0, Lpz1;->c:Lpe1;

    .line 400
    .line 401
    invoke-direct {v1, v7, v8, v0, v9}, Lr42;-><init>(Landroid/graphics/drawable/Drawable;ZLpe1;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 402
    .line 403
    .line 404
    goto :goto_5

    .line 405
    :goto_6
    iget-object v0, v2, Lh06;->w:Ljava/lang/Object;

    .line 406
    .line 407
    instance-of v1, v0, Lxy6;

    .line 408
    .line 409
    if-eqz v1, :cond_a

    .line 410
    .line 411
    check-cast v0, Lxy6;

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_a
    move-object v0, v9

    .line 415
    :goto_7
    if-eqz v0, :cond_b

    .line 416
    .line 417
    iget-object v0, v0, Lxy6;->a:Lu83;

    .line 418
    .line 419
    invoke-static {v0}, Li;->a(Ljava/io/Closeable;)V

    .line 420
    .line 421
    .line 422
    :cond_b
    iget-object v0, v11, Lh06;->w:Ljava/lang/Object;

    .line 423
    .line 424
    move-object v15, v0

    .line 425
    check-cast v15, Lv75;

    .line 426
    .line 427
    iput-object v9, v6, Lt42;->z:Lx42;

    .line 428
    .line 429
    iput-object v9, v6, Lt42;->A:Ls83;

    .line 430
    .line 431
    iput-object v9, v6, Lt42;->B:Ljava/lang/Object;

    .line 432
    .line 433
    iput-object v9, v6, Lt42;->C:Ljava/lang/Object;

    .line 434
    .line 435
    iput-object v9, v6, Lt42;->D:Lh06;

    .line 436
    .line 437
    iput-object v9, v6, Lt42;->E:Lh06;

    .line 438
    .line 439
    iput-object v9, v6, Lt42;->F:Lh06;

    .line 440
    .line 441
    iput-object v9, v6, Lt42;->G:Lh06;

    .line 442
    .line 443
    const/4 v0, 0x3

    .line 444
    iput v0, v6, Lt42;->J:I

    .line 445
    .line 446
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget-object v0, v12, Ls83;->g:Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    if-eqz v1, :cond_c

    .line 456
    .line 457
    :goto_8
    move-object v1, v14

    .line 458
    goto :goto_9

    .line 459
    :cond_c
    iget-object v1, v14, Lr42;->a:Landroid/graphics/drawable/Drawable;

    .line 460
    .line 461
    instance-of v1, v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 462
    .line 463
    if-nez v1, :cond_d

    .line 464
    .line 465
    iget-boolean v1, v12, Ls83;->k:Z

    .line 466
    .line 467
    if-nez v1, :cond_d

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_d
    iget-object v1, v12, Ls83;->u:Lh81;

    .line 471
    .line 472
    move-object/from16 v18, v12

    .line 473
    .line 474
    new-instance v12, Lw42;

    .line 475
    .line 476
    const/16 v19, 0x0

    .line 477
    .line 478
    move-object/from16 v16, v0

    .line 479
    .line 480
    invoke-direct/range {v12 .. v19}, Lw42;-><init>(Lx42;Lr42;Lv75;Ljava/util/List;Lg72;Ls83;Lf61;)V

    .line 481
    .line 482
    .line 483
    invoke-static {v1, v12, v6}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    move-object v1, v0

    .line 488
    :goto_9
    if-ne v1, v10, :cond_e

    .line 489
    .line 490
    :goto_a
    return-object v10

    .line 491
    :cond_e
    :goto_b
    check-cast v1, Lr42;

    .line 492
    .line 493
    iget-object v0, v1, Lr42;->a:Landroid/graphics/drawable/Drawable;

    .line 494
    .line 495
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 496
    .line 497
    if-eqz v2, :cond_f

    .line 498
    .line 499
    move-object v9, v0

    .line 500
    check-cast v9, Landroid/graphics/drawable/BitmapDrawable;

    .line 501
    .line 502
    :cond_f
    if-eqz v9, :cond_10

    .line 503
    .line 504
    invoke-virtual {v9}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    if-eqz v0, :cond_10

    .line 509
    .line 510
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 511
    .line 512
    .line 513
    :cond_10
    return-object v1

    .line 514
    :cond_11
    :try_start_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 515
    .line 516
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 517
    .line 518
    .line 519
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 520
    :goto_c
    iget-object v1, v2, Lh06;->w:Ljava/lang/Object;

    .line 521
    .line 522
    instance-of v2, v1, Lxy6;

    .line 523
    .line 524
    if-eqz v2, :cond_12

    .line 525
    .line 526
    move-object v9, v1

    .line 527
    check-cast v9, Lxy6;

    .line 528
    .line 529
    :cond_12
    if-eqz v9, :cond_13

    .line 530
    .line 531
    iget-object v1, v9, Lxy6;->a:Lu83;

    .line 532
    .line 533
    invoke-static {v1}, Li;->a(Ljava/io/Closeable;)V

    .line 534
    .line 535
    .line 536
    :cond_13
    throw v0
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
.end method


# virtual methods
.method public final c(Lzv0;Ls83;Ljava/lang/Object;Lv75;Lg72;Lh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p6, Lu42;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lu42;

    .line 7
    .line 8
    iget v1, v0, Lu42;->I:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lu42;->I:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu42;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lu42;-><init>(Lx42;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lu42;->G:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lu42;->I:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget p0, v0, Lu42;->F:I

    .line 36
    .line 37
    iget-object p1, v0, Lu42;->E:Lg72;

    .line 38
    .line 39
    iget-object p2, v0, Lu42;->D:Lv75;

    .line 40
    .line 41
    iget-object p3, v0, Lu42;->C:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p4, v0, Lu42;->B:Ls83;

    .line 44
    .line 45
    iget-object p5, v0, Lu42;->A:Lzv0;

    .line 46
    .line 47
    iget-object v1, v0, Lu42;->z:Lx42;

    .line 48
    .line 49
    invoke-static {p6}, Lo85;->q(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v8, v1

    .line 53
    move v1, p0

    .line 54
    move-object p0, v8

    .line 55
    move-object v8, p5

    .line 56
    move-object p5, p1

    .line 57
    move-object p1, v8

    .line 58
    move-object v8, p4

    .line 59
    move-object p4, p2

    .line 60
    move-object p2, v8

    .line 61
    goto :goto_4

    .line 62
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_2
    invoke-static {p6}, Lo85;->q(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 p6, 0x0

    .line 72
    :goto_1
    iget-object v1, p0, Lx42;->a:Ljx5;

    .line 73
    .line 74
    iget-object v1, p1, Lzv0;->d:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    :goto_2
    if-ge p6, v4, :cond_4

    .line 81
    .line 82
    invoke-interface {v1, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Lyb5;

    .line 87
    .line 88
    iget-object v6, v5, Lyb5;->w:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, Lic2;

    .line 91
    .line 92
    iget-object v5, v5, Lyb5;->x:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-interface {v6, p3, p4}, Lic2;->a(Ljava/lang/Object;Lv75;)Ljc2;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p6

    .line 119
    new-instance v1, Lyb5;

    .line 120
    .line 121
    invoke-direct {v1, v5, p6}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    add-int/lit8 p6, p6, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    move-object v1, v2

    .line 129
    :goto_3
    if-eqz v1, :cond_9

    .line 130
    .line 131
    iget-object p6, v1, Lyb5;->w:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p6, Ljc2;

    .line 134
    .line 135
    iget-object v1, v1, Lyb5;->x:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, Ljava/lang/Number;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    add-int/2addr v1, v3

    .line 144
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iput-object p0, v0, Lu42;->z:Lx42;

    .line 148
    .line 149
    iput-object p1, v0, Lu42;->A:Lzv0;

    .line 150
    .line 151
    iput-object p2, v0, Lu42;->B:Ls83;

    .line 152
    .line 153
    iput-object p3, v0, Lu42;->C:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p4, v0, Lu42;->D:Lv75;

    .line 156
    .line 157
    iput-object p5, v0, Lu42;->E:Lg72;

    .line 158
    .line 159
    iput v1, v0, Lu42;->F:I

    .line 160
    .line 161
    iput v3, v0, Lu42;->I:I

    .line 162
    .line 163
    invoke-interface {p6, v0}, Ljc2;->a(Lf61;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p6

    .line 167
    sget-object v4, Lp81;->w:Lp81;

    .line 168
    .line 169
    if-ne p6, v4, :cond_5

    .line 170
    .line 171
    return-object v4

    .line 172
    :cond_5
    :goto_4
    check-cast p6, Lhc2;

    .line 173
    .line 174
    :try_start_0
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    if-eqz p6, :cond_6

    .line 178
    .line 179
    return-object p6

    .line 180
    :cond_6
    move p6, v1

    .line 181
    goto :goto_1

    .line 182
    :catchall_0
    move-exception p0

    .line 183
    instance-of p1, p6, Lxy6;

    .line 184
    .line 185
    if-eqz p1, :cond_7

    .line 186
    .line 187
    move-object v2, p6

    .line 188
    check-cast v2, Lxy6;

    .line 189
    .line 190
    :cond_7
    if-eqz v2, :cond_8

    .line 191
    .line 192
    iget-object p1, v2, Lxy6;->a:Lu83;

    .line 193
    .line 194
    invoke-static {p1}, Li;->a(Ljava/io/Closeable;)V

    .line 195
    .line 196
    .line 197
    :cond_8
    throw p0

    .line 198
    :cond_9
    const-string p0, "Unable to create a fetcher that supports: "

    .line 199
    .line 200
    invoke-static {p0, p3}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v2
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
.end method

.method public final d(Lmx5;Lh61;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v2, v1, Lx42;->d:Lf96;

    .line 8
    .line 9
    instance-of v3, v0, Lv42;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lv42;

    .line 15
    .line 16
    iget v4, v3, Lv42;->D:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Lv42;->D:I

    .line 26
    .line 27
    :goto_0
    move-object v10, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, Lv42;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, Lv42;-><init>(Lx42;Lh61;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v10, Lv42;->B:Ljava/lang/Object;

    .line 36
    .line 37
    iget v3, v10, Lv42;->D:I

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v11, 0x1

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    if-ne v3, v11, :cond_1

    .line 44
    .line 45
    iget-object v1, v10, Lv42;->A:Lmx5;

    .line 46
    .line 47
    iget-object v2, v10, Lv42;->z:Lx42;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object v7, v1

    .line 55
    move-object v1, v2

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v4

    .line 64
    :cond_2
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :try_start_1
    iget-object v0, v7, Lmx5;->d:Ls83;

    .line 68
    .line 69
    iget-object v3, v0, Ls83;->b:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v5, v7, Lmx5;->e:Luu6;

    .line 72
    .line 73
    sget-object v6, Li;->a:[Landroid/graphics/Bitmap$Config;

    .line 74
    .line 75
    iget-object v6, v7, Lmx5;->f:Lg72;

    .line 76
    .line 77
    iget-object v8, v1, Lx42;->c:Lkg5;

    .line 78
    .line 79
    invoke-virtual {v8, v0, v5}, Lkg5;->E(Ls83;Luu6;)Lv75;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    iget-object v9, v8, Lv75;->e:Lwf6;

    .line 84
    .line 85
    iget-object v12, v1, Lx42;->a:Ljx5;

    .line 86
    .line 87
    iget-object v12, v12, Ljx5;->f:Lzv0;

    .line 88
    .line 89
    iget-object v12, v12, Lzv0;->b:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    const/4 v14, 0x0

    .line 96
    :goto_2
    if-ge v14, v13, :cond_4

    .line 97
    .line 98
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    check-cast v15, Lyb5;

    .line 103
    .line 104
    iget-object v4, v15, Lyb5;->w:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v4, Lke0;

    .line 107
    .line 108
    iget-object v15, v15, Lyb5;->x:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v15, Ljava/lang/Class;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-virtual {v15, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_3

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v3, v8}, Lke0;->a(Ljava/lang/Object;Lv75;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-eqz v4, :cond_3

    .line 130
    .line 131
    move-object v3, v4

    .line 132
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v11, 0x1

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    move-object v4, v6

    .line 138
    invoke-virtual {v2, v0, v3, v8, v4}, Lf96;->A(Ls83;Ljava/lang/Object;Lv75;Lg72;)Lmi4;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    invoke-virtual {v2, v0, v6, v5, v9}, Lf96;->y(Ls83;Lmi4;Luu6;Lwf6;)Lni4;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    goto :goto_3

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    goto :goto_4

    .line 151
    :cond_5
    const/4 v2, 0x0

    .line 152
    :goto_3
    if-eqz v2, :cond_6

    .line 153
    .line 154
    invoke-static {v7, v0, v6, v2}, Lf96;->B(Lmx5;Ls83;Lmi4;Lni4;)Lf77;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :cond_6
    iget-object v11, v0, Ls83;->s:Lh81;

    .line 160
    .line 161
    move-object v2, v0

    .line 162
    new-instance v0, Lp6;

    .line 163
    .line 164
    move-object v5, v4

    .line 165
    move-object v4, v8

    .line 166
    const/4 v8, 0x0

    .line 167
    const/4 v9, 0x2

    .line 168
    invoke-direct/range {v0 .. v9}, Lp6;-><init>(Lx42;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 169
    .line 170
    .line 171
    iput-object v1, v10, Lv42;->z:Lx42;

    .line 172
    .line 173
    iput-object v7, v10, Lv42;->A:Lmx5;

    .line 174
    .line 175
    const/4 v2, 0x1

    .line 176
    iput v2, v10, Lv42;->D:I

    .line 177
    .line 178
    invoke-static {v11, v0, v10}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    sget-object v1, Lp81;->w:Lp81;

    .line 183
    .line 184
    if-ne v0, v1, :cond_7

    .line 185
    .line 186
    return-object v1

    .line 187
    :cond_7
    return-object v0

    .line 188
    :goto_4
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 189
    .line 190
    if-nez v2, :cond_8

    .line 191
    .line 192
    iget-object v1, v1, Lx42;->c:Lkg5;

    .line 193
    .line 194
    iget-object v1, v7, Lmx5;->d:Ls83;

    .line 195
    .line 196
    invoke-static {v1, v0}, Lkg5;->n(Ls83;Ljava/lang/Throwable;)Ls62;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    return-object v0

    .line 201
    :cond_8
    throw v0
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
.end method
