.class public final synthetic Loz0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Loz0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Loz0;->b:Ljava/lang/Object;

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
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Loz0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const-string v0, "Requesting settings from "

    .line 10
    .line 11
    iget-object p0, p0, Loz0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lkg5;

    .line 14
    .line 15
    iget-object p0, p0, Lkg5;->y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lz00;

    .line 18
    .line 19
    iget-object v1, p0, Lz00;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lal2;

    .line 22
    .line 23
    iget-object p0, p0, Lz00;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lwp6;

    .line 26
    .line 27
    iget-object v4, v1, Lal2;->x:Ljava/lang/String;

    .line 28
    .line 29
    const-string v5, "FirebaseCrashlytics"

    .line 30
    .line 31
    const-string v6, "Settings query params were: "

    .line 32
    .line 33
    invoke-static {}, Lwr0;->q()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-static {p0}, Lal2;->d(Lwp6;)Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    new-instance v8, Lwr0;

    .line 41
    .line 42
    invoke-direct {v8, v4, v7}, Lwr0;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 43
    .line 44
    .line 45
    const-string v9, "User-Agent"

    .line 46
    .line 47
    const-string v10, "Crashlytics Android SDK/20.0.6"

    .line 48
    .line 49
    invoke-virtual {v8, v9, v10}, Lwr0;->Q(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v9, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    .line 53
    .line 54
    const-string v10, "470fa2b4ae81cd56ecbcda9735803434cec591fa"

    .line 55
    .line 56
    invoke-virtual {v8, v9, v10}, Lwr0;->Q(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v8, p0}, Lal2;->c(Lwr0;Lwp6;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-static {v5, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    invoke-static {v5, p0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v5, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    invoke-static {v5, p0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    :cond_1
    invoke-virtual {v8}, Lwr0;->B()Lg63;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v1, p0}, Lal2;->e(Lg63;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_0

    .line 106
    :catch_0
    move-exception p0

    .line 107
    const-string v0, "Settings request failed."

    .line 108
    .line 109
    invoke-static {v5, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 110
    .line 111
    .line 112
    :goto_0
    return-object v3

    .line 113
    :pswitch_0
    iget-object p0, p0, Loz0;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Lb46;

    .line 116
    .line 117
    const-string v0, "firebase"

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lb46;->b(Ljava/lang/String;)Lnf2;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_1
    iget-object p0, p0, Loz0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lp91;

    .line 127
    .line 128
    iget-object p0, p0, Lp91;->g:Lk91;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const-string v0, "FirebaseCrashlytics"

    .line 134
    .line 135
    invoke-static {}, Lwr0;->p()V

    .line 136
    .line 137
    .line 138
    iget-object v4, p0, Lk91;->c:Ljz0;

    .line 139
    .line 140
    iget-object v5, v4, Ljz0;->y:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v5, Lmd2;

    .line 143
    .line 144
    iget-object v6, v4, Ljz0;->x:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v6, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance v7, Ljava/io/File;

    .line 152
    .line 153
    iget-object v5, v5, Lmd2;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v5, Ljava/io/File;

    .line 156
    .line 157
    invoke-direct {v7, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    const/4 v7, 0x1

    .line 165
    if-nez v5, :cond_3

    .line 166
    .line 167
    iget-object v0, p0, Lk91;->m:Lkd6;

    .line 168
    .line 169
    iget-object v0, v0, Lkd6;->y:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Lwa1;

    .line 172
    .line 173
    invoke-virtual {v0}, Lwa1;->c()Ljava/util/NavigableSet;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-nez v2, :cond_2

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object v3, v0

    .line 188
    check-cast v3, Ljava/lang/String;

    .line 189
    .line 190
    :cond_2
    if-eqz v3, :cond_5

    .line 191
    .line 192
    iget-object p0, p0, Lk91;->j:Lq91;

    .line 193
    .line 194
    invoke-virtual {p0}, Lq91;->c()Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_5

    .line 199
    .line 200
    :goto_1
    move v1, v7

    .line 201
    goto :goto_2

    .line 202
    :cond_3
    const-string p0, "Found previous crash marker."

    .line 203
    .line 204
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_4

    .line 209
    .line 210
    invoke-static {v0, p0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 211
    .line 212
    .line 213
    :cond_4
    iget-object p0, v4, Ljz0;->y:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p0, Lmd2;

    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v0, Ljava/io/File;

    .line 221
    .line 222
    iget-object p0, p0, Lmd2;->d:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, Ljava/io/File;

    .line 225
    .line 226
    invoke-direct {v0, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_5
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    return-object p0

    .line 238
    :pswitch_2
    iget-object p0, p0, Loz0;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, Le01;

    .line 241
    .line 242
    monitor-enter p0

    .line 243
    :try_start_1
    iget-object v0, p0, Le01;->a:Landroid/content/Context;

    .line 244
    .line 245
    iget-object v2, p0, Le01;->b:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 248
    .line 249
    .line 250
    move-result-object v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 251
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    new-array v4, v2, [B

    .line 256
    .line 257
    invoke-virtual {v0, v4, v1, v2}, Ljava/io/FileInputStream;->read([BII)I

    .line 258
    .line 259
    .line 260
    new-instance v1, Ljava/lang/String;

    .line 261
    .line 262
    const-string v2, "UTF-8"

    .line 263
    .line 264
    invoke-direct {v1, v4, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    new-instance v2, Lorg/json/JSONObject;

    .line 268
    .line 269
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v2}, Lsz0;->a(Lorg/json/JSONObject;)Lsz0;

    .line 273
    .line 274
    .line 275
    move-result-object v3
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 276
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 277
    .line 278
    .line 279
    monitor-exit p0

    .line 280
    goto :goto_7

    .line 281
    :catchall_0
    move-exception v0

    .line 282
    goto :goto_5

    .line 283
    :catchall_1
    move-exception v1

    .line 284
    move-object v3, v0

    .line 285
    goto :goto_3

    .line 286
    :catchall_2
    move-exception v1

    .line 287
    goto :goto_3

    .line 288
    :catch_1
    move-object v0, v3

    .line 289
    goto :goto_4

    .line 290
    :goto_3
    if-eqz v3, :cond_6

    .line 291
    .line 292
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 293
    .line 294
    .line 295
    :cond_6
    throw v1

    .line 296
    :catch_2
    :goto_4
    if-eqz v0, :cond_7

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :goto_5
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 303
    throw v0

    .line 304
    :cond_7
    :goto_6
    monitor-exit p0

    .line 305
    :goto_7
    return-object v3

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
