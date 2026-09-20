.class public final synthetic Lyp5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    .line 1
    iput p2, p0, Lyp5;->w:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lyp5;->x:Z

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
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyp5;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-boolean v0, v0, Lyp5;->x:Z

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Lfa6;

    .line 19
    .line 20
    move-object/from16 v6, p2

    .line 21
    .line 22
    check-cast v6, Lyt2;

    .line 23
    .line 24
    move-object/from16 v7, p3

    .line 25
    .line 26
    check-cast v7, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v1, v7, 0x11

    .line 36
    .line 37
    if-eq v1, v3, :cond_0

    .line 38
    .line 39
    move v1, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v4

    .line 42
    :goto_0
    and-int/lit8 v3, v7, 0x1

    .line 43
    .line 44
    invoke-virtual {v6, v3, v1}, Lyt2;->V(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    const v0, 0x6b27f36

    .line 53
    .line 54
    .line 55
    const v1, 0x7f110073

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-static {v6, v0, v1, v6, v4}, Lhl6;->l(Lyt2;IILyt2;Z)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    const v0, 0x6b28517

    .line 64
    .line 65
    .line 66
    const v1, 0x7f110071

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_2
    sget-object v12, Lam2;->B:Lam2;

    .line 71
    .line 72
    const/16 v1, 0xe

    .line 73
    .line 74
    invoke-static {v1}, Lya5;->k(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    const/16 v27, 0x0

    .line 79
    .line 80
    const v28, 0x3ffae

    .line 81
    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    const-wide/16 v8, 0x0

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const-wide/16 v14, 0x0

    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const-wide/16 v18, 0x0

    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    const/16 v21, 0x0

    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const/16 v23, 0x0

    .line 102
    .line 103
    const/16 v24, 0x0

    .line 104
    .line 105
    const v26, 0x186000

    .line 106
    .line 107
    .line 108
    move-object/from16 v25, v6

    .line 109
    .line 110
    move-object v6, v0

    .line 111
    invoke-static/range {v6 .. v28}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_2
    move-object/from16 v25, v6

    .line 116
    .line 117
    invoke-virtual/range {v25 .. v25}, Lyt2;->Y()V

    .line 118
    .line 119
    .line 120
    :goto_3
    return-object v2

    .line 121
    :pswitch_0
    move-object/from16 v1, p1

    .line 122
    .line 123
    check-cast v1, Lfa6;

    .line 124
    .line 125
    move-object/from16 v6, p2

    .line 126
    .line 127
    check-cast v6, Lyt2;

    .line 128
    .line 129
    move-object/from16 v7, p3

    .line 130
    .line 131
    check-cast v7, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    and-int/lit8 v1, v7, 0x11

    .line 141
    .line 142
    if-eq v1, v3, :cond_3

    .line 143
    .line 144
    move v4, v5

    .line 145
    :cond_3
    and-int/lit8 v1, v7, 0x1

    .line 146
    .line 147
    invoke-virtual {v6, v1, v4}, Lyt2;->V(IZ)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    if-eqz v0, :cond_4

    .line 154
    .line 155
    const v0, 0x7f110360

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_4
    const v0, 0x7f11035d

    .line 160
    .line 161
    .line 162
    :goto_4
    invoke-static {v0, v6}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sget-object v1, Lch4;->b:Lt37;

    .line 167
    .line 168
    invoke-virtual {v6, v1}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Lzg4;

    .line 173
    .line 174
    iget-object v1, v1, Lzg4;->a:Lqt0;

    .line 175
    .line 176
    iget-wide v8, v1, Lqt0;->a:J

    .line 177
    .line 178
    const/16 v27, 0x0

    .line 179
    .line 180
    const v28, 0x3fffa

    .line 181
    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    const-wide/16 v10, 0x0

    .line 185
    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const-wide/16 v14, 0x0

    .line 189
    .line 190
    const/16 v16, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const-wide/16 v18, 0x0

    .line 195
    .line 196
    const/16 v20, 0x0

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const/16 v23, 0x0

    .line 203
    .line 204
    const/16 v24, 0x0

    .line 205
    .line 206
    const/16 v26, 0x0

    .line 207
    .line 208
    move-object/from16 v25, v6

    .line 209
    .line 210
    move-object v6, v0

    .line 211
    invoke-static/range {v6 .. v28}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_5
    move-object/from16 v25, v6

    .line 216
    .line 217
    invoke-virtual/range {v25 .. v25}, Lyt2;->Y()V

    .line 218
    .line 219
    .line 220
    :goto_5
    return-object v2

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
.end method
