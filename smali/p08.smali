.class public final Lp08;
.super Lo85;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp08;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final c([BII)Ljava/lang/String;
    .locals 9

    .line 1
    iget p0, p0, Lp08;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/String;

    .line 7
    .line 8
    sget-object v0, Ltf3;->a:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 11
    .line 12
    .line 13
    const v1, 0xfffd

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-gez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    add-int/2addr p3, p2

    .line 28
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    :goto_0
    return-object p0

    .line 39
    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    throw p0

    .line 44
    :pswitch_0
    or-int p0, p2, p3

    .line 45
    .line 46
    array-length v0, p1

    .line 47
    sub-int/2addr v0, p2

    .line 48
    sub-int/2addr v0, p3

    .line 49
    or-int/2addr p0, v0

    .line 50
    if-ltz p0, :cond_10

    .line 51
    .line 52
    add-int p0, p2, p3

    .line 53
    .line 54
    new-array p3, p3, [C

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    move v1, v0

    .line 58
    :goto_1
    if-ge p2, p0, :cond_2

    .line 59
    .line 60
    aget-byte v2, p1, p2

    .line 61
    .line 62
    if-ltz v2, :cond_2

    .line 63
    .line 64
    add-int/lit8 p2, p2, 0x1

    .line 65
    .line 66
    add-int/lit8 v3, v1, 0x1

    .line 67
    .line 68
    int-to-char v2, v2

    .line 69
    aput-char v2, p3, v1

    .line 70
    .line 71
    move v1, v3

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_2
    if-ge p2, p0, :cond_f

    .line 74
    .line 75
    add-int/lit8 v2, p2, 0x1

    .line 76
    .line 77
    aget-byte v3, p1, p2

    .line 78
    .line 79
    if-ltz v3, :cond_4

    .line 80
    .line 81
    add-int/lit8 p2, v1, 0x1

    .line 82
    .line 83
    int-to-char v3, v3

    .line 84
    aput-char v3, p3, v1

    .line 85
    .line 86
    :goto_3
    if-ge v2, p0, :cond_3

    .line 87
    .line 88
    aget-byte v1, p1, v2

    .line 89
    .line 90
    if-ltz v1, :cond_3

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    add-int/lit8 v3, p2, 0x1

    .line 95
    .line 96
    int-to-char v1, v1

    .line 97
    aput-char v1, p3, p2

    .line 98
    .line 99
    move p2, v3

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move v1, p2

    .line 102
    move p2, v2

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/16 v4, -0x20

    .line 105
    .line 106
    if-ge v3, v4, :cond_7

    .line 107
    .line 108
    if-ge v2, p0, :cond_6

    .line 109
    .line 110
    add-int/lit8 p2, p2, 0x2

    .line 111
    .line 112
    aget-byte v2, p1, v2

    .line 113
    .line 114
    add-int/lit8 v4, v1, 0x1

    .line 115
    .line 116
    const/16 v5, -0x3e

    .line 117
    .line 118
    if-lt v3, v5, :cond_5

    .line 119
    .line 120
    invoke-static {v2}, Lb85;->m(B)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_5

    .line 125
    .line 126
    and-int/lit8 v3, v3, 0x1f

    .line 127
    .line 128
    shl-int/lit8 v3, v3, 0x6

    .line 129
    .line 130
    and-int/lit8 v2, v2, 0x3f

    .line 131
    .line 132
    or-int/2addr v2, v3

    .line 133
    int-to-char v2, v2

    .line 134
    aput-char v2, p3, v1

    .line 135
    .line 136
    move v1, v4

    .line 137
    goto :goto_2

    .line 138
    :cond_5
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    throw p0

    .line 143
    :cond_6
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    throw p0

    .line 148
    :cond_7
    const/16 v5, -0x10

    .line 149
    .line 150
    if-ge v3, v5, :cond_c

    .line 151
    .line 152
    add-int/lit8 v5, p0, -0x1

    .line 153
    .line 154
    if-ge v2, v5, :cond_b

    .line 155
    .line 156
    add-int/lit8 v5, p2, 0x2

    .line 157
    .line 158
    aget-byte v2, p1, v2

    .line 159
    .line 160
    add-int/lit8 p2, p2, 0x3

    .line 161
    .line 162
    aget-byte v5, p1, v5

    .line 163
    .line 164
    add-int/lit8 v6, v1, 0x1

    .line 165
    .line 166
    invoke-static {v2}, Lb85;->m(B)Z

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-nez v7, :cond_a

    .line 171
    .line 172
    const/16 v7, -0x60

    .line 173
    .line 174
    if-ne v3, v4, :cond_8

    .line 175
    .line 176
    if-lt v2, v7, :cond_a

    .line 177
    .line 178
    :cond_8
    const/16 v4, -0x13

    .line 179
    .line 180
    if-ne v3, v4, :cond_9

    .line 181
    .line 182
    if-ge v2, v7, :cond_a

    .line 183
    .line 184
    :cond_9
    invoke-static {v5}, Lb85;->m(B)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_a

    .line 189
    .line 190
    and-int/lit8 v3, v3, 0xf

    .line 191
    .line 192
    shl-int/lit8 v3, v3, 0xc

    .line 193
    .line 194
    and-int/lit8 v2, v2, 0x3f

    .line 195
    .line 196
    shl-int/lit8 v2, v2, 0x6

    .line 197
    .line 198
    or-int/2addr v2, v3

    .line 199
    and-int/lit8 v3, v5, 0x3f

    .line 200
    .line 201
    or-int/2addr v2, v3

    .line 202
    int-to-char v2, v2

    .line 203
    aput-char v2, p3, v1

    .line 204
    .line 205
    move v1, v6

    .line 206
    goto/16 :goto_2

    .line 207
    .line 208
    :cond_a
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    throw p0

    .line 213
    :cond_b
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    throw p0

    .line 218
    :cond_c
    add-int/lit8 v4, p0, -0x2

    .line 219
    .line 220
    if-ge v2, v4, :cond_e

    .line 221
    .line 222
    add-int/lit8 v4, p2, 0x2

    .line 223
    .line 224
    aget-byte v2, p1, v2

    .line 225
    .line 226
    add-int/lit8 v5, p2, 0x3

    .line 227
    .line 228
    aget-byte v4, p1, v4

    .line 229
    .line 230
    add-int/lit8 p2, p2, 0x4

    .line 231
    .line 232
    aget-byte v5, p1, v5

    .line 233
    .line 234
    add-int/lit8 v6, v1, 0x1

    .line 235
    .line 236
    invoke-static {v2}, Lb85;->m(B)Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-nez v7, :cond_d

    .line 241
    .line 242
    shl-int/lit8 v7, v3, 0x1c

    .line 243
    .line 244
    add-int/lit8 v8, v2, 0x70

    .line 245
    .line 246
    add-int/2addr v8, v7

    .line 247
    shr-int/lit8 v7, v8, 0x1e

    .line 248
    .line 249
    if-nez v7, :cond_d

    .line 250
    .line 251
    invoke-static {v4}, Lb85;->m(B)Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-nez v7, :cond_d

    .line 256
    .line 257
    invoke-static {v5}, Lb85;->m(B)Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-nez v7, :cond_d

    .line 262
    .line 263
    and-int/lit8 v3, v3, 0x7

    .line 264
    .line 265
    shl-int/lit8 v3, v3, 0x12

    .line 266
    .line 267
    and-int/lit8 v2, v2, 0x3f

    .line 268
    .line 269
    shl-int/lit8 v2, v2, 0xc

    .line 270
    .line 271
    or-int/2addr v2, v3

    .line 272
    and-int/lit8 v3, v4, 0x3f

    .line 273
    .line 274
    shl-int/lit8 v3, v3, 0x6

    .line 275
    .line 276
    or-int/2addr v2, v3

    .line 277
    and-int/lit8 v3, v5, 0x3f

    .line 278
    .line 279
    or-int/2addr v2, v3

    .line 280
    ushr-int/lit8 v3, v2, 0xa

    .line 281
    .line 282
    const v4, 0xd7c0

    .line 283
    .line 284
    .line 285
    add-int/2addr v3, v4

    .line 286
    int-to-char v3, v3

    .line 287
    aput-char v3, p3, v1

    .line 288
    .line 289
    and-int/lit16 v2, v2, 0x3ff

    .line 290
    .line 291
    const v3, 0xdc00

    .line 292
    .line 293
    .line 294
    add-int/2addr v2, v3

    .line 295
    int-to-char v2, v2

    .line 296
    aput-char v2, p3, v6

    .line 297
    .line 298
    add-int/lit8 v1, v1, 0x2

    .line 299
    .line 300
    goto/16 :goto_2

    .line 301
    .line 302
    :cond_d
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    throw p0

    .line 307
    :cond_e
    invoke-static {}, Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;->a()Landroidx/datastore/preferences/protobuf/InvalidProtocolBufferException;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    throw p0

    .line 312
    :cond_f
    new-instance p0, Ljava/lang/String;

    .line 313
    .line 314
    invoke-direct {p0, p3, v0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 315
    .line 316
    .line 317
    return-object p0

    .line 318
    :cond_10
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 319
    .line 320
    array-length p1, p1

    .line 321
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object p3

    .line 333
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    const-string p2, "buffer length=%d, index=%d, size=%d"

    .line 338
    .line 339
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw p0

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final f(Ljava/lang/String;[BII)I
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    iget v3, v3, Lp08;->d:I

    .line 12
    .line 13
    const/16 v5, 0x800

    .line 14
    .line 15
    const/16 v7, 0x80

    .line 16
    .line 17
    const v8, 0xd800

    .line 18
    .line 19
    .line 20
    const-string v10, "Failed writing "

    .line 21
    .line 22
    const-string v11, " at index "

    .line 23
    .line 24
    packed-switch v3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    int-to-long v12, v2

    .line 28
    int-to-long v14, v4

    .line 29
    add-long/2addr v14, v12

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-gt v3, v4, :cond_c

    .line 35
    .line 36
    array-length v6, v1

    .line 37
    sub-int/2addr v6, v4

    .line 38
    if-lt v6, v2, :cond_c

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    :goto_0
    const-wide/16 v16, 0x1

    .line 42
    .line 43
    if-ge v6, v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ge v2, v7, :cond_0

    .line 50
    .line 51
    add-long v16, v12, v16

    .line 52
    .line 53
    int-to-byte v2, v2

    .line 54
    invoke-static {v1, v12, v13, v2}, Ltt7;->j([BJB)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    move-wide/from16 v12, v16

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    if-ne v6, v3, :cond_2

    .line 63
    .line 64
    :cond_1
    long-to-int v0, v12

    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_2
    :goto_1
    if-ge v6, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-ge v2, v7, :cond_3

    .line 74
    .line 75
    cmp-long v4, v12, v14

    .line 76
    .line 77
    if-gez v4, :cond_3

    .line 78
    .line 79
    add-long v18, v12, v16

    .line 80
    .line 81
    int-to-byte v2, v2

    .line 82
    invoke-static {v1, v12, v13, v2}, Ltt7;->j([BJB)V

    .line 83
    .line 84
    .line 85
    move-wide/from16 v12, v18

    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_3
    const-wide/16 v18, 0x2

    .line 90
    .line 91
    if-ge v2, v5, :cond_4

    .line 92
    .line 93
    sub-long v20, v14, v18

    .line 94
    .line 95
    cmp-long v4, v12, v20

    .line 96
    .line 97
    if-gtz v4, :cond_4

    .line 98
    .line 99
    move v4, v6

    .line 100
    add-long v5, v12, v16

    .line 101
    .line 102
    ushr-int/lit8 v9, v2, 0x6

    .line 103
    .line 104
    or-int/lit16 v9, v9, 0x3c0

    .line 105
    .line 106
    int-to-byte v9, v9

    .line 107
    invoke-static {v1, v12, v13, v9}, Ltt7;->j([BJB)V

    .line 108
    .line 109
    .line 110
    add-long v12, v12, v18

    .line 111
    .line 112
    and-int/lit8 v2, v2, 0x3f

    .line 113
    .line 114
    or-int/2addr v2, v7

    .line 115
    int-to-byte v2, v2

    .line 116
    invoke-static {v1, v5, v6, v2}, Ltt7;->j([BJB)V

    .line 117
    .line 118
    .line 119
    move v6, v4

    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_4
    move v4, v6

    .line 123
    const-wide/16 v5, 0x3

    .line 124
    .line 125
    if-lt v2, v8, :cond_6

    .line 126
    .line 127
    const v9, 0xdfff

    .line 128
    .line 129
    .line 130
    if-ge v9, v2, :cond_5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    move/from16 p0, v4

    .line 134
    .line 135
    move-wide/from16 p3, v5

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    :goto_2
    sub-long v22, v14, v5

    .line 139
    .line 140
    cmp-long v9, v12, v22

    .line 141
    .line 142
    if-gtz v9, :cond_5

    .line 143
    .line 144
    move-wide/from16 p3, v5

    .line 145
    .line 146
    add-long v5, v12, v16

    .line 147
    .line 148
    ushr-int/lit8 v9, v2, 0xc

    .line 149
    .line 150
    or-int/lit16 v9, v9, 0x1e0

    .line 151
    .line 152
    int-to-byte v9, v9

    .line 153
    invoke-static {v1, v12, v13, v9}, Ltt7;->j([BJB)V

    .line 154
    .line 155
    .line 156
    add-long v8, v12, v18

    .line 157
    .line 158
    ushr-int/lit8 v18, v2, 0x6

    .line 159
    .line 160
    move/from16 p0, v4

    .line 161
    .line 162
    and-int/lit8 v4, v18, 0x3f

    .line 163
    .line 164
    or-int/2addr v4, v7

    .line 165
    int-to-byte v4, v4

    .line 166
    invoke-static {v1, v5, v6, v4}, Ltt7;->j([BJB)V

    .line 167
    .line 168
    .line 169
    add-long v12, v12, p3

    .line 170
    .line 171
    and-int/lit8 v2, v2, 0x3f

    .line 172
    .line 173
    or-int/2addr v2, v7

    .line 174
    int-to-byte v2, v2

    .line 175
    invoke-static {v1, v8, v9, v2}, Ltt7;->j([BJB)V

    .line 176
    .line 177
    .line 178
    move/from16 v6, p0

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :goto_3
    const-wide/16 v4, 0x4

    .line 182
    .line 183
    sub-long v8, v14, v4

    .line 184
    .line 185
    cmp-long v6, v12, v8

    .line 186
    .line 187
    if-gtz v6, :cond_9

    .line 188
    .line 189
    add-int/lit8 v6, p0, 0x1

    .line 190
    .line 191
    if-eq v6, v3, :cond_7

    .line 192
    .line 193
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    invoke-static {v2, v8}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v9, :cond_8

    .line 202
    .line 203
    invoke-static {v2, v8}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    add-long v8, v12, v16

    .line 208
    .line 209
    move-wide/from16 v23, v4

    .line 210
    .line 211
    ushr-int/lit8 v4, v2, 0x12

    .line 212
    .line 213
    or-int/lit16 v4, v4, 0xf0

    .line 214
    .line 215
    int-to-byte v4, v4

    .line 216
    invoke-static {v1, v12, v13, v4}, Ltt7;->j([BJB)V

    .line 217
    .line 218
    .line 219
    add-long v4, v12, v18

    .line 220
    .line 221
    ushr-int/lit8 v18, v2, 0xc

    .line 222
    .line 223
    move/from16 p0, v2

    .line 224
    .line 225
    and-int/lit8 v2, v18, 0x3f

    .line 226
    .line 227
    or-int/2addr v2, v7

    .line 228
    int-to-byte v2, v2

    .line 229
    invoke-static {v1, v8, v9, v2}, Ltt7;->j([BJB)V

    .line 230
    .line 231
    .line 232
    add-long v8, v12, p3

    .line 233
    .line 234
    ushr-int/lit8 v2, p0, 0x6

    .line 235
    .line 236
    and-int/lit8 v2, v2, 0x3f

    .line 237
    .line 238
    or-int/2addr v2, v7

    .line 239
    int-to-byte v2, v2

    .line 240
    invoke-static {v1, v4, v5, v2}, Ltt7;->j([BJB)V

    .line 241
    .line 242
    .line 243
    add-long v12, v12, v23

    .line 244
    .line 245
    and-int/lit8 v2, p0, 0x3f

    .line 246
    .line 247
    or-int/2addr v2, v7

    .line 248
    int-to-byte v2, v2

    .line 249
    invoke-static {v1, v8, v9, v2}, Ltt7;->j([BJB)V

    .line 250
    .line 251
    .line 252
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 253
    .line 254
    const/16 v5, 0x800

    .line 255
    .line 256
    const v8, 0xd800

    .line 257
    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :cond_7
    move/from16 v6, p0

    .line 262
    .line 263
    :cond_8
    new-instance v0, Lr08;

    .line 264
    .line 265
    add-int/lit8 v6, v6, -0x1

    .line 266
    .line 267
    invoke-direct {v0, v6, v3}, Lr08;-><init>(II)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_9
    const v1, 0xd800

    .line 272
    .line 273
    .line 274
    if-gt v1, v2, :cond_b

    .line 275
    .line 276
    const v9, 0xdfff

    .line 277
    .line 278
    .line 279
    if-gt v2, v9, :cond_b

    .line 280
    .line 281
    add-int/lit8 v6, p0, 0x1

    .line 282
    .line 283
    if-eq v6, v3, :cond_a

    .line 284
    .line 285
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-static {v2, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-nez v0, :cond_b

    .line 294
    .line 295
    :cond_a
    new-instance v0, Lr08;

    .line 296
    .line 297
    move/from16 v4, p0

    .line 298
    .line 299
    invoke-direct {v0, v4, v3}, Lr08;-><init>(II)V

    .line 300
    .line 301
    .line 302
    throw v0

    .line 303
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 304
    .line 305
    new-instance v1, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v0

    .line 327
    :goto_5
    return v0

    .line 328
    :cond_c
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 329
    .line 330
    add-int/lit8 v3, v3, -0x1

    .line 331
    .line 332
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    add-int/2addr v2, v4

    .line 337
    new-instance v3, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-direct {v1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v1

    .line 359
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    add-int/2addr v4, v2

    .line 364
    const/4 v6, 0x0

    .line 365
    :goto_6
    if-ge v6, v3, :cond_d

    .line 366
    .line 367
    add-int v5, v6, v2

    .line 368
    .line 369
    if-ge v5, v4, :cond_d

    .line 370
    .line 371
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    if-ge v8, v7, :cond_d

    .line 376
    .line 377
    int-to-byte v8, v8

    .line 378
    aput-byte v8, v1, v5

    .line 379
    .line 380
    add-int/lit8 v6, v6, 0x1

    .line 381
    .line 382
    goto :goto_6

    .line 383
    :cond_d
    if-ne v6, v3, :cond_e

    .line 384
    .line 385
    add-int v0, v2, v3

    .line 386
    .line 387
    goto/16 :goto_9

    .line 388
    .line 389
    :cond_e
    add-int/2addr v2, v6

    .line 390
    :goto_7
    if-ge v6, v3, :cond_18

    .line 391
    .line 392
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    if-ge v5, v7, :cond_f

    .line 397
    .line 398
    if-ge v2, v4, :cond_f

    .line 399
    .line 400
    add-int/lit8 v8, v2, 0x1

    .line 401
    .line 402
    int-to-byte v5, v5

    .line 403
    aput-byte v5, v1, v2

    .line 404
    .line 405
    move v2, v8

    .line 406
    const/16 v8, 0x800

    .line 407
    .line 408
    goto/16 :goto_8

    .line 409
    .line 410
    :cond_f
    const/16 v8, 0x800

    .line 411
    .line 412
    if-ge v5, v8, :cond_10

    .line 413
    .line 414
    add-int/lit8 v9, v4, -0x2

    .line 415
    .line 416
    if-gt v2, v9, :cond_10

    .line 417
    .line 418
    add-int/lit8 v9, v2, 0x1

    .line 419
    .line 420
    ushr-int/lit8 v12, v5, 0x6

    .line 421
    .line 422
    or-int/lit16 v12, v12, 0x3c0

    .line 423
    .line 424
    int-to-byte v12, v12

    .line 425
    aput-byte v12, v1, v2

    .line 426
    .line 427
    add-int/lit8 v2, v2, 0x2

    .line 428
    .line 429
    and-int/lit8 v5, v5, 0x3f

    .line 430
    .line 431
    or-int/2addr v5, v7

    .line 432
    int-to-byte v5, v5

    .line 433
    aput-byte v5, v1, v9

    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_10
    const v9, 0xd800

    .line 437
    .line 438
    .line 439
    if-lt v5, v9, :cond_11

    .line 440
    .line 441
    const v9, 0xdfff

    .line 442
    .line 443
    .line 444
    if-ge v9, v5, :cond_12

    .line 445
    .line 446
    :cond_11
    add-int/lit8 v9, v4, -0x3

    .line 447
    .line 448
    if-gt v2, v9, :cond_12

    .line 449
    .line 450
    add-int/lit8 v9, v2, 0x1

    .line 451
    .line 452
    ushr-int/lit8 v12, v5, 0xc

    .line 453
    .line 454
    or-int/lit16 v12, v12, 0x1e0

    .line 455
    .line 456
    int-to-byte v12, v12

    .line 457
    aput-byte v12, v1, v2

    .line 458
    .line 459
    add-int/lit8 v12, v2, 0x2

    .line 460
    .line 461
    ushr-int/lit8 v13, v5, 0x6

    .line 462
    .line 463
    and-int/lit8 v13, v13, 0x3f

    .line 464
    .line 465
    or-int/2addr v13, v7

    .line 466
    int-to-byte v13, v13

    .line 467
    aput-byte v13, v1, v9

    .line 468
    .line 469
    add-int/lit8 v2, v2, 0x3

    .line 470
    .line 471
    and-int/lit8 v5, v5, 0x3f

    .line 472
    .line 473
    or-int/2addr v5, v7

    .line 474
    int-to-byte v5, v5

    .line 475
    aput-byte v5, v1, v12

    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_12
    add-int/lit8 v9, v4, -0x4

    .line 479
    .line 480
    if-gt v2, v9, :cond_15

    .line 481
    .line 482
    add-int/lit8 v9, v6, 0x1

    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 485
    .line 486
    .line 487
    move-result v12

    .line 488
    if-eq v9, v12, :cond_14

    .line 489
    .line 490
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    invoke-static {v5, v6}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 495
    .line 496
    .line 497
    move-result v12

    .line 498
    if-eqz v12, :cond_13

    .line 499
    .line 500
    invoke-static {v5, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 501
    .line 502
    .line 503
    move-result v5

    .line 504
    add-int/lit8 v6, v2, 0x1

    .line 505
    .line 506
    ushr-int/lit8 v12, v5, 0x12

    .line 507
    .line 508
    or-int/lit16 v12, v12, 0xf0

    .line 509
    .line 510
    int-to-byte v12, v12

    .line 511
    aput-byte v12, v1, v2

    .line 512
    .line 513
    add-int/lit8 v12, v2, 0x2

    .line 514
    .line 515
    ushr-int/lit8 v13, v5, 0xc

    .line 516
    .line 517
    and-int/lit8 v13, v13, 0x3f

    .line 518
    .line 519
    or-int/2addr v13, v7

    .line 520
    int-to-byte v13, v13

    .line 521
    aput-byte v13, v1, v6

    .line 522
    .line 523
    add-int/lit8 v6, v2, 0x3

    .line 524
    .line 525
    ushr-int/lit8 v13, v5, 0x6

    .line 526
    .line 527
    and-int/lit8 v13, v13, 0x3f

    .line 528
    .line 529
    or-int/2addr v13, v7

    .line 530
    int-to-byte v13, v13

    .line 531
    aput-byte v13, v1, v12

    .line 532
    .line 533
    add-int/lit8 v2, v2, 0x4

    .line 534
    .line 535
    and-int/lit8 v5, v5, 0x3f

    .line 536
    .line 537
    or-int/2addr v5, v7

    .line 538
    int-to-byte v5, v5

    .line 539
    aput-byte v5, v1, v6

    .line 540
    .line 541
    move v6, v9

    .line 542
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 543
    .line 544
    goto/16 :goto_7

    .line 545
    .line 546
    :cond_13
    move v6, v9

    .line 547
    :cond_14
    new-instance v0, Lr08;

    .line 548
    .line 549
    add-int/lit8 v6, v6, -0x1

    .line 550
    .line 551
    invoke-direct {v0, v6, v3}, Lr08;-><init>(II)V

    .line 552
    .line 553
    .line 554
    throw v0

    .line 555
    :cond_15
    const v1, 0xd800

    .line 556
    .line 557
    .line 558
    if-gt v1, v5, :cond_17

    .line 559
    .line 560
    const v9, 0xdfff

    .line 561
    .line 562
    .line 563
    if-gt v5, v9, :cond_17

    .line 564
    .line 565
    add-int/lit8 v1, v6, 0x1

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-eq v1, v4, :cond_16

    .line 572
    .line 573
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    invoke-static {v5, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-nez v0, :cond_17

    .line 582
    .line 583
    :cond_16
    new-instance v0, Lr08;

    .line 584
    .line 585
    invoke-direct {v0, v6, v3}, Lr08;-><init>(II)V

    .line 586
    .line 587
    .line 588
    throw v0

    .line 589
    :cond_17
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 590
    .line 591
    new-instance v1, Ljava/lang/StringBuilder;

    .line 592
    .line 593
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    throw v0

    .line 613
    :cond_18
    move v0, v2

    .line 614
    :goto_9
    return v0

    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
