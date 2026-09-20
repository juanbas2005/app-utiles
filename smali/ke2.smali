.class public final Lke2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lnu5;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lnu5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lke2;->a:Lnu5;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lke2;->b:Ljava/lang/Integer;

    .line 8
    .line 9
    return-void
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

.method public static a(Ljava/util/ArrayList;La4;)Z
    .locals 3

    .line 1
    iget-object v0, p1, La4;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, La4;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La4;

    .line 20
    .line 21
    iget-object v2, v1, La4;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v1, v1, La4;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final b()Ljava/util/ArrayList;
    .locals 11

    .line 1
    iget-object p0, p0, Lke2;->a:Lnu5;

    .line 2
    .line 3
    invoke-interface {p0}, Lnu5;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lac;

    .line 8
    .line 9
    check-cast p0, Lbc;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lbc;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 20
    .line 21
    iget-object p0, p0, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a:Lyw8;

    .line 22
    .line 23
    const-string v1, "frc"

    .line 24
    .line 25
    const-string v2, ""

    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Lyw8;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/os/Bundle;

    .line 46
    .line 47
    sget-object v2, Lat8;->a:Ls93;

    .line 48
    .line 49
    invoke-static {v1}, Lz65;->k(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lzb;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "origin"

    .line 58
    .line 59
    const-class v4, Ljava/lang/String;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-static {v1, v3, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v3}, Lz65;->k(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object v3, v2, Lzb;->a:Ljava/lang/String;

    .line 72
    .line 73
    const-string v3, "name"

    .line 74
    .line 75
    invoke-static {v1, v3, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v3}, Lz65;->k(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-object v3, v2, Lzb;->b:Ljava/lang/String;

    .line 85
    .line 86
    const-string v3, "value"

    .line 87
    .line 88
    const-class v6, Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v1, v3, v6, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iput-object v3, v2, Lzb;->c:Ljava/lang/Object;

    .line 95
    .line 96
    const-string v3, "trigger_event_name"

    .line 97
    .line 98
    invoke-static {v1, v3, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    iput-object v3, v2, Lzb;->d:Ljava/lang/String;

    .line 105
    .line 106
    const-wide/16 v6, 0x0

    .line 107
    .line 108
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const-string v6, "trigger_timeout"

    .line 113
    .line 114
    const-class v7, Ljava/lang/Long;

    .line 115
    .line 116
    invoke-static {v1, v6, v7, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v8

    .line 126
    iput-wide v8, v2, Lzb;->e:J

    .line 127
    .line 128
    const-string v6, "timed_out_event_name"

    .line 129
    .line 130
    invoke-static {v1, v6, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    iput-object v6, v2, Lzb;->f:Ljava/lang/String;

    .line 137
    .line 138
    const-string v6, "timed_out_event_params"

    .line 139
    .line 140
    const-class v8, Landroid/os/Bundle;

    .line 141
    .line 142
    invoke-static {v1, v6, v8, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, Landroid/os/Bundle;

    .line 147
    .line 148
    iput-object v6, v2, Lzb;->g:Landroid/os/Bundle;

    .line 149
    .line 150
    const-string v6, "triggered_event_name"

    .line 151
    .line 152
    invoke-static {v1, v6, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/String;

    .line 157
    .line 158
    iput-object v6, v2, Lzb;->h:Ljava/lang/String;

    .line 159
    .line 160
    const-string v6, "triggered_event_params"

    .line 161
    .line 162
    invoke-static {v1, v6, v8, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Landroid/os/Bundle;

    .line 167
    .line 168
    iput-object v6, v2, Lzb;->i:Landroid/os/Bundle;

    .line 169
    .line 170
    const-string v6, "time_to_live"

    .line 171
    .line 172
    invoke-static {v1, v6, v7, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Ljava/lang/Long;

    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 179
    .line 180
    .line 181
    move-result-wide v9

    .line 182
    iput-wide v9, v2, Lzb;->j:J

    .line 183
    .line 184
    const-string v6, "expired_event_name"

    .line 185
    .line 186
    invoke-static {v1, v6, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Ljava/lang/String;

    .line 191
    .line 192
    iput-object v4, v2, Lzb;->k:Ljava/lang/String;

    .line 193
    .line 194
    const-string v4, "expired_event_params"

    .line 195
    .line 196
    invoke-static {v1, v4, v8, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Landroid/os/Bundle;

    .line 201
    .line 202
    iput-object v4, v2, Lzb;->l:Landroid/os/Bundle;

    .line 203
    .line 204
    const-class v4, Ljava/lang/Boolean;

    .line 205
    .line 206
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 207
    .line 208
    const-string v6, "active"

    .line 209
    .line 210
    invoke-static {v1, v6, v4, v5}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    iput-boolean v4, v2, Lzb;->n:Z

    .line 221
    .line 222
    const-string v4, "creation_timestamp"

    .line 223
    .line 224
    invoke-static {v1, v4, v7, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Ljava/lang/Long;

    .line 229
    .line 230
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v4

    .line 234
    iput-wide v4, v2, Lzb;->m:J

    .line 235
    .line 236
    const-string v4, "triggered_timestamp"

    .line 237
    .line 238
    invoke-static {v1, v4, v7, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Ljava/lang/Long;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 245
    .line 246
    .line 247
    move-result-wide v3

    .line 248
    iput-wide v3, v2, Lzb;->o:J

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_0
    return-object v0
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
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lke2;->a:Lnu5;

    .line 4
    .line 5
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies."

    .line 10
    .line 11
    if-eqz v2, :cond_22

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const-string v6, ""

    .line 27
    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ljava/util/Map;

    .line 35
    .line 36
    sget-object v7, La4;->g:[Ljava/lang/String;

    .line 37
    .line 38
    const-string v7, "triggerEvent"

    .line 39
    .line 40
    new-instance v8, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v9, La4;->g:[Ljava/lang/String;

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    :goto_1
    const/4 v11, 0x5

    .line 49
    if-ge v10, v11, :cond_1

    .line 50
    .line 51
    aget-object v11, v9, v10

    .line 52
    .line 53
    invoke-interface {v5, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-nez v12, :cond_0

    .line 58
    .line 59
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_3

    .line 70
    .line 71
    :try_start_0
    sget-object v8, La4;->h:Ljava/text/SimpleDateFormat;

    .line 72
    .line 73
    const-string v9, "experimentStartTime"

    .line 74
    .line 75
    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    check-cast v9, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    const-string v8, "triggerTimeoutMillis"

    .line 86
    .line 87
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    check-cast v8, Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v15

    .line 97
    const-string v8, "timeToLiveMillis"

    .line 98
    .line 99
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    check-cast v8, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v17

    .line 109
    new-instance v10, La4;

    .line 110
    .line 111
    const-string v8, "experimentId"

    .line 112
    .line 113
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v11, v8

    .line 118
    check-cast v11, Ljava/lang/String;

    .line 119
    .line 120
    const-string v8, "variantId"

    .line 121
    .line 122
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    move-object v12, v8

    .line 127
    check-cast v12, Ljava/lang/String;

    .line 128
    .line 129
    invoke-interface {v5, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_2

    .line 134
    .line 135
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    move-object v6, v5

    .line 140
    check-cast v6, Ljava/lang/String;

    .line 141
    .line 142
    :cond_2
    move-object v13, v6

    .line 143
    invoke-direct/range {v10 .. v18}, La4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JJ)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :catch_0
    move-exception v0

    .line 151
    new-instance v1, Lcom/google/firebase/abt/AbtException;

    .line 152
    .line 153
    const-string v2, "Could not process experiment: one of the durations could not be converted into a long."

    .line 154
    .line 155
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :catch_1
    move-exception v0

    .line 160
    new-instance v1, Lcom/google/firebase/abt/AbtException;

    .line 161
    .line 162
    const-string v2, "Could not process experiment: parsing experiment start time failed."

    .line 163
    .line 164
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_3
    new-instance v0, Lcom/google/firebase/abt/AbtException;

    .line 169
    .line 170
    const-string v1, "The following keys are missing from the experiment info map: %s"

    .line 171
    .line 172
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    const/4 v10, 0x0

    .line 189
    if-eqz v4, :cond_6

    .line 190
    .line 191
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-eqz v2, :cond_5

    .line 196
    .line 197
    invoke-virtual {v0}, Lke2;->b()Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_20

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, Lzb;

    .line 216
    .line 217
    iget-object v9, v2, Lzb;->b:Ljava/lang/String;

    .line 218
    .line 219
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, Lac;

    .line 224
    .line 225
    check-cast v2, Lbc;

    .line 226
    .line 227
    iget-object v2, v2, Lbc;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 228
    .line 229
    iget-object v8, v2, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a:Lyw8;

    .line 230
    .line 231
    new-instance v7, Lmv8;

    .line 232
    .line 233
    const/4 v12, 0x0

    .line 234
    move-object v11, v10

    .line 235
    invoke-direct/range {v7 .. v12}, Lmv8;-><init>(Lyw8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8, v7}, Lyw8;->c(Ltw8;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_5
    new-instance v0, Lcom/google/firebase/abt/AbtException;

    .line 243
    .line 244
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :cond_6
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    if-eqz v4, :cond_21

    .line 253
    .line 254
    invoke-virtual {v0}, Lke2;->b()Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    new-instance v4, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_8

    .line 272
    .line 273
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    check-cast v5, Lzb;

    .line 278
    .line 279
    sget-object v7, La4;->g:[Ljava/lang/String;

    .line 280
    .line 281
    iget-object v7, v5, Lzb;->d:Ljava/lang/String;

    .line 282
    .line 283
    if-eqz v7, :cond_7

    .line 284
    .line 285
    move-object v14, v7

    .line 286
    goto :goto_4

    .line 287
    :cond_7
    move-object v14, v6

    .line 288
    :goto_4
    new-instance v11, La4;

    .line 289
    .line 290
    iget-object v12, v5, Lzb;->b:Ljava/lang/String;

    .line 291
    .line 292
    iget-object v7, v5, Lzb;->c:Ljava/lang/Object;

    .line 293
    .line 294
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    new-instance v15, Ljava/util/Date;

    .line 299
    .line 300
    iget-wide v7, v5, Lzb;->m:J

    .line 301
    .line 302
    invoke-direct {v15, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 303
    .line 304
    .line 305
    iget-wide v7, v5, Lzb;->e:J

    .line 306
    .line 307
    move-object/from16 p1, v10

    .line 308
    .line 309
    move-object v9, v11

    .line 310
    iget-wide v10, v5, Lzb;->j:J

    .line 311
    .line 312
    move-wide/from16 v16, v7

    .line 313
    .line 314
    move-wide/from16 v18, v10

    .line 315
    .line 316
    move-object v11, v9

    .line 317
    invoke-direct/range {v11 .. v19}, La4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JJ)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-object/from16 v10, p1

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_8
    move-object/from16 p1, v10

    .line 327
    .line 328
    new-instance v3, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    :cond_9
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    if-eqz v6, :cond_a

    .line 342
    .line 343
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    check-cast v6, La4;

    .line 348
    .line 349
    invoke-static {v2, v6}, Lke2;->a(Ljava/util/ArrayList;La4;)Z

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    if-nez v7, :cond_9

    .line 354
    .line 355
    invoke-virtual {v6}, La4;->a()Lzb;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_b

    .line 372
    .line 373
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, Lzb;

    .line 378
    .line 379
    iget-object v9, v5, Lzb;->b:Ljava/lang/String;

    .line 380
    .line 381
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    check-cast v5, Lac;

    .line 386
    .line 387
    check-cast v5, Lbc;

    .line 388
    .line 389
    iget-object v5, v5, Lbc;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 390
    .line 391
    iget-object v8, v5, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a:Lyw8;

    .line 392
    .line 393
    new-instance v7, Lmv8;

    .line 394
    .line 395
    const/4 v12, 0x0

    .line 396
    move-object/from16 v11, p1

    .line 397
    .line 398
    move-object/from16 v10, p1

    .line 399
    .line 400
    invoke-direct/range {v7 .. v12}, Lmv8;-><init>(Lyw8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v8, v7}, Lyw8;->c(Ltw8;)V

    .line 404
    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_b
    move-object/from16 v10, p1

    .line 408
    .line 409
    new-instance v3, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    :cond_c
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    if-eqz v5, :cond_d

    .line 423
    .line 424
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    check-cast v5, La4;

    .line 429
    .line 430
    invoke-static {v4, v5}, Lke2;->a(Ljava/util/ArrayList;La4;)Z

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    if-nez v6, :cond_c

    .line 435
    .line 436
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_d
    new-instance v2, Ljava/util/ArrayDeque;

    .line 441
    .line 442
    invoke-virtual {v0}, Lke2;->b()Ljava/util/ArrayList;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    invoke-direct {v2, v4}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 447
    .line 448
    .line 449
    iget-object v4, v0, Lke2;->b:Ljava/lang/Integer;

    .line 450
    .line 451
    if-nez v4, :cond_e

    .line 452
    .line 453
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lac;

    .line 458
    .line 459
    check-cast v4, Lbc;

    .line 460
    .line 461
    iget-object v4, v4, Lbc;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 462
    .line 463
    iget-object v4, v4, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a:Lyw8;

    .line 464
    .line 465
    const-string v5, "frc"

    .line 466
    .line 467
    invoke-virtual {v4, v5}, Lyw8;->b(Ljava/lang/String;)I

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    iput-object v4, v0, Lke2;->b:Ljava/lang/Integer;

    .line 476
    .line 477
    :cond_e
    iget-object v0, v0, Lke2;->b:Ljava/lang/Integer;

    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 480
    .line 481
    .line 482
    move-result v4

    .line 483
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_20

    .line 492
    .line 493
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    check-cast v0, La4;

    .line 498
    .line 499
    :goto_9
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    if-lt v5, v4, :cond_f

    .line 504
    .line 505
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    check-cast v5, Lzb;

    .line 510
    .line 511
    iget-object v9, v5, Lzb;->b:Ljava/lang/String;

    .line 512
    .line 513
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    check-cast v5, Lac;

    .line 518
    .line 519
    check-cast v5, Lbc;

    .line 520
    .line 521
    iget-object v5, v5, Lbc;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 522
    .line 523
    iget-object v8, v5, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a:Lyw8;

    .line 524
    .line 525
    new-instance v7, Lmv8;

    .line 526
    .line 527
    const/4 v12, 0x0

    .line 528
    move-object v11, v10

    .line 529
    invoke-direct/range {v7 .. v12}, Lmv8;-><init>(Lyw8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v8, v7}, Lyw8;->c(Ltw8;)V

    .line 533
    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_f
    invoke-virtual {v0}, La4;->a()Lzb;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-interface {v1}, Lnu5;->get()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, Lac;

    .line 545
    .line 546
    move-object v6, v0

    .line 547
    check-cast v6, Lbc;

    .line 548
    .line 549
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    sget-object v0, Lat8;->a:Ls93;

    .line 553
    .line 554
    iget-object v7, v5, Lzb;->a:Ljava/lang/String;

    .line 555
    .line 556
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    if-nez v0, :cond_1f

    .line 561
    .line 562
    iget-object v0, v5, Lzb;->c:Ljava/lang/Object;

    .line 563
    .line 564
    if-eqz v0, :cond_12

    .line 565
    .line 566
    :try_start_1
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    .line 567
    .line 568
    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 569
    .line 570
    .line 571
    new-instance v9, Ljava/io/ObjectOutputStream;

    .line 572
    .line 573
    invoke-direct {v9, v8}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 574
    .line 575
    .line 576
    :try_start_2
    invoke-virtual {v9, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v9}, Ljava/io/ObjectOutputStream;->flush()V

    .line 580
    .line 581
    .line 582
    new-instance v11, Ljava/io/ObjectInputStream;

    .line 583
    .line 584
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 585
    .line 586
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 587
    .line 588
    .line 589
    move-result-object v8

    .line 590
    invoke-direct {v0, v8}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 591
    .line 592
    .line 593
    invoke-direct {v11, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 594
    .line 595
    .line 596
    :try_start_3
    invoke-virtual {v11}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 600
    :try_start_4
    invoke-virtual {v9}, Ljava/io/ObjectOutputStream;->close()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v11}, Ljava/io/ObjectInputStream;->close()V

    .line 604
    .line 605
    .line 606
    goto :goto_b

    .line 607
    :catchall_0
    move-exception v0

    .line 608
    goto :goto_a

    .line 609
    :catchall_1
    move-exception v0

    .line 610
    move-object v11, v10

    .line 611
    goto :goto_a

    .line 612
    :catchall_2
    move-exception v0

    .line 613
    move-object v9, v10

    .line 614
    move-object v11, v9

    .line 615
    :goto_a
    if-eqz v9, :cond_10

    .line 616
    .line 617
    invoke-virtual {v9}, Ljava/io/ObjectOutputStream;->close()V

    .line 618
    .line 619
    .line 620
    :cond_10
    if-eqz v11, :cond_11

    .line 621
    .line 622
    invoke-virtual {v11}, Ljava/io/ObjectInputStream;->close()V

    .line 623
    .line 624
    .line 625
    :cond_11
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_2

    .line 626
    :catch_2
    move-object v0, v10

    .line 627
    :goto_b
    if-eqz v0, :cond_1f

    .line 628
    .line 629
    :cond_12
    invoke-static {v7}, Lat8;->a(Ljava/lang/String;)Z

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    if-eqz v0, :cond_1f

    .line 634
    .line 635
    iget-object v0, v5, Lzb;->b:Ljava/lang/String;

    .line 636
    .line 637
    invoke-static {v7, v0}, Lat8;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-eqz v0, :cond_1f

    .line 642
    .line 643
    iget-object v0, v5, Lzb;->k:Ljava/lang/String;

    .line 644
    .line 645
    if-eqz v0, :cond_13

    .line 646
    .line 647
    iget-object v8, v5, Lzb;->l:Landroid/os/Bundle;

    .line 648
    .line 649
    invoke-static {v0, v8}, Lat8;->b(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    if-eqz v0, :cond_1f

    .line 654
    .line 655
    iget-object v0, v5, Lzb;->k:Ljava/lang/String;

    .line 656
    .line 657
    iget-object v8, v5, Lzb;->l:Landroid/os/Bundle;

    .line 658
    .line 659
    invoke-static {v7, v0, v8}, Lat8;->d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    if-eqz v0, :cond_1f

    .line 664
    .line 665
    :cond_13
    iget-object v0, v5, Lzb;->h:Ljava/lang/String;

    .line 666
    .line 667
    if-eqz v0, :cond_14

    .line 668
    .line 669
    iget-object v8, v5, Lzb;->i:Landroid/os/Bundle;

    .line 670
    .line 671
    invoke-static {v0, v8}, Lat8;->b(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_1f

    .line 676
    .line 677
    iget-object v0, v5, Lzb;->h:Ljava/lang/String;

    .line 678
    .line 679
    iget-object v8, v5, Lzb;->i:Landroid/os/Bundle;

    .line 680
    .line 681
    invoke-static {v7, v0, v8}, Lat8;->d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    if-eqz v0, :cond_1f

    .line 686
    .line 687
    :cond_14
    iget-object v0, v5, Lzb;->f:Ljava/lang/String;

    .line 688
    .line 689
    if-eqz v0, :cond_15

    .line 690
    .line 691
    iget-object v8, v5, Lzb;->g:Landroid/os/Bundle;

    .line 692
    .line 693
    invoke-static {v0, v8}, Lat8;->b(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eqz v0, :cond_1f

    .line 698
    .line 699
    iget-object v0, v5, Lzb;->f:Ljava/lang/String;

    .line 700
    .line 701
    iget-object v8, v5, Lzb;->g:Landroid/os/Bundle;

    .line 702
    .line 703
    invoke-static {v7, v0, v8}, Lat8;->d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-eqz v0, :cond_1f

    .line 708
    .line 709
    :cond_15
    iget-object v0, v6, Lbc;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 710
    .line 711
    new-instance v6, Landroid/os/Bundle;

    .line 712
    .line 713
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 714
    .line 715
    .line 716
    iget-object v7, v5, Lzb;->a:Ljava/lang/String;

    .line 717
    .line 718
    const-string v8, "origin"

    .line 719
    .line 720
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    iget-object v7, v5, Lzb;->b:Ljava/lang/String;

    .line 724
    .line 725
    if-eqz v7, :cond_16

    .line 726
    .line 727
    const-string v8, "name"

    .line 728
    .line 729
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    :cond_16
    iget-object v7, v5, Lzb;->c:Ljava/lang/Object;

    .line 733
    .line 734
    if-eqz v7, :cond_17

    .line 735
    .line 736
    invoke-static {v6, v7}, Lp25;->H(Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    :cond_17
    iget-object v7, v5, Lzb;->d:Ljava/lang/String;

    .line 740
    .line 741
    if-eqz v7, :cond_18

    .line 742
    .line 743
    const-string v8, "trigger_event_name"

    .line 744
    .line 745
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    :cond_18
    iget-wide v7, v5, Lzb;->e:J

    .line 749
    .line 750
    const-string v9, "trigger_timeout"

    .line 751
    .line 752
    invoke-virtual {v6, v9, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 753
    .line 754
    .line 755
    iget-object v7, v5, Lzb;->f:Ljava/lang/String;

    .line 756
    .line 757
    if-eqz v7, :cond_19

    .line 758
    .line 759
    const-string v8, "timed_out_event_name"

    .line 760
    .line 761
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    :cond_19
    iget-object v7, v5, Lzb;->g:Landroid/os/Bundle;

    .line 765
    .line 766
    if-eqz v7, :cond_1a

    .line 767
    .line 768
    const-string v8, "timed_out_event_params"

    .line 769
    .line 770
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 771
    .line 772
    .line 773
    :cond_1a
    iget-object v7, v5, Lzb;->h:Ljava/lang/String;

    .line 774
    .line 775
    if-eqz v7, :cond_1b

    .line 776
    .line 777
    const-string v8, "triggered_event_name"

    .line 778
    .line 779
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    :cond_1b
    iget-object v7, v5, Lzb;->i:Landroid/os/Bundle;

    .line 783
    .line 784
    if-eqz v7, :cond_1c

    .line 785
    .line 786
    const-string v8, "triggered_event_params"

    .line 787
    .line 788
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 789
    .line 790
    .line 791
    :cond_1c
    iget-wide v7, v5, Lzb;->j:J

    .line 792
    .line 793
    const-string v9, "time_to_live"

    .line 794
    .line 795
    invoke-virtual {v6, v9, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 796
    .line 797
    .line 798
    iget-object v7, v5, Lzb;->k:Ljava/lang/String;

    .line 799
    .line 800
    if-eqz v7, :cond_1d

    .line 801
    .line 802
    const-string v8, "expired_event_name"

    .line 803
    .line 804
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    :cond_1d
    iget-object v7, v5, Lzb;->l:Landroid/os/Bundle;

    .line 808
    .line 809
    if-eqz v7, :cond_1e

    .line 810
    .line 811
    const-string v8, "expired_event_params"

    .line 812
    .line 813
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 814
    .line 815
    .line 816
    :cond_1e
    iget-wide v7, v5, Lzb;->m:J

    .line 817
    .line 818
    const-string v9, "creation_timestamp"

    .line 819
    .line 820
    invoke-virtual {v6, v9, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 821
    .line 822
    .line 823
    iget-boolean v7, v5, Lzb;->n:Z

    .line 824
    .line 825
    const-string v8, "active"

    .line 826
    .line 827
    invoke-virtual {v6, v8, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 828
    .line 829
    .line 830
    iget-wide v7, v5, Lzb;->o:J

    .line 831
    .line 832
    const-string v9, "triggered_timestamp"

    .line 833
    .line 834
    invoke-virtual {v6, v9, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 835
    .line 836
    .line 837
    iget-object v0, v0, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a:Lyw8;

    .line 838
    .line 839
    new-instance v7, Lkv8;

    .line 840
    .line 841
    invoke-direct {v7, v0, v6}, Lkv8;-><init>(Lyw8;Landroid/os/Bundle;)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v0, v7}, Lyw8;->c(Ltw8;)V

    .line 845
    .line 846
    .line 847
    :cond_1f
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    goto/16 :goto_8

    .line 851
    .line 852
    :cond_20
    return-void

    .line 853
    :cond_21
    new-instance v0, Lcom/google/firebase/abt/AbtException;

    .line 854
    .line 855
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    throw v0

    .line 859
    :cond_22
    new-instance v0, Lcom/google/firebase/abt/AbtException;

    .line 860
    .line 861
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    throw v0
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
.end method
