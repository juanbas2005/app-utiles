.class public final synthetic Llc7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnc7;


# direct methods
.method public synthetic constructor <init>(Lnc7;I)V
    .locals 0

    .line 1
    iput p2, p0, Llc7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Llc7;->x:Lnc7;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Llc7;->w:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, Llc7;->x:Lnc7;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lnc7;->Y:Lmc7;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v4, v0, Lnc7;->U:Lvr2;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v4, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v2, v0, Lnc7;->Y:Lmc7;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    iput-boolean v1, v2, Lmc7;->c:Z

    .line 37
    .line 38
    :cond_2
    invoke-static {v0}, Lg75;->D(Ldk6;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lsu0;->B(Lmy3;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lrc9;->e0(Lgz1;)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_0
    move-object/from16 v1, p1

    .line 54
    .line 55
    check-cast v1, Lvl;

    .line 56
    .line 57
    iget-object v3, v0, Lnc7;->Y:Lmc7;

    .line 58
    .line 59
    sget-object v9, La42;->w:La42;

    .line 60
    .line 61
    if-eqz v3, :cond_5

    .line 62
    .line 63
    iget-object v4, v3, Lmc7;->b:Lvl;

    .line 64
    .line 65
    invoke-static {v1, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iput-object v1, v3, Lmc7;->b:Lvl;

    .line 73
    .line 74
    iget-object v3, v3, Lmc7;->d:Lrn4;

    .line 75
    .line 76
    if-eqz v3, :cond_6

    .line 77
    .line 78
    iget-object v4, v0, Lnc7;->L:Ltg7;

    .line 79
    .line 80
    iget-object v5, v0, Lnc7;->M:Ldl2;

    .line 81
    .line 82
    iget v6, v0, Lnc7;->O:I

    .line 83
    .line 84
    iget-boolean v7, v0, Lnc7;->P:Z

    .line 85
    .line 86
    iget v8, v0, Lnc7;->Q:I

    .line 87
    .line 88
    iget v10, v0, Lnc7;->R:I

    .line 89
    .line 90
    iput-object v1, v3, Lrn4;->a:Lvl;

    .line 91
    .line 92
    iget-object v1, v3, Lrn4;->k:Ltg7;

    .line 93
    .line 94
    invoke-virtual {v4, v1}, Ltg7;->c(Ltg7;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iput-object v4, v3, Lrn4;->k:Ltg7;

    .line 99
    .line 100
    const/4 v4, -0x1

    .line 101
    const/4 v11, 0x2

    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    iget-wide v12, v3, Lrn4;->q:J

    .line 105
    .line 106
    shl-long/2addr v12, v11

    .line 107
    iput-wide v12, v3, Lrn4;->q:J

    .line 108
    .line 109
    iput-object v2, v3, Lrn4;->l:Lo9;

    .line 110
    .line 111
    iput-object v2, v3, Lrn4;->n:Lbg7;

    .line 112
    .line 113
    iput v4, v3, Lrn4;->p:I

    .line 114
    .line 115
    iput v4, v3, Lrn4;->o:I

    .line 116
    .line 117
    :cond_4
    iput-object v5, v3, Lrn4;->b:Ldl2;

    .line 118
    .line 119
    iput v6, v3, Lrn4;->c:I

    .line 120
    .line 121
    iput-boolean v7, v3, Lrn4;->d:Z

    .line 122
    .line 123
    iput v8, v3, Lrn4;->e:I

    .line 124
    .line 125
    iput v10, v3, Lrn4;->f:I

    .line 126
    .line 127
    iput-object v9, v3, Lrn4;->g:Ljava/util/List;

    .line 128
    .line 129
    iget-wide v5, v3, Lrn4;->q:J

    .line 130
    .line 131
    shl-long/2addr v5, v11

    .line 132
    const-wide/16 v7, 0x2

    .line 133
    .line 134
    or-long/2addr v5, v7

    .line 135
    iput-wide v5, v3, Lrn4;->q:J

    .line 136
    .line 137
    iput-object v2, v3, Lrn4;->l:Lo9;

    .line 138
    .line 139
    iput-object v2, v3, Lrn4;->n:Lbg7;

    .line 140
    .line 141
    iput v4, v3, Lrn4;->p:I

    .line 142
    .line 143
    iput v4, v3, Lrn4;->o:I

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_5
    new-instance v10, Lmc7;

    .line 147
    .line 148
    iget-object v2, v0, Lnc7;->K:Lvl;

    .line 149
    .line 150
    invoke-direct {v10, v2, v1}, Lmc7;-><init>(Lvl;Lvl;)V

    .line 151
    .line 152
    .line 153
    move-object v2, v1

    .line 154
    new-instance v1, Lrn4;

    .line 155
    .line 156
    iget-object v3, v0, Lnc7;->L:Ltg7;

    .line 157
    .line 158
    iget-object v4, v0, Lnc7;->M:Ldl2;

    .line 159
    .line 160
    iget v5, v0, Lnc7;->O:I

    .line 161
    .line 162
    iget-boolean v6, v0, Lnc7;->P:Z

    .line 163
    .line 164
    iget v7, v0, Lnc7;->Q:I

    .line 165
    .line 166
    iget v8, v0, Lnc7;->R:I

    .line 167
    .line 168
    invoke-direct/range {v1 .. v9}, Lrn4;-><init>(Lvl;Ltg7;Ldl2;IZIILjava/util/List;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lnc7;->V0()Lrn4;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iget-object v2, v2, Lrn4;->j:Ltp1;

    .line 176
    .line 177
    invoke-virtual {v1, v2}, Lrn4;->d(Ltp1;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, v10, Lmc7;->d:Lrn4;

    .line 181
    .line 182
    iput-object v10, v0, Lnc7;->Y:Lmc7;

    .line 183
    .line 184
    :cond_6
    :goto_1
    invoke-static {v0}, Lg75;->D(Ldk6;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lsu0;->B(Lmy3;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v0}, Lrc9;->e0(Lgz1;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_1
    move-object/from16 v1, p1

    .line 197
    .line 198
    check-cast v1, Ljava/util/List;

    .line 199
    .line 200
    invoke-virtual {v0}, Lnc7;->V0()Lrn4;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    iget-object v5, v5, Lrn4;->n:Lbg7;

    .line 205
    .line 206
    if-eqz v5, :cond_7

    .line 207
    .line 208
    iget-object v2, v5, Lbg7;->a:Lag7;

    .line 209
    .line 210
    new-instance v6, Lag7;

    .line 211
    .line 212
    iget-object v7, v2, Lag7;->a:Lvl;

    .line 213
    .line 214
    iget-object v8, v0, Lnc7;->L:Ltg7;

    .line 215
    .line 216
    sget-wide v9, Ljt0;->g:J

    .line 217
    .line 218
    const-wide/16 v19, 0x0

    .line 219
    .line 220
    const v21, 0xfffffe

    .line 221
    .line 222
    .line 223
    const-wide/16 v11, 0x0

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const-wide/16 v15, 0x0

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    invoke-static/range {v8 .. v21}, Ltg7;->e(Ltg7;JJLam2;Lea7;JLrd7;IJI)Ltg7;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    iget-object v9, v2, Lag7;->c:Ljava/util/List;

    .line 238
    .line 239
    iget v10, v2, Lag7;->d:I

    .line 240
    .line 241
    iget-boolean v11, v2, Lag7;->e:Z

    .line 242
    .line 243
    iget v12, v2, Lag7;->f:I

    .line 244
    .line 245
    iget-object v13, v2, Lag7;->g:Ltp1;

    .line 246
    .line 247
    iget-object v14, v2, Lag7;->h:Ley3;

    .line 248
    .line 249
    iget-object v15, v2, Lag7;->i:Ldl2;

    .line 250
    .line 251
    iget-wide v3, v2, Lag7;->j:J

    .line 252
    .line 253
    move-wide/from16 v16, v3

    .line 254
    .line 255
    invoke-direct/range {v6 .. v17}, Lag7;-><init>(Lvl;Ltg7;Ljava/util/List;IZILtp1;Ley3;Ldl2;J)V

    .line 256
    .line 257
    .line 258
    iget-wide v2, v5, Lbg7;->c:J

    .line 259
    .line 260
    new-instance v4, Lbg7;

    .line 261
    .line 262
    iget-object v5, v5, Lbg7;->b:Lpn4;

    .line 263
    .line 264
    invoke-direct {v4, v6, v5, v2, v3}, Lbg7;-><init>(Lag7;Lpn4;J)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-object v2, v4

    .line 271
    :cond_7
    if-eqz v2, :cond_8

    .line 272
    .line 273
    const/4 v3, 0x1

    .line 274
    goto :goto_2

    .line 275
    :cond_8
    const/4 v3, 0x0

    .line 276
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
