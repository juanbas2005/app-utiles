.class public final synthetic Ldn8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Z)V
    .locals 0

    .line 12
    iput p1, p0, Ldn8;->w:I

    iput-object p2, p0, Ldn8;->x:Ljava/lang/Object;

    iput-boolean p3, p0, Ldn8;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZLo9;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ldn8;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, Ldn8;->y:Z

    .line 8
    .line 9
    iput-object p2, p0, Ldn8;->x:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldn8;->w:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Lvs7;->a:Lvs7;

    .line 9
    .line 10
    iget-object v6, v0, Ldn8;->x:Ljava/lang/Object;

    .line 11
    .line 12
    iget-boolean v0, v0, Ldn8;->y:Z

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    move-object/from16 v2, p2

    .line 22
    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const-string v0, "Content-Length"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    check-cast v6, Lo9;

    .line 43
    .line 44
    iget-object v0, v6, Lo9;->z:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lzy2;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lza5;->u(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v1}, Lza5;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1, v2}, Lza5;->m(Lzy2;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-object v5

    .line 61
    :pswitch_0
    move-object/from16 v1, p2

    .line 62
    .line 63
    check-cast v1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    and-int/lit8 v7, v1, 0x3

    .line 70
    .line 71
    and-int/2addr v1, v3

    .line 72
    move-object/from16 v8, p1

    .line 73
    .line 74
    check-cast v8, Lyt2;

    .line 75
    .line 76
    sget v9, Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;->X:I

    .line 77
    .line 78
    if-eq v7, v2, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move v3, v4

    .line 82
    :goto_1
    invoke-virtual {v8, v1, v3}, Lyt2;->V(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    check-cast v6, Ljava/lang/String;

    .line 89
    .line 90
    new-instance v1, Ldn8;

    .line 91
    .line 92
    invoke-direct {v1, v4, v6, v0}, Ldn8;-><init>(ILjava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    const v0, -0x754e1c50

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1, v8}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/16 v1, 0x180

    .line 103
    .line 104
    invoke-static {v4, v4, v0, v8, v1}, Llr8;->a(ZZLfw0;Lyt2;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    invoke-virtual {v8}, Lyt2;->Y()V

    .line 109
    .line 110
    .line 111
    :goto_2
    return-object v5

    .line 112
    :pswitch_1
    move-object/from16 v1, p2

    .line 113
    .line 114
    check-cast v1, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    and-int/lit8 v7, v1, 0x3

    .line 121
    .line 122
    and-int/2addr v1, v3

    .line 123
    move-object/from16 v8, p1

    .line 124
    .line 125
    check-cast v8, Lyt2;

    .line 126
    .line 127
    sget v9, Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;->X:I

    .line 128
    .line 129
    if-eq v7, v2, :cond_3

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    move v3, v4

    .line 133
    :goto_3
    invoke-virtual {v8, v1, v3}, Lyt2;->V(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_4

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    check-cast v6, Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v1, v6, v0, v8, v4}, Li35;->s(Lbs8;Ljava/lang/String;ZLyt2;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_4
    invoke-virtual {v8}, Lyt2;->Y()V

    .line 147
    .line 148
    .line 149
    :goto_4
    return-object v5

    .line 150
    :pswitch_2
    move-object/from16 v1, p2

    .line 151
    .line 152
    check-cast v1, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    and-int/lit8 v7, v1, 0x3

    .line 159
    .line 160
    and-int/2addr v1, v3

    .line 161
    move-object/from16 v8, p1

    .line 162
    .line 163
    check-cast v8, Lyt2;

    .line 164
    .line 165
    sget v9, Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;->X:I

    .line 166
    .line 167
    if-eq v7, v2, :cond_5

    .line 168
    .line 169
    move v2, v3

    .line 170
    goto :goto_5

    .line 171
    :cond_5
    move v2, v4

    .line 172
    :goto_5
    invoke-virtual {v8, v1, v2}, Lyt2;->V(IZ)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_8

    .line 177
    .line 178
    sget-object v1, Llr8;->a:Lt37;

    .line 179
    .line 180
    invoke-virtual {v8, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Lqt0;

    .line 185
    .line 186
    iget-wide v10, v1, Lqt0;->n:J

    .line 187
    .line 188
    sget-object v1, Lyu6;->c:Lsd2;

    .line 189
    .line 190
    const-string v2, "LicenseTheme"

    .line 191
    .line 192
    invoke-static {v1, v2}, Lar7;->W(Lml4;Ljava/lang/String;)Lml4;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v8, v10, v11}, Lyt2;->f(J)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-virtual {v8}, Lyt2;->Q()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    if-nez v2, :cond_6

    .line 205
    .line 206
    sget-object v2, Lay0;->a:Ld63;

    .line 207
    .line 208
    if-ne v7, v2, :cond_7

    .line 209
    .line 210
    :cond_6
    new-instance v7, Lsl8;

    .line 211
    .line 212
    invoke-direct {v7, v10, v11}, Lsl8;-><init>(J)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v7}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_7
    check-cast v6, Ljava/lang/String;

    .line 219
    .line 220
    check-cast v7, Lvr2;

    .line 221
    .line 222
    invoke-static {v1, v4, v7}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v2, Ldn8;

    .line 227
    .line 228
    invoke-direct {v2, v3, v6, v0}, Ldn8;-><init>(ILjava/lang/String;Z)V

    .line 229
    .line 230
    .line 231
    const v0, -0x16d18375

    .line 232
    .line 233
    .line 234
    invoke-static {v0, v2, v8}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 235
    .line 236
    .line 237
    move-result-object v16

    .line 238
    const/high16 v18, 0xc00000

    .line 239
    .line 240
    const/16 v19, 0x7a

    .line 241
    .line 242
    const/4 v9, 0x0

    .line 243
    const-wide/16 v12, 0x0

    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/4 v15, 0x0

    .line 247
    move-object/from16 v17, v8

    .line 248
    .line 249
    move-object v8, v1

    .line 250
    invoke-static/range {v8 .. v19}, Ls87;->a(Lml4;Lpq6;JJFFLfw0;Lyt2;II)V

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_8
    move-object/from16 v17, v8

    .line 255
    .line 256
    invoke-virtual/range {v17 .. v17}, Lyt2;->Y()V

    .line 257
    .line 258
    .line 259
    :goto_6
    return-object v5

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
