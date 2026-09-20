.class public final synthetic Lhf;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Lhf;->w:I

    .line 2
    .line 3
    iput-wide p1, p0, Lhf;->x:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 86

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lhf;->w:I

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    const/high16 v3, 0x40000000    # 2.0f

    .line 8
    .line 9
    const-wide v4, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/high16 v6, 0x40800000    # 4.0f

    .line 15
    .line 16
    sget-object v9, Lvs7;->a:Lvs7;

    .line 17
    .line 18
    iget-wide v10, v0, Lhf;->x:J

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Lua6;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    .line 31
    .line 32
    invoke-interface {v0, v1}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v0, 0x1

    .line 37
    :try_start_0
    invoke-interface {v1, v10, v11, v0}, Lab6;->f(JI)V

    .line 38
    .line 39
    .line 40
    const-string v2, "id"

    .line 41
    .line 42
    invoke-static {v1, v2}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const-string v3, "state"

    .line 47
    .line 48
    invoke-static {v1, v3}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const-string v4, "worker_class_name"

    .line 53
    .line 54
    invoke-static {v1, v4}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const-string v5, "input_merger_class_name"

    .line 59
    .line 60
    invoke-static {v1, v5}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const-string v6, "input"

    .line 65
    .line 66
    invoke-static {v1, v6}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const-string v9, "output"

    .line 71
    .line 72
    invoke-static {v1, v9}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    const-string v10, "initial_delay"

    .line 77
    .line 78
    invoke-static {v1, v10}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    const-string v11, "interval_duration"

    .line 83
    .line 84
    invoke-static {v1, v11}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    const-string v12, "flex_duration"

    .line 89
    .line 90
    invoke-static {v1, v12}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    const-string v13, "run_attempt_count"

    .line 95
    .line 96
    invoke-static {v1, v13}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    const-string v14, "backoff_policy"

    .line 101
    .line 102
    invoke-static {v1, v14}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    const-string v15, "backoff_delay_duration"

    .line 107
    .line 108
    invoke-static {v1, v15}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    const-string v0, "last_enqueue_time"

    .line 113
    .line 114
    invoke-static {v1, v0}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    const-string v8, "minimum_retention_duration"

    .line 121
    .line 122
    invoke-static {v1, v8}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    const-string v7, "schedule_requested_at"

    .line 127
    .line 128
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    move/from16 p1, v7

    .line 133
    .line 134
    const-string v7, "run_in_foreground"

    .line 135
    .line 136
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    move/from16 v18, v7

    .line 141
    .line 142
    const-string v7, "out_of_quota_policy"

    .line 143
    .line 144
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    move/from16 v19, v7

    .line 149
    .line 150
    const-string v7, "period_count"

    .line 151
    .line 152
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    move/from16 v20, v7

    .line 157
    .line 158
    const-string v7, "generation"

    .line 159
    .line 160
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    move/from16 v21, v7

    .line 165
    .line 166
    const-string v7, "next_schedule_time_override"

    .line 167
    .line 168
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    move/from16 v22, v7

    .line 173
    .line 174
    const-string v7, "next_schedule_time_override_generation"

    .line 175
    .line 176
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    move/from16 v23, v7

    .line 181
    .line 182
    const-string v7, "stop_reason"

    .line 183
    .line 184
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    move/from16 v24, v7

    .line 189
    .line 190
    const-string v7, "trace_tag"

    .line 191
    .line 192
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    move/from16 v25, v7

    .line 197
    .line 198
    const-string v7, "backoff_on_system_interruptions"

    .line 199
    .line 200
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    move/from16 v26, v7

    .line 205
    .line 206
    const-string v7, "required_network_type"

    .line 207
    .line 208
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    move/from16 v27, v7

    .line 213
    .line 214
    const-string v7, "required_network_request"

    .line 215
    .line 216
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    move/from16 v28, v7

    .line 221
    .line 222
    const-string v7, "requires_charging"

    .line 223
    .line 224
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    move/from16 v29, v7

    .line 229
    .line 230
    const-string v7, "requires_device_idle"

    .line 231
    .line 232
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    move/from16 v30, v7

    .line 237
    .line 238
    const-string v7, "requires_battery_not_low"

    .line 239
    .line 240
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    move/from16 v31, v7

    .line 245
    .line 246
    const-string v7, "requires_storage_not_low"

    .line 247
    .line 248
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    move/from16 v32, v7

    .line 253
    .line 254
    const-string v7, "trigger_content_update_delay"

    .line 255
    .line 256
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    move/from16 v33, v7

    .line 261
    .line 262
    const-string v7, "trigger_max_content_delay"

    .line 263
    .line 264
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    move/from16 v34, v7

    .line 269
    .line 270
    const-string v7, "content_uri_triggers"

    .line 271
    .line 272
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    move/from16 v35, v7

    .line 277
    .line 278
    new-instance v7, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .line 282
    .line 283
    :goto_0
    invoke-interface {v1}, Lab6;->i0()Z

    .line 284
    .line 285
    .line 286
    move-result v36

    .line 287
    if-eqz v36, :cond_9

    .line 288
    .line 289
    invoke-interface {v1, v2}, Lab6;->R(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v38

    .line 293
    move-object/from16 v71, v7

    .line 294
    .line 295
    move/from16 v36, v8

    .line 296
    .line 297
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v7

    .line 301
    long-to-int v7, v7

    .line 302
    invoke-static {v7}, Li95;->v(I)Lkd8;

    .line 303
    .line 304
    .line 305
    move-result-object v39

    .line 306
    invoke-interface {v1, v4}, Lab6;->R(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v40

    .line 310
    invoke-interface {v1, v5}, Lab6;->R(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v41

    .line 314
    invoke-interface {v1, v6}, Lab6;->getBlob(I)[B

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    sget-object v8, Lce1;->b:Lce1;

    .line 319
    .line 320
    invoke-static {v7}, Lr16;->D([B)Lce1;

    .line 321
    .line 322
    .line 323
    move-result-object v42

    .line 324
    invoke-interface {v1, v9}, Lab6;->getBlob(I)[B

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    invoke-static {v7}, Lr16;->D([B)Lce1;

    .line 329
    .line 330
    .line 331
    move-result-object v43

    .line 332
    invoke-interface {v1, v10}, Lab6;->getLong(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v44

    .line 336
    invoke-interface {v1, v11}, Lab6;->getLong(I)J

    .line 337
    .line 338
    .line 339
    move-result-wide v46

    .line 340
    invoke-interface {v1, v12}, Lab6;->getLong(I)J

    .line 341
    .line 342
    .line 343
    move-result-wide v48

    .line 344
    invoke-interface {v1, v13}, Lab6;->getLong(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v7

    .line 348
    long-to-int v7, v7

    .line 349
    move v8, v2

    .line 350
    move/from16 v72, v3

    .line 351
    .line 352
    invoke-interface {v1, v14}, Lab6;->getLong(I)J

    .line 353
    .line 354
    .line 355
    move-result-wide v2

    .line 356
    long-to-int v2, v2

    .line 357
    invoke-static {v2}, Li95;->s(I)Ld40;

    .line 358
    .line 359
    .line 360
    move-result-object v52

    .line 361
    invoke-interface {v1, v15}, Lab6;->getLong(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v53

    .line 365
    invoke-interface {v1, v0}, Lab6;->getLong(I)J

    .line 366
    .line 367
    .line 368
    move-result-wide v55

    .line 369
    move/from16 v2, v36

    .line 370
    .line 371
    invoke-interface {v1, v2}, Lab6;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v57

    .line 375
    move/from16 v3, p1

    .line 376
    .line 377
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 378
    .line 379
    .line 380
    move-result-wide v59

    .line 381
    move/from16 p1, v0

    .line 382
    .line 383
    move/from16 v36, v2

    .line 384
    .line 385
    move/from16 v0, v18

    .line 386
    .line 387
    move/from16 v18, v3

    .line 388
    .line 389
    invoke-interface {v1, v0}, Lab6;->getLong(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v2

    .line 393
    long-to-int v2, v2

    .line 394
    if-eqz v2, :cond_0

    .line 395
    .line 396
    const/16 v61, 0x1

    .line 397
    .line 398
    :goto_1
    move/from16 v2, v19

    .line 399
    .line 400
    move/from16 v19, v4

    .line 401
    .line 402
    goto :goto_2

    .line 403
    :cond_0
    const/16 v61, 0x0

    .line 404
    .line 405
    goto :goto_1

    .line 406
    :goto_2
    invoke-interface {v1, v2}, Lab6;->getLong(I)J

    .line 407
    .line 408
    .line 409
    move-result-wide v3

    .line 410
    long-to-int v3, v3

    .line 411
    invoke-static {v3}, Li95;->u(I)Lg85;

    .line 412
    .line 413
    .line 414
    move-result-object v62

    .line 415
    move/from16 v3, v20

    .line 416
    .line 417
    move/from16 v20, v5

    .line 418
    .line 419
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 420
    .line 421
    .line 422
    move-result-wide v4

    .line 423
    long-to-int v4, v4

    .line 424
    move/from16 v73, v3

    .line 425
    .line 426
    move/from16 v5, v21

    .line 427
    .line 428
    move/from16 v21, v2

    .line 429
    .line 430
    invoke-interface {v1, v5}, Lab6;->getLong(I)J

    .line 431
    .line 432
    .line 433
    move-result-wide v2

    .line 434
    long-to-int v2, v2

    .line 435
    move/from16 v3, v22

    .line 436
    .line 437
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 438
    .line 439
    .line 440
    move-result-wide v65

    .line 441
    move/from16 v22, v0

    .line 442
    .line 443
    move/from16 v64, v2

    .line 444
    .line 445
    move/from16 v0, v23

    .line 446
    .line 447
    move/from16 v23, v3

    .line 448
    .line 449
    invoke-interface {v1, v0}, Lab6;->getLong(I)J

    .line 450
    .line 451
    .line 452
    move-result-wide v2

    .line 453
    long-to-int v2, v2

    .line 454
    move/from16 v63, v4

    .line 455
    .line 456
    move/from16 v3, v24

    .line 457
    .line 458
    move/from16 v24, v5

    .line 459
    .line 460
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 461
    .line 462
    .line 463
    move-result-wide v4

    .line 464
    long-to-int v4, v4

    .line 465
    move/from16 v5, v25

    .line 466
    .line 467
    invoke-interface {v1, v5}, Lab6;->isNull(I)Z

    .line 468
    .line 469
    .line 470
    move-result v25

    .line 471
    if-eqz v25, :cond_1

    .line 472
    .line 473
    move-object/from16 v69, v16

    .line 474
    .line 475
    :goto_3
    move/from16 v25, v0

    .line 476
    .line 477
    move/from16 v0, v26

    .line 478
    .line 479
    goto :goto_4

    .line 480
    :cond_1
    invoke-interface {v1, v5}, Lab6;->R(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v25

    .line 484
    move-object/from16 v69, v25

    .line 485
    .line 486
    goto :goto_3

    .line 487
    :goto_4
    invoke-interface {v1, v0}, Lab6;->isNull(I)Z

    .line 488
    .line 489
    .line 490
    move-result v26

    .line 491
    if-eqz v26, :cond_2

    .line 492
    .line 493
    move/from16 v67, v2

    .line 494
    .line 495
    move/from16 v26, v3

    .line 496
    .line 497
    move-object/from16 v2, v16

    .line 498
    .line 499
    goto :goto_5

    .line 500
    :cond_2
    move/from16 v67, v2

    .line 501
    .line 502
    move/from16 v26, v3

    .line 503
    .line 504
    invoke-interface {v1, v0}, Lab6;->getLong(I)J

    .line 505
    .line 506
    .line 507
    move-result-wide v2

    .line 508
    long-to-int v2, v2

    .line 509
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    :goto_5
    if-eqz v2, :cond_4

    .line 514
    .line 515
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    if-eqz v2, :cond_3

    .line 520
    .line 521
    const/4 v2, 0x1

    .line 522
    goto :goto_6

    .line 523
    :cond_3
    const/4 v2, 0x0

    .line 524
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    move-object/from16 v70, v2

    .line 529
    .line 530
    :goto_7
    move/from16 v68, v4

    .line 531
    .line 532
    move/from16 v2, v27

    .line 533
    .line 534
    goto :goto_8

    .line 535
    :catchall_0
    move-exception v0

    .line 536
    goto/16 :goto_11

    .line 537
    .line 538
    :cond_4
    move-object/from16 v70, v16

    .line 539
    .line 540
    goto :goto_7

    .line 541
    :goto_8
    invoke-interface {v1, v2}, Lab6;->getLong(I)J

    .line 542
    .line 543
    .line 544
    move-result-wide v3

    .line 545
    long-to-int v3, v3

    .line 546
    invoke-static {v3}, Li95;->t(I)Lyy4;

    .line 547
    .line 548
    .line 549
    move-result-object v76

    .line 550
    move/from16 v3, v28

    .line 551
    .line 552
    invoke-interface {v1, v3}, Lab6;->getBlob(I)[B

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-static {v4}, Li95;->J([B)Lny4;

    .line 557
    .line 558
    .line 559
    move-result-object v75

    .line 560
    move/from16 v27, v2

    .line 561
    .line 562
    move/from16 v28, v3

    .line 563
    .line 564
    move/from16 v4, v29

    .line 565
    .line 566
    invoke-interface {v1, v4}, Lab6;->getLong(I)J

    .line 567
    .line 568
    .line 569
    move-result-wide v2

    .line 570
    long-to-int v2, v2

    .line 571
    if-eqz v2, :cond_5

    .line 572
    .line 573
    const/16 v77, 0x1

    .line 574
    .line 575
    :goto_9
    move/from16 v29, v4

    .line 576
    .line 577
    move/from16 v2, v30

    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_5
    const/16 v77, 0x0

    .line 581
    .line 582
    goto :goto_9

    .line 583
    :goto_a
    invoke-interface {v1, v2}, Lab6;->getLong(I)J

    .line 584
    .line 585
    .line 586
    move-result-wide v3

    .line 587
    long-to-int v3, v3

    .line 588
    if-eqz v3, :cond_6

    .line 589
    .line 590
    const/16 v78, 0x1

    .line 591
    .line 592
    :goto_b
    move/from16 v30, v5

    .line 593
    .line 594
    move/from16 v3, v31

    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_6
    const/16 v78, 0x0

    .line 598
    .line 599
    goto :goto_b

    .line 600
    :goto_c
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 601
    .line 602
    .line 603
    move-result-wide v4

    .line 604
    long-to-int v4, v4

    .line 605
    if-eqz v4, :cond_7

    .line 606
    .line 607
    const/16 v79, 0x1

    .line 608
    .line 609
    :goto_d
    move v5, v2

    .line 610
    move/from16 v31, v3

    .line 611
    .line 612
    move/from16 v4, v32

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :cond_7
    const/16 v79, 0x0

    .line 616
    .line 617
    goto :goto_d

    .line 618
    :goto_e
    invoke-interface {v1, v4}, Lab6;->getLong(I)J

    .line 619
    .line 620
    .line 621
    move-result-wide v2

    .line 622
    long-to-int v2, v2

    .line 623
    if-eqz v2, :cond_8

    .line 624
    .line 625
    const/16 v80, 0x1

    .line 626
    .line 627
    :goto_f
    move/from16 v2, v33

    .line 628
    .line 629
    goto :goto_10

    .line 630
    :cond_8
    const/16 v80, 0x0

    .line 631
    .line 632
    goto :goto_f

    .line 633
    :goto_10
    invoke-interface {v1, v2}, Lab6;->getLong(I)J

    .line 634
    .line 635
    .line 636
    move-result-wide v81

    .line 637
    move/from16 v3, v34

    .line 638
    .line 639
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 640
    .line 641
    .line 642
    move-result-wide v83

    .line 643
    move/from16 v32, v0

    .line 644
    .line 645
    move/from16 v0, v35

    .line 646
    .line 647
    invoke-interface {v1, v0}, Lab6;->getBlob(I)[B

    .line 648
    .line 649
    .line 650
    move-result-object v33

    .line 651
    invoke-static/range {v33 .. v33}, Li95;->i([B)Ljava/util/LinkedHashSet;

    .line 652
    .line 653
    .line 654
    move-result-object v85

    .line 655
    new-instance v50, Lj31;

    .line 656
    .line 657
    move-object/from16 v74, v50

    .line 658
    .line 659
    invoke-direct/range {v74 .. v85}, Lj31;-><init>(Lny4;Lyy4;ZZZZJJLjava/util/Set;)V

    .line 660
    .line 661
    .line 662
    move-object/from16 v50, v74

    .line 663
    .line 664
    new-instance v37, Lbe8;

    .line 665
    .line 666
    move/from16 v51, v7

    .line 667
    .line 668
    invoke-direct/range {v37 .. v70}, Lbe8;-><init>(Ljava/lang/String;Lkd8;Ljava/lang/String;Ljava/lang/String;Lce1;Lce1;JJJLj31;ILd40;JJJJZLg85;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 669
    .line 670
    .line 671
    move-object/from16 v7, v37

    .line 672
    .line 673
    move/from16 v35, v0

    .line 674
    .line 675
    move-object/from16 v0, v71

    .line 676
    .line 677
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 678
    .line 679
    .line 680
    move/from16 v7, v32

    .line 681
    .line 682
    move/from16 v32, v4

    .line 683
    .line 684
    move/from16 v4, v19

    .line 685
    .line 686
    move/from16 v19, v21

    .line 687
    .line 688
    move/from16 v21, v24

    .line 689
    .line 690
    move/from16 v24, v26

    .line 691
    .line 692
    move/from16 v26, v7

    .line 693
    .line 694
    move-object v7, v0

    .line 695
    move/from16 v33, v2

    .line 696
    .line 697
    move/from16 v34, v3

    .line 698
    .line 699
    move v2, v8

    .line 700
    move/from16 v8, v36

    .line 701
    .line 702
    move/from16 v3, v72

    .line 703
    .line 704
    move/from16 v0, p1

    .line 705
    .line 706
    move/from16 p1, v18

    .line 707
    .line 708
    move/from16 v18, v22

    .line 709
    .line 710
    move/from16 v22, v23

    .line 711
    .line 712
    move/from16 v23, v25

    .line 713
    .line 714
    move/from16 v25, v30

    .line 715
    .line 716
    move/from16 v30, v5

    .line 717
    .line 718
    move/from16 v5, v20

    .line 719
    .line 720
    move/from16 v20, v73

    .line 721
    .line 722
    goto/16 :goto_0

    .line 723
    .line 724
    :cond_9
    move-object v0, v7

    .line 725
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 726
    .line 727
    .line 728
    return-object v0

    .line 729
    :goto_11
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 730
    .line 731
    .line 732
    throw v0

    .line 733
    :pswitch_0
    move-object/from16 v0, p1

    .line 734
    .line 735
    check-cast v0, Lhz1;

    .line 736
    .line 737
    invoke-interface {v0, v6}, Ltp1;->e0(F)F

    .line 738
    .line 739
    .line 740
    move-result v1

    .line 741
    invoke-interface {v0}, Lhz1;->e()J

    .line 742
    .line 743
    .line 744
    move-result-wide v6

    .line 745
    and-long/2addr v6, v4

    .line 746
    long-to-int v2, v6

    .line 747
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    const/high16 v2, 0x40c00000    # 6.0f

    .line 756
    .line 757
    invoke-interface {v0, v2}, Ltp1;->e0(F)F

    .line 758
    .line 759
    .line 760
    move-result v2

    .line 761
    invoke-interface {v0}, Lhz1;->e()J

    .line 762
    .line 763
    .line 764
    move-result-wide v6

    .line 765
    and-long/2addr v4, v6

    .line 766
    long-to-int v4, v4

    .line 767
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 768
    .line 769
    .line 770
    move-result v4

    .line 771
    sub-float/2addr v4, v1

    .line 772
    div-float/2addr v4, v3

    .line 773
    cmpl-float v3, v4, v2

    .line 774
    .line 775
    if-lez v3, :cond_a

    .line 776
    .line 777
    goto :goto_12

    .line 778
    :cond_a
    move v2, v4

    .line 779
    :goto_12
    invoke-interface {v0}, Lhz1;->getLayoutDirection()Ley3;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    sget-object v4, Ley3;->x:Ley3;

    .line 784
    .line 785
    if-ne v3, v4, :cond_b

    .line 786
    .line 787
    invoke-interface {v0}, Lhz1;->v0()J

    .line 788
    .line 789
    .line 790
    move-result-wide v3

    .line 791
    invoke-interface {v0}, Lhz1;->j0()Lwr0;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    invoke-virtual {v5}, Lwr0;->L()J

    .line 796
    .line 797
    .line 798
    move-result-wide v6

    .line 799
    invoke-virtual {v5}, Lwr0;->D()Lqk0;

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    invoke-interface {v8}, Lqk0;->h()V

    .line 804
    .line 805
    .line 806
    :try_start_1
    iget-object v8, v5, Lwr0;->x:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v8, Lji8;

    .line 809
    .line 810
    const/high16 v12, -0x40800000    # -1.0f

    .line 811
    .line 812
    const/high16 v13, 0x3f800000    # 1.0f

    .line 813
    .line 814
    invoke-virtual {v8, v12, v13, v3, v4}, Lji8;->E(FFJ)V

    .line 815
    .line 816
    .line 817
    invoke-static {v0, v10, v11, v1, v2}, Lza5;->n(Lhz1;JFF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 818
    .line 819
    .line 820
    invoke-static {v5, v6, v7}, Lb81;->u(Lwr0;J)V

    .line 821
    .line 822
    .line 823
    goto :goto_13

    .line 824
    :catchall_1
    move-exception v0

    .line 825
    invoke-static {v5, v6, v7}, Lb81;->u(Lwr0;J)V

    .line 826
    .line 827
    .line 828
    throw v0

    .line 829
    :cond_b
    invoke-static {v0, v10, v11, v1, v2}, Lza5;->n(Lhz1;JFF)V

    .line 830
    .line 831
    .line 832
    :goto_13
    return-object v9

    .line 833
    :pswitch_1
    move-object/from16 v10, p1

    .line 834
    .line 835
    check-cast v10, Lwy3;

    .line 836
    .line 837
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v10}, Lwy3;->a()V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v10, v6}, Lwy3;->e0(F)F

    .line 844
    .line 845
    .line 846
    move-result v13

    .line 847
    iget-object v1, v10, Lwy3;->w:Ltk0;

    .line 848
    .line 849
    invoke-interface {v1}, Lhz1;->v0()J

    .line 850
    .line 851
    .line 852
    move-result-wide v6

    .line 853
    const/high16 v1, 0x41900000    # 18.0f

    .line 854
    .line 855
    invoke-virtual {v10, v1}, Lwy3;->e0(F)F

    .line 856
    .line 857
    .line 858
    move-result v3

    .line 859
    invoke-virtual {v10, v1}, Lwy3;->e0(F)F

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    neg-float v1, v1

    .line 864
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 865
    .line 866
    .line 867
    move-result v3

    .line 868
    int-to-long v11, v3

    .line 869
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    int-to-long v14, v1

    .line 874
    shl-long v1, v11, v2

    .line 875
    .line 876
    and-long v3, v14, v4

    .line 877
    .line 878
    or-long/2addr v1, v3

    .line 879
    invoke-static {v6, v7, v1, v2}, Ll35;->e(JJ)J

    .line 880
    .line 881
    .line 882
    move-result-wide v14

    .line 883
    const/16 v16, 0x0

    .line 884
    .line 885
    const/16 v17, 0x78

    .line 886
    .line 887
    iget-wide v11, v0, Lhf;->x:J

    .line 888
    .line 889
    invoke-static/range {v10 .. v17}, Lhz1;->k0(Lhz1;JFJLiz1;I)V

    .line 890
    .line 891
    .line 892
    return-object v9

    .line 893
    :pswitch_2
    const/16 v16, 0x0

    .line 894
    .line 895
    move-object/from16 v0, p1

    .line 896
    .line 897
    check-cast v0, Lpp4;

    .line 898
    .line 899
    sget-object v1, Lkz2;->b:Lin5;

    .line 900
    .line 901
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-virtual {v0, v1, v2}, Lpp4;->c(Lin5;Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    return-object v16

    .line 909
    :pswitch_3
    move-object/from16 v1, p1

    .line 910
    .line 911
    check-cast v1, Lok6;

    .line 912
    .line 913
    sget-object v2, Lvj6;->a:Lnk6;

    .line 914
    .line 915
    new-instance v3, Luj6;

    .line 916
    .line 917
    sget-object v7, Ltj6;->x:Ltj6;

    .line 918
    .line 919
    const/4 v8, 0x1

    .line 920
    sget-object v4, Lcy2;->w:Lcy2;

    .line 921
    .line 922
    iget-wide v5, v0, Lhf;->x:J

    .line 923
    .line 924
    invoke-direct/range {v3 .. v8}, Luj6;-><init>(Lcy2;JLtj6;Z)V

    .line 925
    .line 926
    .line 927
    invoke-interface {v1, v2, v3}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    return-object v9

    .line 931
    :pswitch_4
    move-object/from16 v0, p1

    .line 932
    .line 933
    check-cast v0, Lic0;

    .line 934
    .line 935
    iget-object v1, v0, Lic0;->b:Lvr2;

    .line 936
    .line 937
    if-nez v1, :cond_c

    .line 938
    .line 939
    goto :goto_15

    .line 940
    :cond_c
    iget-object v2, v0, Lic0;->a:Lkk0;

    .line 941
    .line 942
    if-eqz v2, :cond_d

    .line 943
    .line 944
    :try_start_2
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 952
    goto :goto_14

    .line 953
    :catchall_2
    move-exception v0

    .line 954
    new-instance v1, Lm66;

    .line 955
    .line 956
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 957
    .line 958
    .line 959
    move-object v0, v1

    .line 960
    :goto_14
    invoke-virtual {v2, v0}, Lkk0;->f(Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    :cond_d
    :goto_15
    return-object v9

    .line 964
    :pswitch_5
    move-object/from16 v0, p1

    .line 965
    .line 966
    check-cast v0, Lch0;

    .line 967
    .line 968
    iget-object v1, v0, Lch0;->w:Lhd0;

    .line 969
    .line 970
    invoke-interface {v1}, Lhd0;->e()J

    .line 971
    .line 972
    .line 973
    move-result-wide v4

    .line 974
    shr-long v1, v4, v2

    .line 975
    .line 976
    long-to-int v1, v1

    .line 977
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 978
    .line 979
    .line 980
    move-result v1

    .line 981
    div-float/2addr v1, v3

    .line 982
    invoke-static {v0, v1}, Lr16;->w(Lch0;F)Lhg;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    new-instance v3, Lu90;

    .line 987
    .line 988
    const/4 v4, 0x5

    .line 989
    invoke-direct {v3, v10, v11, v4}, Lu90;-><init>(JI)V

    .line 990
    .line 991
    .line 992
    new-instance v4, Ljf;

    .line 993
    .line 994
    const/4 v5, 0x0

    .line 995
    invoke-direct {v4, v1, v2, v3, v5}, Ljf;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0, v4}, Lch0;->a(Lvr2;)Lwv2;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    return-object v0

    .line 1003
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
