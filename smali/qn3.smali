.class public abstract Lqn3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic a:[Lyr3;

.field public static final b:Lqc3;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lqp4;

    .line 2
    .line 3
    const-class v1, Lqn3;

    .line 4
    .line 5
    const-string v2, "hasAnnotationsInBytecode"

    .line 6
    .line 7
    const-string v3, "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lqp4;

    .line 14
    .line 15
    const-string v5, "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z"

    .line 16
    .line 17
    invoke-direct {v3, v1, v2, v5, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance v5, Lqp4;

    .line 21
    .line 22
    const-string v6, "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z"

    .line 23
    .line 24
    invoke-direct {v5, v1, v2, v6, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    new-instance v6, Lqp4;

    .line 28
    .line 29
    const-string v7, "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z"

    .line 30
    .line 31
    invoke-direct {v6, v1, v2, v7, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    new-instance v7, Lqp4;

    .line 35
    .line 36
    const-string v8, "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z"

    .line 37
    .line 38
    invoke-direct {v7, v1, v2, v8, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v8, Lqp4;

    .line 42
    .line 43
    const-string v9, "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z"

    .line 44
    .line 45
    invoke-direct {v8, v1, v2, v9, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lqp4;

    .line 49
    .line 50
    const-string v9, "isMovedFromInterfaceCompanion"

    .line 51
    .line 52
    const-string v10, "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z"

    .line 53
    .line 54
    invoke-direct {v2, v1, v9, v10, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    new-instance v9, Lqp4;

    .line 58
    .line 59
    const-string v10, "hasMethodBodiesInInterface"

    .line 60
    .line 61
    const-string v11, "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z"

    .line 62
    .line 63
    invoke-direct {v9, v1, v10, v11, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    new-instance v10, Lqp4;

    .line 67
    .line 68
    const-string v11, "isCompiledInCompatibilityMode"

    .line 69
    .line 70
    const-string v12, "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z"

    .line 71
    .line 72
    invoke-direct {v10, v1, v11, v12, v4}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x9

    .line 76
    .line 77
    new-array v1, v1, [Lyr3;

    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    aput-object v0, v1, v11

    .line 81
    .line 82
    aput-object v3, v1, v4

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    aput-object v5, v1, v0

    .line 86
    .line 87
    const/4 v0, 0x3

    .line 88
    aput-object v6, v1, v0

    .line 89
    .line 90
    const/4 v0, 0x4

    .line 91
    aput-object v7, v1, v0

    .line 92
    .line 93
    const/4 v0, 0x5

    .line 94
    aput-object v8, v1, v0

    .line 95
    .line 96
    const/4 v0, 0x6

    .line 97
    aput-object v2, v1, v0

    .line 98
    .line 99
    const/4 v0, 0x7

    .line 100
    aput-object v9, v1, v0

    .line 101
    .line 102
    const/16 v0, 0x8

    .line 103
    .line 104
    aput-object v10, v1, v0

    .line 105
    .line 106
    sput-object v1, Lqn3;->a:[Lyr3;

    .line 107
    .line 108
    new-instance v0, Lsg2;

    .line 109
    .line 110
    sget-object v1, Lwg2;->c:Ltg2;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v1, v4}, Lsg2;-><init>(Lvg2;I)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Llg2;->D:Llg2;

    .line 119
    .line 120
    iget v2, v0, Lsg2;->b:I

    .line 121
    .line 122
    const-string v3, " was passed"

    .line 123
    .line 124
    const-string v5, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    .line 125
    .line 126
    if-ne v2, v4, :cond_7

    .line 127
    .line 128
    iget v2, v0, Lsg2;->c:I

    .line 129
    .line 130
    if-ne v2, v4, :cond_7

    .line 131
    .line 132
    new-instance v0, Lsg2;

    .line 133
    .line 134
    invoke-direct {v0, v1, v4}, Lsg2;-><init>(Lvg2;I)V

    .line 135
    .line 136
    .line 137
    sget v2, Lmg2;->D:I

    .line 138
    .line 139
    iget v2, v0, Lsg2;->b:I

    .line 140
    .line 141
    if-ne v2, v4, :cond_6

    .line 142
    .line 143
    new-instance v0, Lsg2;

    .line 144
    .line 145
    invoke-direct {v0, v1, v4}, Lsg2;-><init>(Lvg2;I)V

    .line 146
    .line 147
    .line 148
    sget-object v2, Lng2;->D:Lng2;

    .line 149
    .line 150
    iget v2, v0, Lsg2;->b:I

    .line 151
    .line 152
    if-ne v2, v4, :cond_5

    .line 153
    .line 154
    iget v2, v0, Lsg2;->c:I

    .line 155
    .line 156
    if-ne v2, v4, :cond_5

    .line 157
    .line 158
    new-instance v0, Lsg2;

    .line 159
    .line 160
    invoke-direct {v0, v1, v4}, Lsg2;-><init>(Lvg2;I)V

    .line 161
    .line 162
    .line 163
    sget-object v2, Lpg2;->D:Lpg2;

    .line 164
    .line 165
    iget v2, v0, Lsg2;->b:I

    .line 166
    .line 167
    if-ne v2, v4, :cond_4

    .line 168
    .line 169
    iget v2, v0, Lsg2;->c:I

    .line 170
    .line 171
    if-ne v2, v4, :cond_4

    .line 172
    .line 173
    new-instance v0, Lsg2;

    .line 174
    .line 175
    invoke-direct {v0, v1, v4}, Lsg2;-><init>(Lvg2;I)V

    .line 176
    .line 177
    .line 178
    sget-object v2, Log2;->D:Log2;

    .line 179
    .line 180
    iget v2, v0, Lsg2;->b:I

    .line 181
    .line 182
    if-ne v2, v4, :cond_3

    .line 183
    .line 184
    iget v2, v0, Lsg2;->c:I

    .line 185
    .line 186
    if-ne v2, v4, :cond_3

    .line 187
    .line 188
    new-instance v0, Lsg2;

    .line 189
    .line 190
    invoke-direct {v0, v1, v4}, Lsg2;-><init>(Lvg2;I)V

    .line 191
    .line 192
    .line 193
    sget-object v1, Lrg2;->D:Lrg2;

    .line 194
    .line 195
    iget v1, v0, Lsg2;->b:I

    .line 196
    .line 197
    if-ne v1, v4, :cond_2

    .line 198
    .line 199
    iget v1, v0, Lsg2;->c:I

    .line 200
    .line 201
    if-ne v1, v4, :cond_2

    .line 202
    .line 203
    new-instance v0, Lqc3;

    .line 204
    .line 205
    sget-object v1, Lpn3;->D:Lpn3;

    .line 206
    .line 207
    sget-object v2, Lho3;->a:Ltg2;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v6, Lsg2;

    .line 213
    .line 214
    iget v7, v2, Lvg2;->b:I

    .line 215
    .line 216
    iget v2, v2, Lvg2;->c:I

    .line 217
    .line 218
    invoke-direct {v6, v7, v2, v4}, Lsg2;-><init>(III)V

    .line 219
    .line 220
    .line 221
    invoke-direct {v0, v1, v6}, Lqc3;-><init>(Lqp4;Lsg2;)V

    .line 222
    .line 223
    .line 224
    sput-object v0, Lqn3;->b:Lqc3;

    .line 225
    .line 226
    sget-object v0, Lho3;->b:Ltg2;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance v1, Lsg2;

    .line 232
    .line 233
    iget v2, v0, Lvg2;->b:I

    .line 234
    .line 235
    iget v0, v0, Lvg2;->c:I

    .line 236
    .line 237
    invoke-direct {v1, v2, v0, v4}, Lsg2;-><init>(III)V

    .line 238
    .line 239
    .line 240
    if-ne v0, v4, :cond_1

    .line 241
    .line 242
    sget-object v0, Lho3;->c:Ltg2;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v1, Lsg2;

    .line 248
    .line 249
    iget v2, v0, Lvg2;->b:I

    .line 250
    .line 251
    iget v0, v0, Lvg2;->c:I

    .line 252
    .line 253
    invoke-direct {v1, v2, v0, v4}, Lsg2;-><init>(III)V

    .line 254
    .line 255
    .line 256
    if-ne v0, v4, :cond_0

    .line 257
    .line 258
    return-void

    .line 259
    :cond_0
    invoke-static {v5, v1, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_1
    invoke-static {v5, v1, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_2
    invoke-static {v5, v0, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_3
    invoke-static {v5, v0, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_4
    invoke-static {v5, v0, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_5
    invoke-static {v5, v0, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_6
    invoke-static {v5, v0, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_7
    invoke-static {v5, v0, v3}, Lb81;->m(Ljava/lang/String;Lsg2;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    return-void
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
