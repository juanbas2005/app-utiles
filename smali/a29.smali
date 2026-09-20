.class public final La29;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfm8;Lt99;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La29;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La29;->c:Ljava/lang/Object;

    iput-object p2, p0, La29;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv89;Lz99;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, La29;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La29;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La29;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
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

.method public synthetic constructor <init>(Lw29;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p3, p0, La29;->a:I

    iput-object p2, p0, La29;->c:Ljava/lang/Object;

    iput-object p1, p0, La29;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, La29;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La29;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, La29;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lfm8;

    .line 12
    .line 13
    check-cast v2, Lt99;

    .line 14
    .line 15
    iget-object v0, p0, Lfm8;->x:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx49;

    .line 18
    .line 19
    new-instance v3, Lk68;

    .line 20
    .line 21
    const/16 v4, 0x1b

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct {v3, v4, v5}, Lk68;-><init>(IZ)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object v4, v0, Lx49;->f:Lx77;

    .line 28
    .line 29
    invoke-interface {v4}, Lx77;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lka9;

    .line 34
    .line 35
    iget-object v5, p0, Lfm8;->y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Landroid/net/Uri;

    .line 38
    .line 39
    new-instance v6, Lk68;

    .line 40
    .line 41
    invoke-direct {v6, v2}, Lk68;-><init>(Lpk8;)V

    .line 42
    .line 43
    .line 44
    filled-new-array {v3}, [Lk68;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v6, Lk68;->y:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v4, v5, v6}, Lka9;->a(Landroid/net/Uri;Lja9;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/Void;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v2

    .line 58
    goto :goto_0

    .line 59
    :catch_1
    move-exception v2

    .line 60
    :goto_0
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 61
    .line 62
    invoke-virtual {v0}, Lx49;->a()Ljm4;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object p0, p0, Lfm8;->z:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Ljava/lang/String;

    .line 69
    .line 70
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v4, "Failed to update snapshot for %s flags may be stale."

    .line 75
    .line 76
    invoke-static {v3, v0, v2, v4, p0}, Lc35;->q(Ljava/util/logging/Level;Ljava/util/concurrent/Executor;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-object v1

    .line 80
    :pswitch_0
    check-cast p0, Lz99;

    .line 81
    .line 82
    iget-object v0, p0, Lz99;->w:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    check-cast v2, Lv89;

    .line 88
    .line 89
    invoke-virtual {v2, v0}, Lv89;->a(Ljava/lang/String;)Lh39;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v3, Lf39;->y:Lf39;

    .line 94
    .line 95
    invoke-virtual {v0, v3}, Lh39;->i(Lf39;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    iget-object v0, p0, Lz99;->O:Ljava/lang/String;

    .line 102
    .line 103
    const/16 v4, 0x64

    .line 104
    .line 105
    invoke-static {v4, v0}, Lh39;->c(ILjava/lang/String;)Lh39;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, v3}, Lh39;->i(Lf39;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_0

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_0
    invoke-virtual {v2, p0}, Lv89;->a0(Lz99;)Lc09;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Lc09;->F()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    goto :goto_3

    .line 125
    :cond_1
    :goto_2
    invoke-virtual {v2}, Lv89;->G()Lpz8;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iget-object p0, p0, Lpz8;->J:Lmz8;

    .line 130
    .line 131
    const-string v0, "Analytics storage consent denied. Returning null app instance id"

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_3
    return-object v1

    .line 137
    :pswitch_1
    check-cast v2, Lw29;

    .line 138
    .line 139
    iget-object v0, v2, Lw29;->d:Lv89;

    .line 140
    .line 141
    invoke-virtual {v0}, Lv89;->T()V

    .line 142
    .line 143
    .line 144
    check-cast p0, Lz99;

    .line 145
    .line 146
    new-instance v0, Ldq8;

    .line 147
    .line 148
    iget-object v1, v2, Lw29;->d:Lv89;

    .line 149
    .line 150
    iget-object p0, p0, Lz99;->w:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v1, p0}, Lv89;->p0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-direct {v0, p0}, Ldq8;-><init>(Landroid/os/Bundle;)V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_2
    check-cast v2, Lw29;

    .line 161
    .line 162
    iget-object v0, v2, Lw29;->d:Lv89;

    .line 163
    .line 164
    invoke-virtual {v0}, Lv89;->T()V

    .line 165
    .line 166
    .line 167
    iget-object v0, v2, Lw29;->d:Lv89;

    .line 168
    .line 169
    iget-object v0, v0, Lv89;->y:Luq8;

    .line 170
    .line 171
    invoke-static {v0}, Lv89;->R(Lg89;)V

    .line 172
    .line 173
    .line 174
    check-cast p0, Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, p0}, Luq8;->Z1(Ljava/lang/String;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
