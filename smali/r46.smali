.class public final synthetic Lr46;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvr2;

.field public final synthetic y:Laq4;


# direct methods
.method public synthetic constructor <init>(Lvr2;Laq4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr46;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lr46;->x:Lvr2;

    .line 4
    .line 5
    iput-object p2, p0, Lr46;->y:Laq4;

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr46;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    sget-object v3, Lay0;->a:Ld63;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, Lr46;->y:Laq4;

    .line 12
    .line 13
    iget-object v0, v0, Lr46;->x:Lvr2;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v13, p1

    .line 20
    .line 21
    check-cast v13, Lyt2;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    and-int/lit8 v8, v1, 0x3

    .line 32
    .line 33
    if-eq v8, v4, :cond_0

    .line 34
    .line 35
    move v4, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v7

    .line 38
    :goto_0
    and-int/2addr v1, v5

    .line 39
    invoke-virtual {v13, v1, v4}, Lyt2;->V(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-static {}, Lb35;->r()Lx83;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v6}, La37;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v4, 0x4

    .line 60
    if-ne v1, v4, :cond_1

    .line 61
    .line 62
    sget v1, Lw08;->a:I

    .line 63
    .line 64
    const-wide v4, 0xff12557aL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v4, v5}, Luq3;->d(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    const-wide v9, 0xff2f7baeL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v9, v10}, Luq3;->d(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    invoke-static {v4, v5, v9, v10}, Lw08;->a(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    :goto_1
    move-wide v11, v4

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    sget v1, Lw08;->a:I

    .line 89
    .line 90
    const-wide v4, 0xff63758aL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v4, v5}, Luq3;->d(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    const-wide v9, 0xff9fb3c6L

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v9, v10}, Luq3;->d(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v9

    .line 108
    invoke-static {v4, v5, v9, v10}, Lw08;->a(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    goto :goto_1

    .line 113
    :goto_2
    sget-object v1, Ljl4;->w:Ljl4;

    .line 114
    .line 115
    const/high16 v4, 0x41900000    # 18.0f

    .line 116
    .line 117
    invoke-static {v1, v4}, Lyu6;->l(Lml4;F)Lml4;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v13, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-virtual {v13}, Lyt2;->Q()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-nez v4, :cond_2

    .line 130
    .line 131
    if-ne v5, v3, :cond_3

    .line 132
    .line 133
    :cond_2
    new-instance v5, Lyo2;

    .line 134
    .line 135
    const/16 v3, 0x8

    .line 136
    .line 137
    invoke-direct {v5, v0, v6, v3}, Lyo2;-><init>(Lvr2;Laq4;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13, v5}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    check-cast v5, Lsr2;

    .line 144
    .line 145
    const/16 v0, 0xf

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    invoke-static {v1, v7, v3, v5, v0}, Lh49;->u(Lml4;ZLjava/lang/String;Lsr2;I)Lml4;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const/16 v14, 0x30

    .line 153
    .line 154
    const/4 v15, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    invoke-static/range {v8 .. v15}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    invoke-virtual {v13}, Lyt2;->Y()V

    .line 161
    .line 162
    .line 163
    :goto_3
    return-object v2

    .line 164
    :pswitch_0
    move-object/from16 v10, p1

    .line 165
    .line 166
    check-cast v10, Lyt2;

    .line 167
    .line 168
    move-object/from16 v1, p2

    .line 169
    .line 170
    check-cast v1, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    and-int/lit8 v8, v1, 0x3

    .line 177
    .line 178
    if-eq v8, v4, :cond_5

    .line 179
    .line 180
    move v7, v5

    .line 181
    :cond_5
    and-int/2addr v1, v5

    .line 182
    invoke-virtual {v10, v1, v7}, Lyt2;->V(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_8

    .line 187
    .line 188
    invoke-virtual {v10, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-virtual {v10}, Lyt2;->Q()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    if-nez v1, :cond_6

    .line 197
    .line 198
    if-ne v4, v3, :cond_7

    .line 199
    .line 200
    :cond_6
    new-instance v4, Lyo2;

    .line 201
    .line 202
    const/4 v1, 0x7

    .line 203
    invoke-direct {v4, v0, v6, v1}, Lyo2;-><init>(Lvr2;Laq4;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10, v4}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    move-object v3, v4

    .line 210
    check-cast v3, Lsr2;

    .line 211
    .line 212
    sget-object v9, Lhj8;->b:Lfw0;

    .line 213
    .line 214
    const/high16 v11, 0x30000000

    .line 215
    .line 216
    const/16 v12, 0x1fe

    .line 217
    .line 218
    const/4 v4, 0x0

    .line 219
    const/4 v5, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x0

    .line 223
    invoke-static/range {v3 .. v12}, Lgw8;->e(Lsr2;Lml4;ZLpq6;Lxd0;Lla5;Lhs2;Lyt2;II)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_8
    invoke-virtual {v10}, Lyt2;->Y()V

    .line 228
    .line 229
    .line 230
    :goto_4
    return-object v2

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
