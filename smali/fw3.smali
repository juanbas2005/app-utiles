.class public final Lfw3;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Lqw3;


# direct methods
.method public synthetic constructor <init>(Lqw3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfw3;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lfw3;->x:Lqw3;

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
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lfw3;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lfw3;->x:Lqw3;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Lqw3;->n()Ldj0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ldj0;->k()Ljava/lang/reflect/Type;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    invoke-static {v2}, Ljb5;->v(Lu16;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iget-object v0, v2, Lqw3;->A:Lsu3;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p0, v2, Lqw3;->x:Lyq3;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ltf4;->z(Lsu3;)Lap3;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v3, v3, Lap3;->b:Lfo3;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v4, p0, Lpr3;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    check-cast p0, Lpr3;

    .line 46
    .line 47
    iget-object p0, p0, Lpr3;->x:Ljava/lang/Class;

    .line 48
    .line 49
    :try_start_0
    iget-object v0, v3, Lfo3;->C:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v4, "javaField is only supported for top-level properties for now: "

    .line 59
    .line 60
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object p0, v0, Lsu3;->b:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, v2, Lqw3;->y:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v3, p0, v0}, Lrf2;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :catch_0
    :goto_0
    return-object v1

    .line 74
    :pswitch_1
    iget-object p0, v2, Lqw3;->x:Lyq3;

    .line 75
    .line 76
    instance-of v0, p0, Loq3;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    check-cast v0, Loq3;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move-object v0, v1

    .line 85
    :goto_1
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-object v0, v0, Loq3;->y:Lnz3;

    .line 88
    .line 89
    invoke-interface {v0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lkq3;

    .line 94
    .line 95
    invoke-virtual {v0}, Lkq3;->d()Lvp7;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_4
    sget-object v0, Lvp7;->d:Lvp7;

    .line 100
    .line 101
    iget-object v0, v2, Lqw3;->A:Lsu3;

    .line 102
    .line 103
    iget-object v0, v0, Lsu3;->e:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-interface {p0}, Lvp0;->b()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lm06;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {v0, v1, v2, p0}, Laa5;->f(Ljava/util/List;Lvp7;Les3;Ljava/lang/ClassLoader;)Lvp7;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :pswitch_2
    iget-object p0, v2, Lqw3;->A:Lsu3;

    .line 119
    .line 120
    iget-object p0, p0, Lsu3;->j:Luu3;

    .line 121
    .line 122
    if-eqz p0, :cond_6

    .line 123
    .line 124
    iget-object v0, v2, Lqw3;->x:Lyq3;

    .line 125
    .line 126
    invoke-interface {v0}, Lvp0;->b()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lm06;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v3, v2, Lqw3;->E:Lnz3;

    .line 135
    .line 136
    invoke-interface {v3}, Lnz3;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, Lvp7;

    .line 141
    .line 142
    invoke-static {v2}, Ljb5;->v(Lu16;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_5

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    new-instance v1, Lfw3;

    .line 150
    .line 151
    const/4 v4, 0x5

    .line 152
    invoke-direct {v1, v2, v4}, Lfw3;-><init>(Lqw3;I)V

    .line 153
    .line 154
    .line 155
    :goto_2
    const/4 v2, 0x4

    .line 156
    invoke-static {p0, v0, v3, v1, v2}, Lpd8;->M(Luu3;Ljava/lang/ClassLoader;Lvp7;Lsr2;I)Lc2;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_6
    const-string p0, "returnType"

    .line 162
    .line 163
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :pswitch_3
    iget-object v2, p0, Lfw3;->x:Lqw3;

    .line 168
    .line 169
    invoke-static {v2}, Lr16;->Z(Lp16;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_7

    .line 174
    .line 175
    iget-object p0, v2, Lqw3;->A:Lsu3;

    .line 176
    .line 177
    iget-object v3, p0, Lsu3;->h:Ljava/util/ArrayList;

    .line 178
    .line 179
    iget-object v4, p0, Lsu3;->f:Luu3;

    .line 180
    .line 181
    iget-object p0, v2, Lqw3;->E:Lnz3;

    .line 182
    .line 183
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    move-object v6, p0

    .line 188
    check-cast v6, Lvp7;

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    sget-object v5, La42;->w:La42;

    .line 192
    .line 193
    invoke-static/range {v2 .. v7}, Lag8;->l(Lsv3;Ljava/util/List;Luu3;Ljava/util/List;Lvp7;Z)Ln74;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    goto :goto_3

    .line 198
    :cond_7
    invoke-virtual {v2}, Lqw3;->a()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    :goto_3
    return-object p0

    .line 203
    :pswitch_4
    iget-object v0, p0, Lfw3;->x:Lqw3;

    .line 204
    .line 205
    iget-object p0, v0, Lqw3;->A:Lsu3;

    .line 206
    .line 207
    iget-object v1, p0, Lsu3;->h:Ljava/util/ArrayList;

    .line 208
    .line 209
    iget-object v2, p0, Lsu3;->f:Luu3;

    .line 210
    .line 211
    iget-object p0, v0, Lqw3;->E:Lnz3;

    .line 212
    .line 213
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    move-object v4, p0

    .line 218
    check-cast v4, Lvp7;

    .line 219
    .line 220
    const/4 v5, 0x1

    .line 221
    sget-object v3, La42;->w:La42;

    .line 222
    .line 223
    invoke-static/range {v0 .. v5}, Lag8;->l(Lsv3;Ljava/util/List;Luu3;Ljava/util/List;Lvp7;Z)Ln74;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
