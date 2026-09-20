.class public final Lgt3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lv02;


# instance fields
.field public final a:Lft3;


# direct methods
.method public constructor <init>(Lft3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgt3;->a:Lft3;

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
.method public final bridge synthetic a(Llo7;)Lm38;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lgt3;->f(Llo7;)Lt38;

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

.method public final bridge synthetic a(Llo7;)Lo38;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lgt3;->f(Llo7;)Lt38;

    move-result-object p0

    return-object p0
.end method

.method public final f(Llo7;)Lt38;
    .locals 19

    .line 1
    new-instance v0, Lxo4;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, Lgt3;->a:Lft3;

    .line 6
    .line 7
    iget-object v2, v1, Lft3;->b:Lyo4;

    .line 8
    .line 9
    iget v3, v2, Lme3;->e:I

    .line 10
    .line 11
    add-int/lit8 v3, v3, 0x2

    .line 12
    .line 13
    invoke-direct {v0, v3}, Lxo4;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lyo4;

    .line 17
    .line 18
    iget v4, v2, Lme3;->e:I

    .line 19
    .line 20
    invoke-direct {v3, v4}, Lyo4;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v4, v2, Lme3;->b:[I

    .line 24
    .line 25
    iget-object v5, v2, Lme3;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v6, v2, Lme3;->a:[J

    .line 28
    .line 29
    array-length v7, v6

    .line 30
    add-int/lit8 v7, v7, -0x2

    .line 31
    .line 32
    if-ltz v7, :cond_2

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    :goto_0
    aget-wide v10, v6, v9

    .line 36
    .line 37
    not-long v12, v10

    .line 38
    const/4 v14, 0x7

    .line 39
    shl-long/2addr v12, v14

    .line 40
    and-long/2addr v12, v10

    .line 41
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v12, v14

    .line 47
    cmp-long v12, v12, v14

    .line 48
    .line 49
    if-eqz v12, :cond_3

    .line 50
    .line 51
    sub-int v12, v9, v7

    .line 52
    .line 53
    not-int v12, v12

    .line 54
    ushr-int/lit8 v12, v12, 0x1f

    .line 55
    .line 56
    const/16 v13, 0x8

    .line 57
    .line 58
    rsub-int/lit8 v12, v12, 0x8

    .line 59
    .line 60
    const/4 v14, 0x0

    .line 61
    :goto_1
    if-ge v14, v12, :cond_1

    .line 62
    .line 63
    const-wide/16 v15, 0xff

    .line 64
    .line 65
    and-long/2addr v15, v10

    .line 66
    const-wide/16 v17, 0x80

    .line 67
    .line 68
    cmp-long v15, v15, v17

    .line 69
    .line 70
    if-gez v15, :cond_0

    .line 71
    .line 72
    shl-int/lit8 v15, v9, 0x3

    .line 73
    .line 74
    add-int/2addr v15, v14

    .line 75
    aget v8, v4, v15

    .line 76
    .line 77
    aget-object v15, v5, v15

    .line 78
    .line 79
    check-cast v15, Let3;

    .line 80
    .line 81
    invoke-virtual {v0, v8}, Lxo4;->a(I)V

    .line 82
    .line 83
    .line 84
    move/from16 v16, v13

    .line 85
    .line 86
    new-instance v13, Ls38;

    .line 87
    .line 88
    move-object/from16 v17, v4

    .line 89
    .line 90
    move-object/from16 v18, v5

    .line 91
    .line 92
    move-object/from16 v4, p1

    .line 93
    .line 94
    iget-object v5, v4, Llo7;->a:Lvr2;

    .line 95
    .line 96
    iget-object v4, v15, Let3;->a:Ljava/lang/Float;

    .line 97
    .line 98
    invoke-interface {v5, v4}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Lol;

    .line 103
    .line 104
    iget-object v5, v15, Let3;->b:Li12;

    .line 105
    .line 106
    invoke-direct {v13, v4, v5}, Ls38;-><init>(Lol;Li12;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v8, v13}, Lyo4;->i(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_0
    move-object/from16 v17, v4

    .line 114
    .line 115
    move-object/from16 v18, v5

    .line 116
    .line 117
    move/from16 v16, v13

    .line 118
    .line 119
    :goto_2
    shr-long v10, v10, v16

    .line 120
    .line 121
    add-int/lit8 v14, v14, 0x1

    .line 122
    .line 123
    move/from16 v13, v16

    .line 124
    .line 125
    move-object/from16 v4, v17

    .line 126
    .line 127
    move-object/from16 v5, v18

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    move-object/from16 v17, v4

    .line 131
    .line 132
    move-object/from16 v18, v5

    .line 133
    .line 134
    move v4, v13

    .line 135
    if-ne v12, v4, :cond_2

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_2
    const/4 v4, 0x0

    .line 139
    goto :goto_4

    .line 140
    :cond_3
    move-object/from16 v17, v4

    .line 141
    .line 142
    move-object/from16 v18, v5

    .line 143
    .line 144
    :goto_3
    if-eq v9, v7, :cond_2

    .line 145
    .line 146
    add-int/lit8 v9, v9, 0x1

    .line 147
    .line 148
    move-object/from16 v4, v17

    .line 149
    .line 150
    move-object/from16 v5, v18

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :goto_4
    invoke-virtual {v2, v4}, Lme3;->a(I)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-nez v5, :cond_6

    .line 158
    .line 159
    iget v5, v0, Lxo4;->b:I

    .line 160
    .line 161
    if-ltz v5, :cond_5

    .line 162
    .line 163
    const/4 v6, 0x1

    .line 164
    add-int/2addr v5, v6

    .line 165
    invoke-virtual {v0, v5}, Lxo4;->b(I)V

    .line 166
    .line 167
    .line 168
    iget-object v5, v0, Lxo4;->a:[I

    .line 169
    .line 170
    iget v7, v0, Lxo4;->b:I

    .line 171
    .line 172
    if-eqz v7, :cond_4

    .line 173
    .line 174
    invoke-static {v6, v4, v7, v5, v5}, Lqs;->J0(III[I[I)V

    .line 175
    .line 176
    .line 177
    :cond_4
    aput v4, v5, v4

    .line 178
    .line 179
    iget v4, v0, Lxo4;->b:I

    .line 180
    .line 181
    add-int/2addr v4, v6

    .line 182
    iput v4, v0, Lxo4;->b:I

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 186
    .line 187
    invoke-static {v0}, Lh;->l(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const/4 v0, 0x0

    .line 191
    return-object v0

    .line 192
    :cond_6
    :goto_5
    iget v4, v1, Lft3;->a:I

    .line 193
    .line 194
    invoke-virtual {v2, v4}, Lme3;->a(I)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_7

    .line 199
    .line 200
    iget v2, v1, Lft3;->a:I

    .line 201
    .line 202
    invoke-virtual {v0, v2}, Lxo4;->a(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    iget v2, v0, Lxo4;->b:I

    .line 206
    .line 207
    if-nez v2, :cond_8

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_8
    iget-object v4, v0, Lxo4;->a:[I

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    const/4 v5, 0x0

    .line 216
    invoke-static {v4, v5, v2}, Ljava/util/Arrays;->sort([III)V

    .line 217
    .line 218
    .line 219
    :goto_6
    new-instance v2, Lt38;

    .line 220
    .line 221
    iget v1, v1, Lft3;->a:I

    .line 222
    .line 223
    sget-object v4, Lj12;->c:Lta1;

    .line 224
    .line 225
    invoke-direct {v2, v0, v3, v1, v4}, Lt38;-><init>(Lxo4;Lyo4;ILi12;)V

    .line 226
    .line 227
    .line 228
    return-object v2
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
.end method
