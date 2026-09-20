.class public final Lki8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lki8;->a:I

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

.method public static a(Lzr8;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lzr8;->w:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {p1, v1}, Lh75;->M(Landroid/os/Parcel;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {p1, v2, v0}, Lh75;->F(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    iget-object v2, p0, Lzr8;->x:Lur8;

    .line 15
    .line 16
    invoke-static {p1, v0, v2, p2}, Lh75;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    iget-object v0, p0, Lzr8;->y:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, p2, v0}, Lh75;->F(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-wide v2, p0, Lzr8;->z:J

    .line 26
    .line 27
    const/4 p2, 0x5

    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-static {p1, p2, v0}, Lh75;->K(Landroid/os/Parcel;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 34
    .line 35
    .line 36
    iget-wide v2, p0, Lzr8;->A:J

    .line 37
    .line 38
    const/4 p0, 0x6

    .line 39
    invoke-static {p1, p0, v0}, Lh75;->K(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1}, Lh75;->O(Landroid/os/Parcel;I)V

    .line 46
    .line 47
    .line 48
    return-void
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


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lki8;->a:I

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v5, 0x5

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x3

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x1

    .line 15
    const/4 v10, 0x2

    .line 16
    const/4 v11, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move-wide/from16 v18, v3

    .line 25
    .line 26
    move/from16 v16, v8

    .line 27
    .line 28
    move-object v13, v11

    .line 29
    move-object v14, v13

    .line 30
    move-object v15, v14

    .line 31
    move-object/from16 v17, v15

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ge v2, v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-char v3, v2

    .line 44
    packed-switch v3, :pswitch_data_1

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_0
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    move-wide/from16 v18, v2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    invoke-static {v1, v2}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    move-object/from16 v17, v2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_2
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    move/from16 v16, v2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_3
    sget-object v3, Lz29;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 73
    .line 74
    invoke-static {v1, v2, v3}, Lg75;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, [Lz29;

    .line 79
    .line 80
    move-object v15, v2

    .line 81
    goto :goto_0

    .line 82
    :pswitch_4
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v14, v2

    .line 87
    goto :goto_0

    .line 88
    :pswitch_5
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    move-object v13, v2

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 95
    .line 96
    .line 97
    new-instance v12, Lb39;

    .line 98
    .line 99
    invoke-direct/range {v12 .. v19}, Lb39;-><init>(Ljava/lang/String;Ljava/lang/String;[Lz29;Z[BJ)V

    .line 100
    .line 101
    .line 102
    return-object v12

    .line 103
    :pswitch_6
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    move-object v2, v11

    .line 108
    move-object v3, v2

    .line 109
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-ge v4, v0, :cond_5

    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-char v5, v4

    .line 120
    if-eq v5, v10, :cond_4

    .line 121
    .line 122
    if-eq v5, v7, :cond_3

    .line 123
    .line 124
    if-eq v5, v6, :cond_1

    .line 125
    .line 126
    invoke-static {v1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    invoke-static {v1, v4}, Lg75;->N(Landroid/os/Parcel;I)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v3, :cond_2

    .line 139
    .line 140
    move-object v3, v11

    .line 141
    goto :goto_1

    .line 142
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    add-int/2addr v4, v3

    .line 147
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 148
    .line 149
    .line 150
    move-object v3, v5

    .line 151
    goto :goto_1

    .line 152
    :cond_3
    sget-object v2, Lj39;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 153
    .line 154
    invoke-static {v1, v4, v2}, Lg75;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, [Lj39;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    invoke-static {v1, v4}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    goto :goto_1

    .line 166
    :cond_5
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 167
    .line 168
    .line 169
    new-instance v0, Lz29;

    .line 170
    .line 171
    invoke-direct {v0, v8, v2, v3}, Lz29;-><init>(I[Lj39;[Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_7
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    move-object v13, v11

    .line 180
    move-object v14, v13

    .line 181
    move-object v15, v14

    .line 182
    move-object/from16 v16, v15

    .line 183
    .line 184
    move-object/from16 v17, v16

    .line 185
    .line 186
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-ge v3, v0, :cond_b

    .line 191
    .line 192
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    int-to-char v4, v3

    .line 197
    if-eq v4, v10, :cond_a

    .line 198
    .line 199
    if-eq v4, v7, :cond_9

    .line 200
    .line 201
    if-eq v4, v6, :cond_8

    .line 202
    .line 203
    if-eq v4, v5, :cond_7

    .line 204
    .line 205
    if-eq v4, v2, :cond_6

    .line 206
    .line 207
    invoke-static {v1, v3}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_6
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 212
    .line 213
    .line 214
    move-result-object v17

    .line 215
    goto :goto_2

    .line 216
    :cond_7
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 217
    .line 218
    .line 219
    move-result-object v16

    .line 220
    goto :goto_2

    .line 221
    :cond_8
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    goto :goto_2

    .line 226
    :cond_9
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    goto :goto_2

    .line 231
    :cond_a
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    goto :goto_2

    .line 236
    :cond_b
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 237
    .line 238
    .line 239
    new-instance v12, Lhw;

    .line 240
    .line 241
    invoke-direct/range {v12 .. v17}, Lhw;-><init>([B[B[B[B[B)V

    .line 242
    .line 243
    .line 244
    return-object v12

    .line 245
    :pswitch_8
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    move-object v2, v11

    .line 250
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-ge v3, v0, :cond_e

    .line 255
    .line 256
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    int-to-char v4, v3

    .line 261
    if-eq v4, v9, :cond_d

    .line 262
    .line 263
    if-eq v4, v10, :cond_c

    .line 264
    .line 265
    invoke-static {v1, v3}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_c
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    goto :goto_3

    .line 274
    :cond_d
    invoke-static {v1, v3}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    goto :goto_3

    .line 279
    :cond_e
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 280
    .line 281
    .line 282
    new-instance v0, Lb09;

    .line 283
    .line 284
    if-nez v2, :cond_f

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_f
    array-length v1, v2

    .line 288
    invoke-static {v1, v2}, Lqz8;->p(I[B)Lqz8;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    :goto_4
    invoke-direct {v0, v8, v11}, Lb09;-><init>(ZLqz8;)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_9
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    move-object v2, v11

    .line 301
    move-object v3, v2

    .line 302
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-ge v4, v0, :cond_12

    .line 307
    .line 308
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    int-to-char v5, v4

    .line 313
    if-eq v5, v9, :cond_11

    .line 314
    .line 315
    if-eq v5, v10, :cond_10

    .line 316
    .line 317
    invoke-static {v1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_10
    invoke-static {v1, v4}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    goto :goto_5

    .line 326
    :cond_11
    invoke-static {v1, v4}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    goto :goto_5

    .line 331
    :cond_12
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 332
    .line 333
    .line 334
    new-instance v0, Lax8;

    .line 335
    .line 336
    if-nez v2, :cond_13

    .line 337
    .line 338
    move-object v1, v11

    .line 339
    goto :goto_6

    .line 340
    :cond_13
    array-length v1, v2

    .line 341
    invoke-static {v1, v2}, Lqz8;->p(I[B)Lqz8;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :goto_6
    if-nez v3, :cond_14

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_14
    array-length v2, v3

    .line 349
    invoke-static {v2, v3}, Lqz8;->p(I[B)Lqz8;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    :goto_7
    invoke-direct {v0, v1, v11}, Lax8;-><init>(Lqz8;Lqz8;)V

    .line 354
    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_a
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    if-ge v2, v0, :cond_16

    .line 366
    .line 367
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    int-to-char v3, v2

    .line 372
    if-eq v3, v9, :cond_15

    .line 373
    .line 374
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 375
    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_15
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    goto :goto_8

    .line 383
    :cond_16
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 384
    .line 385
    .line 386
    new-instance v0, Lgw;

    .line 387
    .line 388
    invoke-direct {v0, v8}, Lgw;-><init>(Z)V

    .line 389
    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_b
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    move-object v2, v11

    .line 397
    move-object v3, v2

    .line 398
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-ge v4, v0, :cond_1b

    .line 403
    .line 404
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    int-to-char v5, v4

    .line 409
    if-eq v5, v9, :cond_1a

    .line 410
    .line 411
    if-eq v5, v10, :cond_19

    .line 412
    .line 413
    if-eq v5, v7, :cond_18

    .line 414
    .line 415
    if-eq v5, v6, :cond_17

    .line 416
    .line 417
    invoke-static {v1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 418
    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_17
    sget-object v3, Lm11;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 422
    .line 423
    invoke-static {v1, v4, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    check-cast v3, Lm11;

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_18
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 431
    .line 432
    invoke-static {v1, v4, v2}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    check-cast v2, Landroid/app/PendingIntent;

    .line 437
    .line 438
    goto :goto_9

    .line 439
    :cond_19
    invoke-static {v1, v4}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    goto :goto_9

    .line 444
    :cond_1a
    invoke-static {v1, v4}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    goto :goto_9

    .line 449
    :cond_1b
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 450
    .line 451
    .line 452
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 453
    .line 454
    invoke-direct {v0, v8, v11, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 455
    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_c
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    move-object v2, v11

    .line 463
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-ge v3, v0, :cond_1f

    .line 468
    .line 469
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    int-to-char v4, v3

    .line 474
    if-eq v4, v9, :cond_1e

    .line 475
    .line 476
    if-eq v4, v10, :cond_1d

    .line 477
    .line 478
    if-eq v4, v7, :cond_1c

    .line 479
    .line 480
    invoke-static {v1, v3}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 481
    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_1c
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 485
    .line 486
    invoke-static {v1, v3, v2}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    check-cast v2, Landroid/content/Intent;

    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_1d
    invoke-static {v1, v3}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    goto :goto_a

    .line 498
    :cond_1e
    invoke-static {v1, v3}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 499
    .line 500
    .line 501
    move-result v8

    .line 502
    goto :goto_a

    .line 503
    :cond_1f
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 504
    .line 505
    .line 506
    new-instance v0, Ljv8;

    .line 507
    .line 508
    invoke-direct {v0, v8, v11, v2}, Ljv8;-><init>(ILjava/lang/String;Landroid/content/Intent;)V

    .line 509
    .line 510
    .line 511
    return-object v0

    .line 512
    :pswitch_d
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    move-wide v13, v3

    .line 517
    move-wide v15, v13

    .line 518
    move/from16 v17, v8

    .line 519
    .line 520
    move-object/from16 v18, v11

    .line 521
    .line 522
    move-object/from16 v19, v18

    .line 523
    .line 524
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    if-ge v2, v0, :cond_25

    .line 529
    .line 530
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    int-to-char v3, v2

    .line 535
    if-eq v3, v9, :cond_24

    .line 536
    .line 537
    if-eq v3, v10, :cond_23

    .line 538
    .line 539
    if-eq v3, v7, :cond_22

    .line 540
    .line 541
    const/4 v4, 0x7

    .line 542
    if-eq v3, v4, :cond_21

    .line 543
    .line 544
    const/16 v4, 0x8

    .line 545
    .line 546
    if-eq v3, v4, :cond_20

    .line 547
    .line 548
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 549
    .line 550
    .line 551
    goto :goto_b

    .line 552
    :cond_20
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    move-object/from16 v19, v2

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_21
    invoke-static {v1, v2}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    move-object/from16 v18, v2

    .line 564
    .line 565
    goto :goto_b

    .line 566
    :cond_22
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    move/from16 v17, v2

    .line 571
    .line 572
    goto :goto_b

    .line 573
    :cond_23
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 574
    .line 575
    .line 576
    move-result-wide v2

    .line 577
    move-wide v15, v2

    .line 578
    goto :goto_b

    .line 579
    :cond_24
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 580
    .line 581
    .line 582
    move-result-wide v2

    .line 583
    move-wide v13, v2

    .line 584
    goto :goto_b

    .line 585
    :cond_25
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 586
    .line 587
    .line 588
    new-instance v12, Liv8;

    .line 589
    .line 590
    invoke-direct/range {v12 .. v19}, Liv8;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    return-object v12

    .line 594
    :pswitch_e
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    if-ge v2, v0, :cond_28

    .line 603
    .line 604
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    int-to-char v3, v2

    .line 609
    if-eq v3, v9, :cond_27

    .line 610
    .line 611
    if-eq v3, v10, :cond_26

    .line 612
    .line 613
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 614
    .line 615
    .line 616
    goto :goto_c

    .line 617
    :cond_26
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v11

    .line 621
    goto :goto_c

    .line 622
    :cond_27
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 623
    .line 624
    .line 625
    move-result v8

    .line 626
    goto :goto_c

    .line 627
    :cond_28
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 628
    .line 629
    .line 630
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 631
    .line 632
    invoke-direct {v0, v8, v11}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 633
    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_f
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    move-object v13, v11

    .line 641
    move-object v14, v13

    .line 642
    move-object v15, v14

    .line 643
    move-object/from16 v16, v15

    .line 644
    .line 645
    move-object/from16 v17, v16

    .line 646
    .line 647
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-ge v2, v0, :cond_2e

    .line 652
    .line 653
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    int-to-char v3, v2

    .line 658
    if-eq v3, v9, :cond_2d

    .line 659
    .line 660
    if-eq v3, v10, :cond_2c

    .line 661
    .line 662
    if-eq v3, v7, :cond_2b

    .line 663
    .line 664
    if-eq v3, v6, :cond_2a

    .line 665
    .line 666
    if-eq v3, v5, :cond_29

    .line 667
    .line 668
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 669
    .line 670
    .line 671
    goto :goto_d

    .line 672
    :cond_29
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v17

    .line 676
    goto :goto_d

    .line 677
    :cond_2a
    sget-object v3, Lb09;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 678
    .line 679
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    move-object/from16 v16, v2

    .line 684
    .line 685
    check-cast v16, Lb09;

    .line 686
    .line 687
    goto :goto_d

    .line 688
    :cond_2b
    sget-object v3, Lgw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 689
    .line 690
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    move-object v15, v2

    .line 695
    check-cast v15, Lgw;

    .line 696
    .line 697
    goto :goto_d

    .line 698
    :cond_2c
    sget-object v3, Lax8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 699
    .line 700
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    move-object v14, v2

    .line 705
    check-cast v14, Lax8;

    .line 706
    .line 707
    goto :goto_d

    .line 708
    :cond_2d
    sget-object v3, Ls18;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 709
    .line 710
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    move-object v13, v2

    .line 715
    check-cast v13, Ls18;

    .line 716
    .line 717
    goto :goto_d

    .line 718
    :cond_2e
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 719
    .line 720
    .line 721
    new-instance v12, Lfw;

    .line 722
    .line 723
    invoke-direct/range {v12 .. v17}, Lfw;-><init>(Ls18;Lax8;Lgw;Lb09;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    return-object v12

    .line 727
    :pswitch_10
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    move v2, v8

    .line 732
    move v3, v2

    .line 733
    move v4, v9

    .line 734
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 735
    .line 736
    .line 737
    move-result v5

    .line 738
    if-ge v5, v0, :cond_33

    .line 739
    .line 740
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 741
    .line 742
    .line 743
    move-result v5

    .line 744
    int-to-char v11, v5

    .line 745
    if-eq v11, v9, :cond_32

    .line 746
    .line 747
    if-eq v11, v10, :cond_31

    .line 748
    .line 749
    if-eq v11, v7, :cond_30

    .line 750
    .line 751
    if-eq v11, v6, :cond_2f

    .line 752
    .line 753
    invoke-static {v1, v5}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 754
    .line 755
    .line 756
    goto :goto_e

    .line 757
    :cond_2f
    invoke-static {v1, v5}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    goto :goto_e

    .line 762
    :cond_30
    invoke-static {v1, v5}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    goto :goto_e

    .line 767
    :cond_31
    invoke-static {v1, v5}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    goto :goto_e

    .line 772
    :cond_32
    invoke-static {v1, v5}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 773
    .line 774
    .line 775
    move-result v8

    .line 776
    goto :goto_e

    .line 777
    :cond_33
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 778
    .line 779
    .line 780
    new-instance v0, Ldv0;

    .line 781
    .line 782
    invoke-direct {v0, v8, v2, v3, v4}, Ldv0;-><init>(IIIZ)V

    .line 783
    .line 784
    .line 785
    return-object v0

    .line 786
    :pswitch_11
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    move-wide/from16 v16, v3

    .line 791
    .line 792
    move-wide/from16 v18, v16

    .line 793
    .line 794
    move-object v13, v11

    .line 795
    move-object v14, v13

    .line 796
    move-object v15, v14

    .line 797
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 798
    .line 799
    .line 800
    move-result v3

    .line 801
    if-ge v3, v0, :cond_39

    .line 802
    .line 803
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    int-to-char v4, v3

    .line 808
    if-eq v4, v10, :cond_38

    .line 809
    .line 810
    if-eq v4, v7, :cond_37

    .line 811
    .line 812
    if-eq v4, v6, :cond_36

    .line 813
    .line 814
    if-eq v4, v5, :cond_35

    .line 815
    .line 816
    if-eq v4, v2, :cond_34

    .line 817
    .line 818
    invoke-static {v1, v3}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 819
    .line 820
    .line 821
    goto :goto_f

    .line 822
    :cond_34
    invoke-static {v1, v3}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 823
    .line 824
    .line 825
    move-result-wide v3

    .line 826
    move-wide/from16 v18, v3

    .line 827
    .line 828
    goto :goto_f

    .line 829
    :cond_35
    invoke-static {v1, v3}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 830
    .line 831
    .line 832
    move-result-wide v3

    .line 833
    move-wide/from16 v16, v3

    .line 834
    .line 835
    goto :goto_f

    .line 836
    :cond_36
    invoke-static {v1, v3}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    move-object v15, v3

    .line 841
    goto :goto_f

    .line 842
    :cond_37
    sget-object v4, Lur8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 843
    .line 844
    invoke-static {v1, v3, v4}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 845
    .line 846
    .line 847
    move-result-object v3

    .line 848
    check-cast v3, Lur8;

    .line 849
    .line 850
    move-object v14, v3

    .line 851
    goto :goto_f

    .line 852
    :cond_38
    invoke-static {v1, v3}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    move-object v13, v3

    .line 857
    goto :goto_f

    .line 858
    :cond_39
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 859
    .line 860
    .line 861
    new-instance v12, Lzr8;

    .line 862
    .line 863
    invoke-direct/range {v12 .. v19}, Lzr8;-><init>(Ljava/lang/String;Lur8;Ljava/lang/String;JJ)V

    .line 864
    .line 865
    .line 866
    return-object v12

    .line 867
    :pswitch_12
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    if-ge v2, v0, :cond_3b

    .line 876
    .line 877
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    int-to-char v3, v2

    .line 882
    if-eq v3, v10, :cond_3a

    .line 883
    .line 884
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 885
    .line 886
    .line 887
    goto :goto_10

    .line 888
    :cond_3a
    invoke-static {v1, v2}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 889
    .line 890
    .line 891
    move-result-object v11

    .line 892
    goto :goto_10

    .line 893
    :cond_3b
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 894
    .line 895
    .line 896
    new-instance v0, Lur8;

    .line 897
    .line 898
    invoke-direct {v0, v11}, Lur8;-><init>(Landroid/os/Bundle;)V

    .line 899
    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_13
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    move v2, v8

    .line 907
    move v3, v2

    .line 908
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    if-ge v4, v0, :cond_3f

    .line 913
    .line 914
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    int-to-char v5, v4

    .line 919
    if-eq v5, v9, :cond_3e

    .line 920
    .line 921
    if-eq v5, v10, :cond_3d

    .line 922
    .line 923
    if-eq v5, v7, :cond_3c

    .line 924
    .line 925
    invoke-static {v1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 926
    .line 927
    .line 928
    goto :goto_11

    .line 929
    :cond_3c
    invoke-static {v1, v4, v6}, Lg75;->W(Landroid/os/Parcel;II)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 933
    .line 934
    .line 935
    move-result v3

    .line 936
    int-to-short v3, v3

    .line 937
    goto :goto_11

    .line 938
    :cond_3d
    invoke-static {v1, v4, v6}, Lg75;->W(Landroid/os/Parcel;II)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    int-to-short v2, v2

    .line 946
    goto :goto_11

    .line 947
    :cond_3e
    invoke-static {v1, v4}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 948
    .line 949
    .line 950
    move-result v8

    .line 951
    goto :goto_11

    .line 952
    :cond_3f
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 953
    .line 954
    .line 955
    new-instance v0, Lt18;

    .line 956
    .line 957
    invoke-direct {v0, v8, v2, v3}, Lt18;-><init>(ISS)V

    .line 958
    .line 959
    .line 960
    return-object v0

    .line 961
    :pswitch_14
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-ge v2, v0, :cond_41

    .line 970
    .line 971
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 972
    .line 973
    .line 974
    move-result v2

    .line 975
    int-to-char v3, v2

    .line 976
    if-eq v3, v9, :cond_40

    .line 977
    .line 978
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 979
    .line 980
    .line 981
    goto :goto_12

    .line 982
    :cond_40
    sget-object v3, Lt18;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 983
    .line 984
    invoke-static {v1, v2, v3}, Lg75;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 985
    .line 986
    .line 987
    move-result-object v11

    .line 988
    goto :goto_12

    .line 989
    :cond_41
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 990
    .line 991
    .line 992
    new-instance v0, Ls18;

    .line 993
    .line 994
    invoke-direct {v0, v11}, Ls18;-><init>(Ljava/util/ArrayList;)V

    .line 995
    .line 996
    .line 997
    return-object v0

    .line 998
    :pswitch_15
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 999
    .line 1000
    .line 1001
    move-result v0

    .line 1002
    const-wide/16 v2, -0x1

    .line 1003
    .line 1004
    move-wide v15, v2

    .line 1005
    move v14, v8

    .line 1006
    move/from16 v17, v14

    .line 1007
    .line 1008
    move-object v13, v11

    .line 1009
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    if-ge v2, v0, :cond_46

    .line 1014
    .line 1015
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    int-to-char v3, v2

    .line 1020
    if-eq v3, v9, :cond_45

    .line 1021
    .line 1022
    if-eq v3, v10, :cond_44

    .line 1023
    .line 1024
    if-eq v3, v7, :cond_43

    .line 1025
    .line 1026
    if-eq v3, v6, :cond_42

    .line 1027
    .line 1028
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_13

    .line 1032
    :cond_42
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    move/from16 v17, v2

    .line 1037
    .line 1038
    goto :goto_13

    .line 1039
    :cond_43
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v2

    .line 1043
    move-wide v15, v2

    .line 1044
    goto :goto_13

    .line 1045
    :cond_44
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    move v14, v2

    .line 1050
    goto :goto_13

    .line 1051
    :cond_45
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    move-object v13, v2

    .line 1056
    goto :goto_13

    .line 1057
    :cond_46
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1058
    .line 1059
    .line 1060
    new-instance v12, Lcc2;

    .line 1061
    .line 1062
    invoke-direct/range {v12 .. v17}, Lcc2;-><init>(Ljava/lang/String;IJZ)V

    .line 1063
    .line 1064
    .line 1065
    return-object v12

    .line 1066
    :pswitch_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    new-instance v1, Lgv8;

    .line 1071
    .line 1072
    invoke-direct {v1, v0}, Lgv8;-><init>(Landroid/os/IBinder;)V

    .line 1073
    .line 1074
    .line 1075
    return-object v1

    .line 1076
    :pswitch_17
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1077
    .line 1078
    .line 1079
    move-result v0

    .line 1080
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1081
    .line 1082
    .line 1083
    move-result v2

    .line 1084
    if-ge v2, v0, :cond_48

    .line 1085
    .line 1086
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1087
    .line 1088
    .line 1089
    move-result v2

    .line 1090
    int-to-char v3, v2

    .line 1091
    if-eq v3, v9, :cond_47

    .line 1092
    .line 1093
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_14

    .line 1097
    :cond_47
    invoke-static {v1, v2}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v11

    .line 1101
    goto :goto_14

    .line 1102
    :cond_48
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1103
    .line 1104
    .line 1105
    new-instance v0, Ldq8;

    .line 1106
    .line 1107
    invoke-direct {v0, v11}, Ldq8;-><init>(Landroid/os/Bundle;)V

    .line 1108
    .line 1109
    .line 1110
    return-object v0

    .line 1111
    :pswitch_18
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    move-object v2, v11

    .line 1116
    move-object v3, v2

    .line 1117
    move-object v4, v3

    .line 1118
    move-object v5, v4

    .line 1119
    move-object v6, v5

    .line 1120
    move-object v7, v6

    .line 1121
    move-object v8, v7

    .line 1122
    move-object v9, v8

    .line 1123
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1124
    .line 1125
    .line 1126
    move-result v10

    .line 1127
    if-ge v10, v0, :cond_49

    .line 1128
    .line 1129
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1130
    .line 1131
    .line 1132
    move-result v10

    .line 1133
    int-to-char v11, v10

    .line 1134
    packed-switch v11, :pswitch_data_2

    .line 1135
    .line 1136
    .line 1137
    invoke-static {v1, v10}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_15

    .line 1141
    :pswitch_19
    invoke-static {v1, v10}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    goto :goto_15

    .line 1145
    :pswitch_1a
    invoke-static {v1, v10}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v9

    .line 1149
    goto :goto_15

    .line 1150
    :pswitch_1b
    sget-object v8, Lfw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1151
    .line 1152
    invoke-static {v1, v10, v8}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v8

    .line 1156
    check-cast v8, Lfw;

    .line 1157
    .line 1158
    goto :goto_15

    .line 1159
    :pswitch_1c
    sget-object v7, Lkw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1160
    .line 1161
    invoke-static {v1, v10, v7}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v7

    .line 1165
    check-cast v7, Lkw;

    .line 1166
    .line 1167
    goto :goto_15

    .line 1168
    :pswitch_1d
    sget-object v6, Lhw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1169
    .line 1170
    invoke-static {v1, v10, v6}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v6

    .line 1174
    check-cast v6, Lhw;

    .line 1175
    .line 1176
    goto :goto_15

    .line 1177
    :pswitch_1e
    sget-object v5, Ljw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1178
    .line 1179
    invoke-static {v1, v10, v5}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v5

    .line 1183
    check-cast v5, Ljw;

    .line 1184
    .line 1185
    goto :goto_15

    .line 1186
    :pswitch_1f
    invoke-static {v1, v10}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    goto :goto_15

    .line 1191
    :pswitch_20
    invoke-static {v1, v10}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    goto :goto_15

    .line 1196
    :pswitch_21
    invoke-static {v1, v10}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    goto :goto_15

    .line 1201
    :cond_49
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1202
    .line 1203
    .line 1204
    new-instance v1, Lqu5;

    .line 1205
    .line 1206
    invoke-direct/range {v1 .. v9}, Lqu5;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjw;Lhw;Lkw;Lfw;Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    return-object v1

    .line 1210
    :pswitch_22
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    move-wide/from16 v16, v3

    .line 1215
    .line 1216
    move-wide/from16 v21, v16

    .line 1217
    .line 1218
    move-wide/from16 v24, v21

    .line 1219
    .line 1220
    move/from16 v18, v8

    .line 1221
    .line 1222
    move-object v13, v11

    .line 1223
    move-object v14, v13

    .line 1224
    move-object v15, v14

    .line 1225
    move-object/from16 v19, v15

    .line 1226
    .line 1227
    move-object/from16 v20, v19

    .line 1228
    .line 1229
    move-object/from16 v23, v20

    .line 1230
    .line 1231
    move-object/from16 v26, v23

    .line 1232
    .line 1233
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    if-ge v2, v0, :cond_4a

    .line 1238
    .line 1239
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1240
    .line 1241
    .line 1242
    move-result v2

    .line 1243
    int-to-char v3, v2

    .line 1244
    packed-switch v3, :pswitch_data_3

    .line 1245
    .line 1246
    .line 1247
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_16

    .line 1251
    :pswitch_23
    sget-object v3, Lzr8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1252
    .line 1253
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    check-cast v2, Lzr8;

    .line 1258
    .line 1259
    move-object/from16 v26, v2

    .line 1260
    .line 1261
    goto :goto_16

    .line 1262
    :pswitch_24
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 1263
    .line 1264
    .line 1265
    move-result-wide v2

    .line 1266
    move-wide/from16 v24, v2

    .line 1267
    .line 1268
    goto :goto_16

    .line 1269
    :pswitch_25
    sget-object v3, Lzr8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1270
    .line 1271
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v2

    .line 1275
    check-cast v2, Lzr8;

    .line 1276
    .line 1277
    move-object/from16 v23, v2

    .line 1278
    .line 1279
    goto :goto_16

    .line 1280
    :pswitch_26
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 1281
    .line 1282
    .line 1283
    move-result-wide v2

    .line 1284
    move-wide/from16 v21, v2

    .line 1285
    .line 1286
    goto :goto_16

    .line 1287
    :pswitch_27
    sget-object v3, Lzr8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1288
    .line 1289
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v2

    .line 1293
    check-cast v2, Lzr8;

    .line 1294
    .line 1295
    move-object/from16 v20, v2

    .line 1296
    .line 1297
    goto :goto_16

    .line 1298
    :pswitch_28
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v2

    .line 1302
    move-object/from16 v19, v2

    .line 1303
    .line 1304
    goto :goto_16

    .line 1305
    :pswitch_29
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v2

    .line 1309
    move/from16 v18, v2

    .line 1310
    .line 1311
    goto :goto_16

    .line 1312
    :pswitch_2a
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 1313
    .line 1314
    .line 1315
    move-result-wide v2

    .line 1316
    move-wide/from16 v16, v2

    .line 1317
    .line 1318
    goto :goto_16

    .line 1319
    :pswitch_2b
    sget-object v3, Lz89;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1320
    .line 1321
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v2

    .line 1325
    check-cast v2, Lz89;

    .line 1326
    .line 1327
    move-object v15, v2

    .line 1328
    goto :goto_16

    .line 1329
    :pswitch_2c
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    move-object v14, v2

    .line 1334
    goto :goto_16

    .line 1335
    :pswitch_2d
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    move-object v13, v2

    .line 1340
    goto :goto_16

    .line 1341
    :cond_4a
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1342
    .line 1343
    .line 1344
    new-instance v12, Lxn8;

    .line 1345
    .line 1346
    invoke-direct/range {v12 .. v26}, Lxn8;-><init>(Ljava/lang/String;Ljava/lang/String;Lz89;JZLjava/lang/String;Lzr8;JLzr8;JLzr8;)V

    .line 1347
    .line 1348
    .line 1349
    return-object v12

    .line 1350
    :pswitch_2e
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1351
    .line 1352
    .line 1353
    move-result v0

    .line 1354
    move v12, v8

    .line 1355
    move v13, v12

    .line 1356
    move v14, v13

    .line 1357
    move v15, v14

    .line 1358
    move/from16 v16, v15

    .line 1359
    .line 1360
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1361
    .line 1362
    .line 1363
    move-result v2

    .line 1364
    if-ge v2, v0, :cond_50

    .line 1365
    .line 1366
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1367
    .line 1368
    .line 1369
    move-result v2

    .line 1370
    int-to-char v3, v2

    .line 1371
    if-eq v3, v9, :cond_4f

    .line 1372
    .line 1373
    if-eq v3, v10, :cond_4e

    .line 1374
    .line 1375
    if-eq v3, v7, :cond_4d

    .line 1376
    .line 1377
    if-eq v3, v6, :cond_4c

    .line 1378
    .line 1379
    if-eq v3, v5, :cond_4b

    .line 1380
    .line 1381
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1382
    .line 1383
    .line 1384
    goto :goto_17

    .line 1385
    :cond_4b
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1386
    .line 1387
    .line 1388
    move-result v16

    .line 1389
    goto :goto_17

    .line 1390
    :cond_4c
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1391
    .line 1392
    .line 1393
    move-result v15

    .line 1394
    goto :goto_17

    .line 1395
    :cond_4d
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v14

    .line 1399
    goto :goto_17

    .line 1400
    :cond_4e
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v13

    .line 1404
    goto :goto_17

    .line 1405
    :cond_4f
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1406
    .line 1407
    .line 1408
    move-result v12

    .line 1409
    goto :goto_17

    .line 1410
    :cond_50
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1411
    .line 1412
    .line 1413
    new-instance v11, Lg96;

    .line 1414
    .line 1415
    invoke-direct/range {v11 .. v16}, Lg96;-><init>(IZZII)V

    .line 1416
    .line 1417
    .line 1418
    return-object v11

    .line 1419
    :pswitch_2f
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1420
    .line 1421
    .line 1422
    move-result v0

    .line 1423
    move-wide v13, v3

    .line 1424
    move-wide v15, v13

    .line 1425
    move v12, v8

    .line 1426
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1427
    .line 1428
    .line 1429
    move-result v2

    .line 1430
    if-ge v2, v0, :cond_54

    .line 1431
    .line 1432
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1433
    .line 1434
    .line 1435
    move-result v2

    .line 1436
    int-to-char v3, v2

    .line 1437
    if-eq v3, v9, :cond_53

    .line 1438
    .line 1439
    if-eq v3, v10, :cond_52

    .line 1440
    .line 1441
    if-eq v3, v7, :cond_51

    .line 1442
    .line 1443
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1444
    .line 1445
    .line 1446
    goto :goto_18

    .line 1447
    :cond_51
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 1448
    .line 1449
    .line 1450
    move-result-wide v2

    .line 1451
    move-wide v15, v2

    .line 1452
    goto :goto_18

    .line 1453
    :cond_52
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1454
    .line 1455
    .line 1456
    move-result v2

    .line 1457
    move v12, v2

    .line 1458
    goto :goto_18

    .line 1459
    :cond_53
    invoke-static {v1, v2}, Lg75;->M(Landroid/os/Parcel;I)J

    .line 1460
    .line 1461
    .line 1462
    move-result-wide v2

    .line 1463
    move-wide v13, v2

    .line 1464
    goto :goto_18

    .line 1465
    :cond_54
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1466
    .line 1467
    .line 1468
    new-instance v11, Llm8;

    .line 1469
    .line 1470
    invoke-direct/range {v11 .. v16}, Llm8;-><init>(IJJ)V

    .line 1471
    .line 1472
    .line 1473
    return-object v11

    .line 1474
    :pswitch_30
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1475
    .line 1476
    .line 1477
    move-result v0

    .line 1478
    move v13, v8

    .line 1479
    move v14, v13

    .line 1480
    move-object v15, v11

    .line 1481
    move-object/from16 v16, v15

    .line 1482
    .line 1483
    move-object/from16 v17, v16

    .line 1484
    .line 1485
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1486
    .line 1487
    .line 1488
    move-result v2

    .line 1489
    if-ge v2, v0, :cond_5b

    .line 1490
    .line 1491
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1492
    .line 1493
    .line 1494
    move-result v2

    .line 1495
    int-to-char v3, v2

    .line 1496
    if-eq v3, v9, :cond_5a

    .line 1497
    .line 1498
    if-eq v3, v10, :cond_59

    .line 1499
    .line 1500
    if-eq v3, v7, :cond_58

    .line 1501
    .line 1502
    if-eq v3, v6, :cond_57

    .line 1503
    .line 1504
    if-eq v3, v5, :cond_55

    .line 1505
    .line 1506
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1507
    .line 1508
    .line 1509
    goto :goto_19

    .line 1510
    :cond_55
    invoke-static {v1, v2}, Lg75;->N(Landroid/os/Parcel;I)I

    .line 1511
    .line 1512
    .line 1513
    move-result v2

    .line 1514
    if-nez v2, :cond_56

    .line 1515
    .line 1516
    move-object/from16 v17, v11

    .line 1517
    .line 1518
    goto :goto_19

    .line 1519
    :cond_56
    invoke-static {v1, v2, v6}, Lg75;->X(Landroid/os/Parcel;II)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1523
    .line 1524
    .line 1525
    move-result v2

    .line 1526
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v2

    .line 1530
    move-object/from16 v17, v2

    .line 1531
    .line 1532
    goto :goto_19

    .line 1533
    :cond_57
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v16

    .line 1537
    goto :goto_19

    .line 1538
    :cond_58
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1539
    .line 1540
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v2

    .line 1544
    move-object v15, v2

    .line 1545
    check-cast v15, Landroid/app/PendingIntent;

    .line 1546
    .line 1547
    goto :goto_19

    .line 1548
    :cond_59
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1549
    .line 1550
    .line 1551
    move-result v14

    .line 1552
    goto :goto_19

    .line 1553
    :cond_5a
    invoke-static {v1, v2}, Lg75;->L(Landroid/os/Parcel;I)I

    .line 1554
    .line 1555
    .line 1556
    move-result v13

    .line 1557
    goto :goto_19

    .line 1558
    :cond_5b
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1559
    .line 1560
    .line 1561
    new-instance v12, Lm11;

    .line 1562
    .line 1563
    invoke-direct/range {v12 .. v17}, Lm11;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1564
    .line 1565
    .line 1566
    return-object v12

    .line 1567
    :pswitch_31
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1568
    .line 1569
    .line 1570
    move-result v0

    .line 1571
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1572
    .line 1573
    .line 1574
    move-result v2

    .line 1575
    if-ge v2, v0, :cond_5d

    .line 1576
    .line 1577
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1578
    .line 1579
    .line 1580
    move-result v2

    .line 1581
    int-to-char v3, v2

    .line 1582
    if-eq v3, v9, :cond_5c

    .line 1583
    .line 1584
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1585
    .line 1586
    .line 1587
    goto :goto_1a

    .line 1588
    :cond_5c
    sget-object v3, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1589
    .line 1590
    invoke-static {v1, v2, v3}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v2

    .line 1594
    move-object v11, v2

    .line 1595
    check-cast v11, Landroid/content/Intent;

    .line 1596
    .line 1597
    goto :goto_1a

    .line 1598
    :cond_5d
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1599
    .line 1600
    .line 1601
    new-instance v0, Lns0;

    .line 1602
    .line 1603
    invoke-direct {v0, v11}, Lns0;-><init>(Landroid/content/Intent;)V

    .line 1604
    .line 1605
    .line 1606
    return-object v0

    .line 1607
    :pswitch_32
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1608
    .line 1609
    .line 1610
    move-result v0

    .line 1611
    move-object v2, v11

    .line 1612
    move-object v3, v2

    .line 1613
    move-object v4, v3

    .line 1614
    move-object v5, v4

    .line 1615
    move-object v6, v5

    .line 1616
    move-object v7, v6

    .line 1617
    move-object v8, v7

    .line 1618
    move-object v9, v8

    .line 1619
    move-object v10, v9

    .line 1620
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1621
    .line 1622
    .line 1623
    move-result v11

    .line 1624
    if-ge v11, v0, :cond_5e

    .line 1625
    .line 1626
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1627
    .line 1628
    .line 1629
    move-result v11

    .line 1630
    int-to-char v12, v11

    .line 1631
    packed-switch v12, :pswitch_data_4

    .line 1632
    .line 1633
    .line 1634
    invoke-static {v1, v11}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1635
    .line 1636
    .line 1637
    goto :goto_1b

    .line 1638
    :pswitch_33
    sget-object v10, Lqu5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1639
    .line 1640
    invoke-static {v1, v11, v10}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v10

    .line 1644
    check-cast v10, Lqu5;

    .line 1645
    .line 1646
    goto :goto_1b

    .line 1647
    :pswitch_34
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v9

    .line 1651
    goto :goto_1b

    .line 1652
    :pswitch_35
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v8

    .line 1656
    goto :goto_1b

    .line 1657
    :pswitch_36
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v7

    .line 1661
    goto :goto_1b

    .line 1662
    :pswitch_37
    sget-object v6, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1663
    .line 1664
    invoke-static {v1, v11, v6}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v6

    .line 1668
    check-cast v6, Landroid/net/Uri;

    .line 1669
    .line 1670
    goto :goto_1b

    .line 1671
    :pswitch_38
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v5

    .line 1675
    goto :goto_1b

    .line 1676
    :pswitch_39
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v4

    .line 1680
    goto :goto_1b

    .line 1681
    :pswitch_3a
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v3

    .line 1685
    goto :goto_1b

    .line 1686
    :pswitch_3b
    invoke-static {v1, v11}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v2

    .line 1690
    goto :goto_1b

    .line 1691
    :cond_5e
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1692
    .line 1693
    .line 1694
    new-instance v1, Lgt6;

    .line 1695
    .line 1696
    invoke-direct/range {v1 .. v10}, Lgt6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqu5;)V

    .line 1697
    .line 1698
    .line 1699
    return-object v1

    .line 1700
    :pswitch_3c
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1701
    .line 1702
    .line 1703
    move-result v0

    .line 1704
    move-object v2, v11

    .line 1705
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1706
    .line 1707
    .line 1708
    move-result v3

    .line 1709
    if-ge v3, v0, :cond_61

    .line 1710
    .line 1711
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1712
    .line 1713
    .line 1714
    move-result v3

    .line 1715
    int-to-char v4, v3

    .line 1716
    if-eq v4, v10, :cond_60

    .line 1717
    .line 1718
    if-eq v4, v5, :cond_5f

    .line 1719
    .line 1720
    invoke-static {v1, v3}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1721
    .line 1722
    .line 1723
    goto :goto_1c

    .line 1724
    :cond_5f
    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1725
    .line 1726
    invoke-static {v1, v3, v2}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v2

    .line 1730
    check-cast v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 1731
    .line 1732
    goto :goto_1c

    .line 1733
    :cond_60
    invoke-static {v1, v3}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v11

    .line 1737
    goto :goto_1c

    .line 1738
    :cond_61
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1739
    .line 1740
    .line 1741
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 1742
    .line 1743
    invoke-direct {v0, v11, v2}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 1744
    .line 1745
    .line 1746
    return-object v0

    .line 1747
    :pswitch_3d
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1748
    .line 1749
    .line 1750
    move-result v0

    .line 1751
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1752
    .line 1753
    .line 1754
    move-result v2

    .line 1755
    if-ge v2, v0, :cond_63

    .line 1756
    .line 1757
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1758
    .line 1759
    .line 1760
    move-result v2

    .line 1761
    int-to-char v3, v2

    .line 1762
    if-eq v3, v9, :cond_62

    .line 1763
    .line 1764
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1765
    .line 1766
    .line 1767
    goto :goto_1d

    .line 1768
    :cond_62
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1769
    .line 1770
    .line 1771
    move-result v8

    .line 1772
    goto :goto_1d

    .line 1773
    :cond_63
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1774
    .line 1775
    .line 1776
    new-instance v0, La80;

    .line 1777
    .line 1778
    invoke-direct {v0, v8}, La80;-><init>(Z)V

    .line 1779
    .line 1780
    .line 1781
    return-object v0

    .line 1782
    :pswitch_3e
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1783
    .line 1784
    .line 1785
    move-result v0

    .line 1786
    move-object v2, v11

    .line 1787
    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1788
    .line 1789
    .line 1790
    move-result v3

    .line 1791
    if-ge v3, v0, :cond_67

    .line 1792
    .line 1793
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1794
    .line 1795
    .line 1796
    move-result v3

    .line 1797
    int-to-char v4, v3

    .line 1798
    if-eq v4, v9, :cond_66

    .line 1799
    .line 1800
    if-eq v4, v10, :cond_65

    .line 1801
    .line 1802
    if-eq v4, v7, :cond_64

    .line 1803
    .line 1804
    invoke-static {v1, v3}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1805
    .line 1806
    .line 1807
    goto :goto_1e

    .line 1808
    :cond_64
    invoke-static {v1, v3}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    goto :goto_1e

    .line 1813
    :cond_65
    invoke-static {v1, v3}, Lg75;->q(Landroid/os/Parcel;I)[B

    .line 1814
    .line 1815
    .line 1816
    move-result-object v11

    .line 1817
    goto :goto_1e

    .line 1818
    :cond_66
    invoke-static {v1, v3}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v8

    .line 1822
    goto :goto_1e

    .line 1823
    :cond_67
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1824
    .line 1825
    .line 1826
    new-instance v0, Lz70;

    .line 1827
    .line 1828
    invoke-direct {v0, v8, v11, v2}, Lz70;-><init>(Z[BLjava/lang/String;)V

    .line 1829
    .line 1830
    .line 1831
    return-object v0

    .line 1832
    :pswitch_3f
    invoke-static {v1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 1833
    .line 1834
    .line 1835
    move-result v0

    .line 1836
    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1837
    .line 1838
    .line 1839
    move-result v2

    .line 1840
    if-ge v2, v0, :cond_6a

    .line 1841
    .line 1842
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1843
    .line 1844
    .line 1845
    move-result v2

    .line 1846
    int-to-char v3, v2

    .line 1847
    if-eq v3, v9, :cond_69

    .line 1848
    .line 1849
    if-eq v3, v10, :cond_68

    .line 1850
    .line 1851
    invoke-static {v1, v2}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 1852
    .line 1853
    .line 1854
    goto :goto_1f

    .line 1855
    :cond_68
    invoke-static {v1, v2}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v11

    .line 1859
    goto :goto_1f

    .line 1860
    :cond_69
    invoke-static {v1, v2}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 1861
    .line 1862
    .line 1863
    move-result v8

    .line 1864
    goto :goto_1f

    .line 1865
    :cond_6a
    invoke-static {v1, v0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 1866
    .line 1867
    .line 1868
    new-instance v0, Ly70;

    .line 1869
    .line 1870
    invoke-direct {v0, v11, v8}, Ly70;-><init>(Ljava/lang/String;Z)V

    .line 1871
    .line 1872
    .line 1873
    return-object v0

    .line 1874
    nop

    .line 1875
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_22
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch

    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
    .end packed-switch
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lki8;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lb39;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lz29;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lhw;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lb09;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lax8;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lgw;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/common/api/Status;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Ljv8;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Liv8;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lfw;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Ldv0;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lzr8;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lur8;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lt18;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Ls18;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcc2;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lgv8;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Ldq8;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lqu5;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lxn8;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lg96;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Llm8;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lm11;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lns0;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lgt6;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [La80;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lz70;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Ly70;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
