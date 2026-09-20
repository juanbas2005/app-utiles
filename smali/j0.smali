.class public abstract Lj0;
.super Lql4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final w:Luq4;

.field public final x:Lib4;

.field public final y:Lib4;

.field public final z:Lib4;


# direct methods
.method public constructor <init>(Lkb4;Luq4;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lj0;->w:Luq4;

    .line 12
    .line 13
    new-instance p2, Li0;

    .line 14
    .line 15
    invoke-direct {p2, p0, v0}, Li0;-><init>(Lj0;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lib4;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lj0;->x:Lib4;

    .line 24
    .line 25
    new-instance p2, Li0;

    .line 26
    .line 27
    invoke-direct {p2, p0, v2}, Li0;-><init>(Lj0;I)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lib4;

    .line 31
    .line 32
    invoke-direct {v0, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lj0;->y:Lib4;

    .line 36
    .line 37
    new-instance p2, Li0;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p2, p0, v0}, Li0;-><init>(Lj0;I)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Lib4;

    .line 44
    .line 45
    invoke-direct {v0, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lj0;->z:Lib4;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-static {v2}, Lj0;->A0(I)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    invoke-static {v0}, Lj0;->A0(I)V

    .line 56
    .line 57
    .line 58
    throw v1
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
.end method

.method public static synthetic A0(I)V
    .locals 19

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    const/16 v3, 0x11

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v5, 0xe

    .line 12
    .line 13
    const/16 v6, 0xc

    .line 14
    .line 15
    const/16 v7, 0x9

    .line 16
    .line 17
    const/4 v8, 0x6

    .line 18
    const/4 v9, 0x5

    .line 19
    const/4 v10, 0x4

    .line 20
    const/4 v11, 0x3

    .line 21
    const/4 v12, 0x2

    .line 22
    if-eq v0, v12, :cond_0

    .line 23
    .line 24
    if-eq v0, v11, :cond_0

    .line 25
    .line 26
    if-eq v0, v10, :cond_0

    .line 27
    .line 28
    if-eq v0, v9, :cond_0

    .line 29
    .line 30
    if-eq v0, v8, :cond_0

    .line 31
    .line 32
    if-eq v0, v7, :cond_0

    .line 33
    .line 34
    if-eq v0, v6, :cond_0

    .line 35
    .line 36
    if-eq v0, v5, :cond_0

    .line 37
    .line 38
    if-eq v0, v4, :cond_0

    .line 39
    .line 40
    if-eq v0, v3, :cond_0

    .line 41
    .line 42
    if-eq v0, v2, :cond_0

    .line 43
    .line 44
    if-eq v0, v1, :cond_0

    .line 45
    .line 46
    const-string v13, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string v13, "@NotNull method %s.%s must not return null"

    .line 50
    .line 51
    :goto_0
    if-eq v0, v12, :cond_1

    .line 52
    .line 53
    if-eq v0, v11, :cond_1

    .line 54
    .line 55
    if-eq v0, v10, :cond_1

    .line 56
    .line 57
    if-eq v0, v9, :cond_1

    .line 58
    .line 59
    if-eq v0, v8, :cond_1

    .line 60
    .line 61
    if-eq v0, v7, :cond_1

    .line 62
    .line 63
    if-eq v0, v6, :cond_1

    .line 64
    .line 65
    if-eq v0, v5, :cond_1

    .line 66
    .line 67
    if-eq v0, v4, :cond_1

    .line 68
    .line 69
    if-eq v0, v3, :cond_1

    .line 70
    .line 71
    if-eq v0, v2, :cond_1

    .line 72
    .line 73
    if-eq v0, v1, :cond_1

    .line 74
    .line 75
    move v14, v11

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move v14, v12

    .line 78
    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    .line 79
    .line 80
    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor"

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    packed-switch v0, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    const-string v17, "storageManager"

    .line 88
    .line 89
    aput-object v17, v14, v16

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :pswitch_0
    const-string v17, "substitutor"

    .line 93
    .line 94
    aput-object v17, v14, v16

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_1
    const-string v17, "typeSubstitution"

    .line 98
    .line 99
    aput-object v17, v14, v16

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :pswitch_2
    const-string v17, "kotlinTypeRefiner"

    .line 103
    .line 104
    aput-object v17, v14, v16

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :pswitch_3
    const-string v17, "typeArguments"

    .line 108
    .line 109
    aput-object v17, v14, v16

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :pswitch_4
    aput-object v15, v14, v16

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :pswitch_5
    const-string v17, "name"

    .line 116
    .line 117
    aput-object v17, v14, v16

    .line 118
    .line 119
    :goto_2
    const-string v16, "getMemberScope"

    .line 120
    .line 121
    const-string v17, "substitute"

    .line 122
    .line 123
    const/16 v18, 0x1

    .line 124
    .line 125
    if-eq v0, v12, :cond_a

    .line 126
    .line 127
    if-eq v0, v11, :cond_9

    .line 128
    .line 129
    if-eq v0, v10, :cond_8

    .line 130
    .line 131
    if-eq v0, v9, :cond_7

    .line 132
    .line 133
    if-eq v0, v8, :cond_6

    .line 134
    .line 135
    if-eq v0, v7, :cond_5

    .line 136
    .line 137
    if-eq v0, v6, :cond_5

    .line 138
    .line 139
    if-eq v0, v5, :cond_5

    .line 140
    .line 141
    if-eq v0, v4, :cond_5

    .line 142
    .line 143
    if-eq v0, v3, :cond_4

    .line 144
    .line 145
    if-eq v0, v2, :cond_3

    .line 146
    .line 147
    if-eq v0, v1, :cond_2

    .line 148
    .line 149
    aput-object v15, v14, v18

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_2
    const-string v15, "getDefaultType"

    .line 153
    .line 154
    aput-object v15, v14, v18

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_3
    aput-object v17, v14, v18

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    const-string v15, "getUnsubstitutedMemberScope"

    .line 161
    .line 162
    aput-object v15, v14, v18

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    aput-object v16, v14, v18

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    const-string v15, "getContextReceivers"

    .line 169
    .line 170
    aput-object v15, v14, v18

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_7
    const-string v15, "getThisAsReceiverParameter"

    .line 174
    .line 175
    aput-object v15, v14, v18

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_8
    const-string v15, "getUnsubstitutedInnerClassesScope"

    .line 179
    .line 180
    aput-object v15, v14, v18

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_9
    const-string v15, "getOriginal"

    .line 184
    .line 185
    aput-object v15, v14, v18

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_a
    const-string v15, "getName"

    .line 189
    .line 190
    aput-object v15, v14, v18

    .line 191
    .line 192
    :goto_3
    packed-switch v0, :pswitch_data_1

    .line 193
    .line 194
    .line 195
    const-string v15, "<init>"

    .line 196
    .line 197
    aput-object v15, v14, v12

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :pswitch_6
    aput-object v17, v14, v12

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :pswitch_7
    aput-object v16, v14, v12

    .line 204
    .line 205
    :goto_4
    :pswitch_8
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    if-eq v0, v12, :cond_b

    .line 210
    .line 211
    if-eq v0, v11, :cond_b

    .line 212
    .line 213
    if-eq v0, v10, :cond_b

    .line 214
    .line 215
    if-eq v0, v9, :cond_b

    .line 216
    .line 217
    if-eq v0, v8, :cond_b

    .line 218
    .line 219
    if-eq v0, v7, :cond_b

    .line 220
    .line 221
    if-eq v0, v6, :cond_b

    .line 222
    .line 223
    if-eq v0, v5, :cond_b

    .line 224
    .line 225
    if-eq v0, v4, :cond_b

    .line 226
    .line 227
    if-eq v0, v3, :cond_b

    .line 228
    .line 229
    if-eq v0, v2, :cond_b

    .line 230
    .line 231
    if-eq v0, v1, :cond_b

    .line 232
    .line 233
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 234
    .line 235
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 240
    .line 241
    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :goto_5
    throw v0

    .line 245
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_8
        :pswitch_8
    .end packed-switch
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


# virtual methods
.method public final A(Lbq7;)Lji4;
    .locals 1

    .line 1
    invoke-static {p0}, Lrs1;->c(Lvj1;)Lsl4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lts1;->h(Lsl4;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lax3;->p:Lax3;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lj0;->G(Lbq7;Lax3;)Lji4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 p0, 0x10

    .line 18
    .line 19
    invoke-static {p0}, Lj0;->A0(I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public B0(Ldq7;)Lql4;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Ldq7;->a:Lbq7;

    .line 4
    .line 5
    invoke-virtual {v0}, Lbq7;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lh44;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lh44;-><init>(Lql4;Ldq7;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    const/16 p0, 0x12

    .line 19
    .line 20
    invoke-static {p0}, Lj0;->A0(I)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public G(Lbq7;Lax3;)Lji4;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lbq7;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lql4;->o0(Lax3;)Lji4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/16 p0, 0xc

    .line 15
    .line 16
    invoke-static {p0}, Lj0;->A0(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0

    .line 21
    :cond_1
    new-instance v0, Ldq7;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Ldq7;-><init>(Lbq7;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lc77;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lql4;->o0(Lax3;)Lji4;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0, v0}, Lc77;-><init>(Lji4;Ldq7;)V

    .line 33
    .line 34
    .line 35
    return-object p1
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

.method public final J()Lql4;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
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

.method public final P(Lzj1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lzj1;->I(Lql4;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

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

.method public final Q()Lqz3;
    .locals 0

    .line 1
    iget-object p0, p0, Lj0;->z:Lib4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lib4;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqz3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x5

    .line 13
    invoke-static {p0}, Lj0;->A0(I)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Y()Lji4;
    .locals 0

    .line 1
    iget-object p0, p0, Lj0;->y:Lib4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lib4;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lji4;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x4

    .line 13
    invoke-static {p0}, Lj0;->A0(I)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final a()Lvj1;
    .locals 0

    .line 2
    return-object p0
.end method

.method public final a()Lvq0;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
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

.method public final g0()Lfu6;
    .locals 0

    .line 1
    iget-object p0, p0, Lj0;->x:Lib4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lib4;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfu6;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 p0, 0x14

    .line 13
    .line 14
    invoke-static {p0}, Lj0;->A0(I)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
    .line 19
    .line 20
    .line 21
.end method

.method public final getName()Luq4;
    .locals 0

    .line 1
    iget-object p0, p0, Lj0;->w:Luq4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x2

    .line 7
    invoke-static {p0}, Lj0;->A0(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
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

.method public bridge synthetic h(Ldq7;)Lxj1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj0;->B0(Ldq7;)Lql4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public n0()Lji4;
    .locals 1

    .line 1
    invoke-static {p0}, Lrs1;->c(Lvj1;)Lsl4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lts1;->h(Lsl4;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lax3;->p:Lax3;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lql4;->o0(Lax3;)Lji4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 p0, 0x11

    .line 18
    .line 19
    invoke-static {p0}, Lj0;->A0(I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
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
.end method

.method public t()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x6

    .line 7
    invoke-static {p0}, Lj0;->A0(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
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
