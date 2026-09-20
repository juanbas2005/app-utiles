.class public final synthetic Lu26;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Long;

.field public final synthetic y:Ljava/text/SimpleDateFormat;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/text/SimpleDateFormat;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu26;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lu26;->x:Ljava/lang/Long;

    .line 4
    .line 5
    iput-object p2, p0, Lu26;->y:Ljava/text/SimpleDateFormat;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lu26;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    const/16 v3, 0xd

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0x10

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, Lu26;->y:Ljava/text/SimpleDateFormat;

    .line 15
    .line 16
    iget-object v0, v0, Lu26;->x:Ljava/lang/Long;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Lfa6;

    .line 24
    .line 25
    move-object/from16 v9, p2

    .line 26
    .line 27
    check-cast v9, Lyt2;

    .line 28
    .line 29
    move-object/from16 v10, p3

    .line 30
    .line 31
    check-cast v10, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    and-int/lit8 v1, v10, 0x11

    .line 41
    .line 42
    if-eq v1, v5, :cond_0

    .line 43
    .line 44
    move v1, v7

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v1, v6

    .line 47
    :goto_0
    and-int/lit8 v5, v10, 0x1

    .line 48
    .line 49
    invoke-virtual {v9, v5, v1}, Lyt2;->V(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    new-instance v4, Ljava/util/Date;

    .line 62
    .line 63
    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :cond_1
    if-nez v4, :cond_2

    .line 71
    .line 72
    const v0, 0xce76e72

    .line 73
    .line 74
    .line 75
    const v1, 0x7f110067

    .line 76
    .line 77
    .line 78
    invoke-static {v9, v0, v1, v9, v6}, Lhl6;->l(Lyt2;IILyt2;Z)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const v0, 0xce765f8

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9, v0}, Lyt2;->e0(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v6}, Lyt2;->r(Z)V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object v15, Lam2;->B:Lam2;

    .line 93
    .line 94
    invoke-static {v3}, Lya5;->k(I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v13

    .line 98
    const/16 v30, 0x0

    .line 99
    .line 100
    const v31, 0x3ffae

    .line 101
    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    const-wide/16 v11, 0x0

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const-wide/16 v17, 0x0

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    const/16 v20, 0x0

    .line 113
    .line 114
    const-wide/16 v21, 0x0

    .line 115
    .line 116
    const/16 v23, 0x0

    .line 117
    .line 118
    const/16 v24, 0x0

    .line 119
    .line 120
    const/16 v25, 0x0

    .line 121
    .line 122
    const/16 v26, 0x0

    .line 123
    .line 124
    const/16 v27, 0x0

    .line 125
    .line 126
    const v29, 0x186000

    .line 127
    .line 128
    .line 129
    move-object/from16 v28, v9

    .line 130
    .line 131
    move-object v9, v4

    .line 132
    invoke-static/range {v9 .. v31}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    move-object/from16 v28, v9

    .line 137
    .line 138
    invoke-virtual/range {v28 .. v28}, Lyt2;->Y()V

    .line 139
    .line 140
    .line 141
    :goto_2
    return-object v2

    .line 142
    :pswitch_0
    move-object/from16 v1, p1

    .line 143
    .line 144
    check-cast v1, Lfa6;

    .line 145
    .line 146
    move-object/from16 v9, p2

    .line 147
    .line 148
    check-cast v9, Lyt2;

    .line 149
    .line 150
    move-object/from16 v10, p3

    .line 151
    .line 152
    check-cast v10, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    and-int/lit8 v1, v10, 0x11

    .line 162
    .line 163
    if-eq v1, v5, :cond_4

    .line 164
    .line 165
    move v1, v7

    .line 166
    goto :goto_3

    .line 167
    :cond_4
    move v1, v6

    .line 168
    :goto_3
    and-int/lit8 v5, v10, 0x1

    .line 169
    .line 170
    invoke-virtual {v9, v5, v1}, Lyt2;->V(IZ)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_7

    .line 175
    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    new-instance v4, Ljava/util/Date;

    .line 183
    .line 184
    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :cond_5
    if-nez v4, :cond_6

    .line 192
    .line 193
    const v0, 0x613a8ecb

    .line 194
    .line 195
    .line 196
    const v1, 0x7f110070

    .line 197
    .line 198
    .line 199
    invoke-static {v9, v0, v1, v9, v6}, Lhl6;->l(Lyt2;IILyt2;Z)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    goto :goto_4

    .line 204
    :cond_6
    const v0, 0x613a8613

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9, v0}, Lyt2;->e0(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9, v6}, Lyt2;->r(Z)V

    .line 211
    .line 212
    .line 213
    :goto_4
    sget-object v15, Lam2;->B:Lam2;

    .line 214
    .line 215
    invoke-static {v3}, Lya5;->k(I)J

    .line 216
    .line 217
    .line 218
    move-result-wide v13

    .line 219
    const/16 v30, 0x0

    .line 220
    .line 221
    const v31, 0x3ffae

    .line 222
    .line 223
    .line 224
    const/4 v10, 0x0

    .line 225
    const-wide/16 v11, 0x0

    .line 226
    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    const-wide/16 v17, 0x0

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    const/16 v20, 0x0

    .line 234
    .line 235
    const-wide/16 v21, 0x0

    .line 236
    .line 237
    const/16 v23, 0x0

    .line 238
    .line 239
    const/16 v24, 0x0

    .line 240
    .line 241
    const/16 v25, 0x0

    .line 242
    .line 243
    const/16 v26, 0x0

    .line 244
    .line 245
    const/16 v27, 0x0

    .line 246
    .line 247
    const v29, 0x186000

    .line 248
    .line 249
    .line 250
    move-object/from16 v28, v9

    .line 251
    .line 252
    move-object v9, v4

    .line 253
    invoke-static/range {v9 .. v31}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_7
    move-object/from16 v28, v9

    .line 258
    .line 259
    invoke-virtual/range {v28 .. v28}, Lyt2;->Y()V

    .line 260
    .line 261
    .line 262
    :goto_5
    return-object v2

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
