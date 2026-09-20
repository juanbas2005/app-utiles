.class public final Lwd3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# static fields
.field public static final a:Lwd3;

.field public static final b:Lpo5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwd3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwd3;->a:Lwd3;

    .line 7
    .line 8
    new-instance v0, Lpo5;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, Lno5;->t:Lno5;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lpo5;-><init>(Ljava/lang/String;Lno5;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lwd3;->b:Lpo5;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 26

    .line 1
    sget-object v0, Lqd3;->y:Lqd3;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lok1;->t()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lyt1;

    .line 17
    .line 18
    const-string v2, "An empty string is not a valid Instant"

    .line 19
    .line 20
    invoke-direct {v1, v2, v0}, Lyt1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_15

    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    const/16 v4, 0x2b

    .line 33
    .line 34
    const/16 v5, 0x2d

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    if-eq v2, v4, :cond_1

    .line 38
    .line 39
    if-eq v2, v5, :cond_1

    .line 40
    .line 41
    move v7, v1

    .line 42
    move v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v7, v6

    .line 45
    :goto_0
    move v9, v1

    .line 46
    move v8, v7

    .line 47
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    const/16 v11, 0x3a

    .line 52
    .line 53
    const/16 v12, 0x30

    .line 54
    .line 55
    if-ge v8, v10, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    if-gt v12, v10, :cond_2

    .line 62
    .line 63
    if-ge v10, v11, :cond_2

    .line 64
    .line 65
    mul-int/lit8 v9, v9, 0xa

    .line 66
    .line 67
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    sub-int/2addr v10, v12

    .line 72
    add-int/2addr v9, v10

    .line 73
    add-int/lit8 v8, v8, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    sub-int v10, v8, v7

    .line 77
    .line 78
    const-string v13, " digits"

    .line 79
    .line 80
    const/16 v14, 0xa

    .line 81
    .line 82
    if-le v10, v14, :cond_3

    .line 83
    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v2, "Expected at most 10 digits for the year number, got "

    .line 87
    .line 88
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto/16 :goto_15

    .line 106
    .line 107
    :cond_3
    if-ne v10, v14, :cond_4

    .line 108
    .line 109
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    const/16 v15, 0x32

    .line 114
    .line 115
    if-lt v7, v15, :cond_4

    .line 116
    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 120
    .line 121
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    goto/16 :goto_15

    .line 139
    .line 140
    :cond_4
    const/4 v7, 0x4

    .line 141
    if-ge v10, v7, :cond_5

    .line 142
    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 146
    .line 147
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    goto/16 :goto_15

    .line 165
    .line 166
    :cond_5
    if-ne v2, v4, :cond_6

    .line 167
    .line 168
    if-ne v10, v7, :cond_6

    .line 169
    .line 170
    const-string v1, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 171
    .line 172
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    goto/16 :goto_15

    .line 177
    .line 178
    :cond_6
    if-ne v2, v3, :cond_7

    .line 179
    .line 180
    if-eq v10, v7, :cond_7

    .line 181
    .line 182
    const-string v1, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 183
    .line 184
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    goto/16 :goto_15

    .line 189
    .line 190
    :cond_7
    if-ne v2, v5, :cond_8

    .line 191
    .line 192
    neg-int v9, v9

    .line 193
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    add-int/lit8 v3, v8, 0x10

    .line 198
    .line 199
    if-ge v2, v3, :cond_9

    .line 200
    .line 201
    const-string v1, "The input string is too short"

    .line 202
    .line 203
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto/16 :goto_15

    .line 208
    .line 209
    :cond_9
    new-instance v2, Lvd2;

    .line 210
    .line 211
    const/16 v10, 0x15

    .line 212
    .line 213
    invoke-direct {v2, v10}, Lvd2;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const-string v10, "\'-\'"

    .line 217
    .line 218
    invoke-static {v0, v2, v10, v8}, Ltf4;->J(Ljava/lang/String;Lvr2;Ljava/lang/String;I)Lyt1;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-eqz v2, :cond_a

    .line 223
    .line 224
    move-object v1, v2

    .line 225
    goto/16 :goto_15

    .line 226
    .line 227
    :cond_a
    add-int/lit8 v2, v8, 0x3

    .line 228
    .line 229
    new-instance v15, Lvd2;

    .line 230
    .line 231
    const/16 v1, 0x16

    .line 232
    .line 233
    invoke-direct {v15, v1}, Lvd2;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-static {v0, v15, v10, v2}, Ltf4;->J(Ljava/lang/String;Lvr2;Ljava/lang/String;I)Lyt1;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    if-eqz v1, :cond_b

    .line 241
    .line 242
    goto/16 :goto_15

    .line 243
    .line 244
    :cond_b
    add-int/lit8 v1, v8, 0x6

    .line 245
    .line 246
    new-instance v2, Lvd2;

    .line 247
    .line 248
    const/16 v10, 0x17

    .line 249
    .line 250
    invoke-direct {v2, v10}, Lvd2;-><init>(I)V

    .line 251
    .line 252
    .line 253
    const-string v15, "\'T\' or \'t\'"

    .line 254
    .line 255
    invoke-static {v0, v2, v15, v1}, Ltf4;->J(Ljava/lang/String;Lvr2;Ljava/lang/String;I)Lyt1;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-eqz v1, :cond_c

    .line 260
    .line 261
    goto/16 :goto_15

    .line 262
    .line 263
    :cond_c
    add-int/lit8 v1, v8, 0x9

    .line 264
    .line 265
    new-instance v2, Lvd2;

    .line 266
    .line 267
    const/16 v15, 0x18

    .line 268
    .line 269
    invoke-direct {v2, v15}, Lvd2;-><init>(I)V

    .line 270
    .line 271
    .line 272
    const-string v15, "\':\'"

    .line 273
    .line 274
    invoke-static {v0, v2, v15, v1}, Ltf4;->J(Ljava/lang/String;Lvr2;Ljava/lang/String;I)Lyt1;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-eqz v1, :cond_d

    .line 279
    .line 280
    goto/16 :goto_15

    .line 281
    .line 282
    :cond_d
    add-int/lit8 v1, v8, 0xc

    .line 283
    .line 284
    new-instance v2, Lvd2;

    .line 285
    .line 286
    const/16 v10, 0x19

    .line 287
    .line 288
    invoke-direct {v2, v10}, Lvd2;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v0, v2, v15, v1}, Ltf4;->J(Ljava/lang/String;Lvr2;Ljava/lang/String;I)Lyt1;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-eqz v1, :cond_e

    .line 296
    .line 297
    goto/16 :goto_15

    .line 298
    .line 299
    :cond_e
    sget-object v1, Ltf4;->d:[I

    .line 300
    .line 301
    const/4 v2, 0x0

    .line 302
    :goto_2
    if-ge v2, v14, :cond_10

    .line 303
    .line 304
    aget v10, v1, v2

    .line 305
    .line 306
    add-int/2addr v10, v8

    .line 307
    new-instance v15, Lvd2;

    .line 308
    .line 309
    const/16 v7, 0x1a

    .line 310
    .line 311
    invoke-direct {v15, v7}, Lvd2;-><init>(I)V

    .line 312
    .line 313
    .line 314
    const-string v7, "an ASCII digit"

    .line 315
    .line 316
    invoke-static {v0, v15, v7, v10}, Ltf4;->J(Ljava/lang/String;Lvr2;Ljava/lang/String;I)Lyt1;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    if-eqz v7, :cond_f

    .line 321
    .line 322
    move-object v1, v7

    .line 323
    goto/16 :goto_15

    .line 324
    .line 325
    :cond_f
    add-int/lit8 v2, v2, 0x1

    .line 326
    .line 327
    const/4 v7, 0x4

    .line 328
    goto :goto_2

    .line 329
    :cond_10
    add-int/lit8 v1, v8, 0x1

    .line 330
    .line 331
    invoke-static {v1, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    add-int/lit8 v2, v8, 0x4

    .line 336
    .line 337
    invoke-static {v2, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    add-int/lit8 v7, v8, 0x7

    .line 342
    .line 343
    invoke-static {v7, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    add-int/lit8 v10, v8, 0xa

    .line 348
    .line 349
    invoke-static {v10, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    add-int/lit8 v15, v8, 0xd

    .line 354
    .line 355
    invoke-static {v15, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 356
    .line 357
    .line 358
    move-result v15

    .line 359
    add-int/lit8 v8, v8, 0xf

    .line 360
    .line 361
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 362
    .line 363
    .line 364
    move-result v5

    .line 365
    const/16 v4, 0x2e

    .line 366
    .line 367
    const/16 v14, 0x9

    .line 368
    .line 369
    if-ne v5, v4, :cond_13

    .line 370
    .line 371
    move v8, v3

    .line 372
    const/4 v4, 0x0

    .line 373
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-ge v8, v5, :cond_11

    .line 378
    .line 379
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-gt v12, v5, :cond_11

    .line 384
    .line 385
    if-ge v5, v11, :cond_11

    .line 386
    .line 387
    mul-int/lit8 v4, v4, 0xa

    .line 388
    .line 389
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    sub-int/2addr v5, v12

    .line 394
    add-int/2addr v4, v5

    .line 395
    add-int/lit8 v8, v8, 0x1

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_11
    sub-int v3, v8, v3

    .line 399
    .line 400
    if-gt v6, v3, :cond_12

    .line 401
    .line 402
    const/16 v5, 0xa

    .line 403
    .line 404
    if-ge v3, v5, :cond_12

    .line 405
    .line 406
    sget-object v5, Ltf4;->c:[I

    .line 407
    .line 408
    rsub-int/lit8 v3, v3, 0x9

    .line 409
    .line 410
    aget v3, v5, v3

    .line 411
    .line 412
    mul-int/2addr v4, v3

    .line 413
    goto :goto_4

    .line 414
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 417
    .line 418
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    goto/16 :goto_15

    .line 436
    .line 437
    :cond_13
    const/4 v4, 0x0

    .line 438
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-lt v8, v3, :cond_14

    .line 443
    .line 444
    const-string v1, "The UTC offset at the end of the string is missing"

    .line 445
    .line 446
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    goto/16 :goto_15

    .line 451
    .line 452
    :cond_14
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    const/4 v5, 0x2

    .line 457
    const/16 v13, 0x27

    .line 458
    .line 459
    move/from16 v19, v6

    .line 460
    .line 461
    const-string v6, ", got \'"

    .line 462
    .line 463
    const/16 v12, 0x2b

    .line 464
    .line 465
    if-eq v3, v12, :cond_17

    .line 466
    .line 467
    const/16 v12, 0x2d

    .line 468
    .line 469
    if-eq v3, v12, :cond_17

    .line 470
    .line 471
    const/16 v11, 0x5a

    .line 472
    .line 473
    if-eq v3, v11, :cond_15

    .line 474
    .line 475
    const/16 v11, 0x7a

    .line 476
    .line 477
    if-eq v3, v11, :cond_15

    .line 478
    .line 479
    new-instance v1, Ljava/lang/StringBuilder;

    .line 480
    .line 481
    const-string v2, "Expected the UTC offset at position "

    .line 482
    .line 483
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    goto/16 :goto_15

    .line 507
    .line 508
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    add-int/lit8 v8, v8, 0x1

    .line 513
    .line 514
    if-ne v3, v8, :cond_16

    .line 515
    .line 516
    const/4 v6, 0x0

    .line 517
    :goto_5
    move/from16 v3, v19

    .line 518
    .line 519
    goto/16 :goto_f

    .line 520
    .line 521
    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    const-string v2, "Extra text after the instant at position "

    .line 524
    .line 525
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    goto/16 :goto_15

    .line 540
    .line 541
    :cond_17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 542
    .line 543
    .line 544
    move-result v12

    .line 545
    sub-int/2addr v12, v8

    .line 546
    if-le v12, v14, :cond_18

    .line 547
    .line 548
    new-instance v1, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    const-string v2, "The UTC offset string \""

    .line 551
    .line 552
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/16 v3, 0x10

    .line 568
    .line 569
    invoke-static {v3, v2}, Ltf4;->R(ILjava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    const-string v2, "\" is too long"

    .line 577
    .line 578
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    goto/16 :goto_15

    .line 590
    .line 591
    :cond_18
    rem-int/lit8 v18, v12, 0x3

    .line 592
    .line 593
    if-eqz v18, :cond_19

    .line 594
    .line 595
    new-instance v1, Ljava/lang/StringBuilder;

    .line 596
    .line 597
    const-string v2, "Invalid UTC offset string \""

    .line 598
    .line 599
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    const/16 v2, 0x22

    .line 618
    .line 619
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    goto/16 :goto_15

    .line 631
    .line 632
    :cond_19
    sget-object v18, Ltf4;->e:[I

    .line 633
    .line 634
    const/4 v14, 0x0

    .line 635
    :goto_6
    if-ge v14, v5, :cond_1c

    .line 636
    .line 637
    aget v24, v18, v14

    .line 638
    .line 639
    add-int v5, v8, v24

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 642
    .line 643
    .line 644
    move-result v13

    .line 645
    if-lt v5, v13, :cond_1a

    .line 646
    .line 647
    goto :goto_7

    .line 648
    :cond_1a
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 649
    .line 650
    .line 651
    move-result v13

    .line 652
    if-eq v13, v11, :cond_1b

    .line 653
    .line 654
    const-string v1, "Expected \':\' at index "

    .line 655
    .line 656
    invoke-static {v5, v1, v6}, Lpb4;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    const/16 v2, 0x27

    .line 668
    .line 669
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    goto/16 :goto_15

    .line 681
    .line 682
    :cond_1b
    add-int/lit8 v14, v14, 0x1

    .line 683
    .line 684
    const/4 v5, 0x2

    .line 685
    const/16 v13, 0x27

    .line 686
    .line 687
    goto :goto_6

    .line 688
    :cond_1c
    :goto_7
    sget-object v5, Ltf4;->f:[I

    .line 689
    .line 690
    const/4 v13, 0x0

    .line 691
    :goto_8
    const/4 v14, 0x6

    .line 692
    if-ge v13, v14, :cond_1f

    .line 693
    .line 694
    aget v14, v5, v13

    .line 695
    .line 696
    add-int/2addr v14, v8

    .line 697
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 698
    .line 699
    .line 700
    move-result v11

    .line 701
    if-lt v14, v11, :cond_1d

    .line 702
    .line 703
    goto :goto_9

    .line 704
    :cond_1d
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 705
    .line 706
    .line 707
    move-result v11

    .line 708
    move-object/from16 v25, v5

    .line 709
    .line 710
    const/16 v5, 0x30

    .line 711
    .line 712
    if-gt v5, v11, :cond_1e

    .line 713
    .line 714
    const/16 v5, 0x3a

    .line 715
    .line 716
    if-ge v11, v5, :cond_1e

    .line 717
    .line 718
    add-int/lit8 v13, v13, 0x1

    .line 719
    .line 720
    move v11, v5

    .line 721
    move-object/from16 v5, v25

    .line 722
    .line 723
    goto :goto_8

    .line 724
    :cond_1e
    const-string v1, "Expected an ASCII digit at index "

    .line 725
    .line 726
    invoke-static {v14, v1, v6}, Lpb4;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    const/16 v2, 0x27

    .line 738
    .line 739
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    goto/16 :goto_15

    .line 751
    .line 752
    :cond_1f
    :goto_9
    add-int/lit8 v5, v8, 0x1

    .line 753
    .line 754
    invoke-static {v5, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 755
    .line 756
    .line 757
    move-result v5

    .line 758
    const/4 v6, 0x3

    .line 759
    if-le v12, v6, :cond_20

    .line 760
    .line 761
    add-int/lit8 v6, v8, 0x4

    .line 762
    .line 763
    invoke-static {v6, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 764
    .line 765
    .line 766
    move-result v6

    .line 767
    :goto_a
    const/4 v14, 0x6

    .line 768
    goto :goto_b

    .line 769
    :cond_20
    const/4 v6, 0x0

    .line 770
    goto :goto_a

    .line 771
    :goto_b
    if-le v12, v14, :cond_21

    .line 772
    .line 773
    add-int/lit8 v11, v8, 0x7

    .line 774
    .line 775
    invoke-static {v11, v0}, Ltf4;->L(ILjava/lang/String;)I

    .line 776
    .line 777
    .line 778
    move-result v11

    .line 779
    :goto_c
    const/16 v12, 0x3b

    .line 780
    .line 781
    goto :goto_d

    .line 782
    :cond_21
    const/4 v11, 0x0

    .line 783
    goto :goto_c

    .line 784
    :goto_d
    if-le v6, v12, :cond_22

    .line 785
    .line 786
    new-instance v1, Ljava/lang/StringBuilder;

    .line 787
    .line 788
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 789
    .line 790
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    goto/16 :goto_15

    .line 805
    .line 806
    :cond_22
    if-le v11, v12, :cond_23

    .line 807
    .line 808
    new-instance v1, Ljava/lang/StringBuilder;

    .line 809
    .line 810
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 811
    .line 812
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    goto/16 :goto_15

    .line 827
    .line 828
    :cond_23
    const/16 v12, 0x11

    .line 829
    .line 830
    if-le v5, v12, :cond_25

    .line 831
    .line 832
    const/16 v12, 0x12

    .line 833
    .line 834
    if-ne v5, v12, :cond_24

    .line 835
    .line 836
    if-nez v6, :cond_24

    .line 837
    .line 838
    if-eqz v11, :cond_25

    .line 839
    .line 840
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 841
    .line 842
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 843
    .line 844
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    goto/16 :goto_15

    .line 871
    .line 872
    :cond_25
    mul-int/lit16 v5, v5, 0xe10

    .line 873
    .line 874
    mul-int/lit8 v6, v6, 0x3c

    .line 875
    .line 876
    add-int/2addr v6, v5

    .line 877
    add-int/2addr v6, v11

    .line 878
    const/16 v12, 0x2d

    .line 879
    .line 880
    if-ne v3, v12, :cond_26

    .line 881
    .line 882
    const/4 v3, -0x1

    .line 883
    goto :goto_e

    .line 884
    :cond_26
    move/from16 v3, v19

    .line 885
    .line 886
    :goto_e
    mul-int/2addr v6, v3

    .line 887
    goto/16 :goto_5

    .line 888
    .line 889
    :goto_f
    if-gt v3, v1, :cond_34

    .line 890
    .line 891
    const/16 v5, 0xd

    .line 892
    .line 893
    if-ge v1, v5, :cond_34

    .line 894
    .line 895
    if-gt v3, v2, :cond_33

    .line 896
    .line 897
    and-int/lit8 v3, v9, 0x3

    .line 898
    .line 899
    if-nez v3, :cond_28

    .line 900
    .line 901
    rem-int/lit8 v5, v9, 0x64

    .line 902
    .line 903
    if-nez v5, :cond_27

    .line 904
    .line 905
    rem-int/lit16 v5, v9, 0x190

    .line 906
    .line 907
    if-nez v5, :cond_28

    .line 908
    .line 909
    :cond_27
    const/4 v5, 0x1

    .line 910
    :goto_10
    const/4 v8, 0x2

    .line 911
    goto :goto_11

    .line 912
    :cond_28
    const/4 v5, 0x0

    .line 913
    goto :goto_10

    .line 914
    :goto_11
    if-eq v1, v8, :cond_2a

    .line 915
    .line 916
    const/4 v8, 0x4

    .line 917
    if-eq v1, v8, :cond_29

    .line 918
    .line 919
    const/4 v14, 0x6

    .line 920
    if-eq v1, v14, :cond_29

    .line 921
    .line 922
    const/16 v5, 0x9

    .line 923
    .line 924
    if-eq v1, v5, :cond_29

    .line 925
    .line 926
    const/16 v5, 0xb

    .line 927
    .line 928
    if-eq v1, v5, :cond_29

    .line 929
    .line 930
    const/16 v5, 0x1f

    .line 931
    .line 932
    goto :goto_12

    .line 933
    :cond_29
    const/16 v5, 0x1e

    .line 934
    .line 935
    goto :goto_12

    .line 936
    :cond_2a
    if-eqz v5, :cond_2b

    .line 937
    .line 938
    const/16 v5, 0x1d

    .line 939
    .line 940
    goto :goto_12

    .line 941
    :cond_2b
    const/16 v5, 0x1c

    .line 942
    .line 943
    :goto_12
    if-gt v2, v5, :cond_33

    .line 944
    .line 945
    const/16 v5, 0x17

    .line 946
    .line 947
    if-le v7, v5, :cond_2c

    .line 948
    .line 949
    new-instance v1, Ljava/lang/StringBuilder;

    .line 950
    .line 951
    const-string v2, "Expected hour in 0..23, got "

    .line 952
    .line 953
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    goto/16 :goto_15

    .line 968
    .line 969
    :cond_2c
    const/16 v12, 0x3b

    .line 970
    .line 971
    if-le v10, v12, :cond_2d

    .line 972
    .line 973
    new-instance v1, Ljava/lang/StringBuilder;

    .line 974
    .line 975
    const-string v2, "Expected minute-of-hour in 0..59, got "

    .line 976
    .line 977
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 981
    .line 982
    .line 983
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    goto/16 :goto_15

    .line 992
    .line 993
    :cond_2d
    if-le v15, v12, :cond_2e

    .line 994
    .line 995
    new-instance v1, Ljava/lang/StringBuilder;

    .line 996
    .line 997
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 998
    .line 999
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    goto/16 :goto_15

    .line 1014
    .line 1015
    :cond_2e
    int-to-long v11, v9

    .line 1016
    const-wide/16 v13, 0x16d

    .line 1017
    .line 1018
    mul-long/2addr v13, v11

    .line 1019
    const-wide/16 v16, 0x0

    .line 1020
    .line 1021
    cmp-long v0, v11, v16

    .line 1022
    .line 1023
    if-ltz v0, :cond_2f

    .line 1024
    .line 1025
    const-wide/16 v16, 0x3

    .line 1026
    .line 1027
    add-long v16, v11, v16

    .line 1028
    .line 1029
    const-wide/16 v20, 0x4

    .line 1030
    .line 1031
    div-long v16, v16, v20

    .line 1032
    .line 1033
    const-wide/16 v20, 0x63

    .line 1034
    .line 1035
    add-long v20, v11, v20

    .line 1036
    .line 1037
    const-wide/16 v22, 0x64

    .line 1038
    .line 1039
    div-long v20, v20, v22

    .line 1040
    .line 1041
    sub-long v16, v16, v20

    .line 1042
    .line 1043
    const-wide/16 v20, 0x18f

    .line 1044
    .line 1045
    add-long v11, v11, v20

    .line 1046
    .line 1047
    const-wide/16 v20, 0x190

    .line 1048
    .line 1049
    div-long v11, v11, v20

    .line 1050
    .line 1051
    add-long v11, v11, v16

    .line 1052
    .line 1053
    add-long/2addr v11, v13

    .line 1054
    goto :goto_13

    .line 1055
    :cond_2f
    const-wide/16 v16, -0x4

    .line 1056
    .line 1057
    div-long v16, v11, v16

    .line 1058
    .line 1059
    const-wide/16 v20, -0x64

    .line 1060
    .line 1061
    div-long v20, v11, v20

    .line 1062
    .line 1063
    sub-long v16, v16, v20

    .line 1064
    .line 1065
    const-wide/16 v20, -0x190

    .line 1066
    .line 1067
    div-long v11, v11, v20

    .line 1068
    .line 1069
    add-long v11, v11, v16

    .line 1070
    .line 1071
    sub-long v11, v13, v11

    .line 1072
    .line 1073
    :goto_13
    mul-int/lit16 v0, v1, 0x16f

    .line 1074
    .line 1075
    add-int/lit16 v0, v0, -0x16a

    .line 1076
    .line 1077
    div-int/lit8 v0, v0, 0xc

    .line 1078
    .line 1079
    int-to-long v13, v0

    .line 1080
    add-long/2addr v11, v13

    .line 1081
    const/16 v19, 0x1

    .line 1082
    .line 1083
    add-int/lit8 v2, v2, -0x1

    .line 1084
    .line 1085
    int-to-long v13, v2

    .line 1086
    add-long/2addr v11, v13

    .line 1087
    const/4 v8, 0x2

    .line 1088
    if-le v1, v8, :cond_32

    .line 1089
    .line 1090
    const-wide/16 v0, -0x1

    .line 1091
    .line 1092
    add-long/2addr v0, v11

    .line 1093
    if-nez v3, :cond_31

    .line 1094
    .line 1095
    rem-int/lit8 v2, v9, 0x64

    .line 1096
    .line 1097
    if-nez v2, :cond_30

    .line 1098
    .line 1099
    rem-int/lit16 v9, v9, 0x190

    .line 1100
    .line 1101
    if-nez v9, :cond_31

    .line 1102
    .line 1103
    :cond_30
    move-wide v11, v0

    .line 1104
    goto :goto_14

    .line 1105
    :cond_31
    const-wide/16 v0, -0x2

    .line 1106
    .line 1107
    add-long/2addr v11, v0

    .line 1108
    :cond_32
    :goto_14
    const-wide/32 v0, 0xafaa8

    .line 1109
    .line 1110
    .line 1111
    sub-long/2addr v11, v0

    .line 1112
    mul-int/lit16 v7, v7, 0xe10

    .line 1113
    .line 1114
    mul-int/lit8 v10, v10, 0x3c

    .line 1115
    .line 1116
    add-int/2addr v10, v7

    .line 1117
    add-int/2addr v10, v15

    .line 1118
    const-wide/32 v0, 0x15180

    .line 1119
    .line 1120
    .line 1121
    mul-long/2addr v11, v0

    .line 1122
    int-to-long v0, v10

    .line 1123
    add-long/2addr v11, v0

    .line 1124
    int-to-long v0, v6

    .line 1125
    sub-long/2addr v11, v0

    .line 1126
    new-instance v1, Lud3;

    .line 1127
    .line 1128
    invoke-direct {v1, v11, v12, v4}, Lud3;-><init>(JI)V

    .line 1129
    .line 1130
    .line 1131
    goto :goto_15

    .line 1132
    :cond_33
    const-string v3, " of year "

    .line 1133
    .line 1134
    const-string v4, ", got "

    .line 1135
    .line 1136
    const-string v5, "Expected a valid day-of-month for month "

    .line 1137
    .line 1138
    invoke-static {v5, v1, v3, v9, v4}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v1

    .line 1142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v1

    .line 1153
    goto :goto_15

    .line 1154
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1155
    .line 1156
    const-string v3, "Expected a month number in 1..12, got "

    .line 1157
    .line 1158
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    invoke-static {v0, v1}, Ltf4;->K(Ljava/lang/String;Ljava/lang/String;)Lyt1;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v1

    .line 1172
    :goto_15
    invoke-interface {v1}, Lvd3;->toInstant()Lqd3;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v0

    .line 1176
    return-object v0
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

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lwd3;->b:Lpo5;

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
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lqd3;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lqd3;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, Lj42;->D(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
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
