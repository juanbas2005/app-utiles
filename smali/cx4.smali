.class public final synthetic Lcx4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La37;

.field public final synthetic y:Lcf4;


# direct methods
.method public synthetic constructor <init>(La37;Lcf4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcx4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lcx4;->x:La37;

    .line 4
    .line 5
    iput-object p2, p0, Lcx4;->y:Lcf4;

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
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcx4;->w:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    sget-object v4, Lvs7;->a:Lvs7;

    .line 9
    .line 10
    iget-object v5, v0, Lcx4;->y:Lcf4;

    .line 11
    .line 12
    iget-object v0, v0, Lcx4;->x:La37;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Lbu0;

    .line 22
    .line 23
    move-object/from16 v15, p2

    .line 24
    .line 25
    check-cast v15, Lyt2;

    .line 26
    .line 27
    move-object/from16 v1, p3

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v8, v1, 0x11

    .line 36
    .line 37
    if-eq v8, v3, :cond_0

    .line 38
    .line 39
    move v3, v6

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v3, v7

    .line 42
    :goto_0
    and-int/2addr v1, v6

    .line 43
    invoke-virtual {v15, v1, v3}, Lyt2;->V(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lkx4;

    .line 54
    .line 55
    iget-object v0, v0, Lkx4;->a:Leq4;

    .line 56
    .line 57
    iget-object v1, v0, Leq4;->w:[Ljava/lang/Object;

    .line 58
    .line 59
    iget v0, v0, Leq4;->y:I

    .line 60
    .line 61
    :goto_1
    if-ge v7, v0, :cond_3

    .line 62
    .line 63
    aget-object v3, v1, v7

    .line 64
    .line 65
    check-cast v3, Lyw4;

    .line 66
    .line 67
    iget-object v11, v3, Lyw4;->d:Lml4;

    .line 68
    .line 69
    iget-boolean v9, v3, Lyw4;->a:Z

    .line 70
    .line 71
    iget-object v10, v3, Lyw4;->b:Lf5;

    .line 72
    .line 73
    iget-object v12, v3, Lyw4;->c:Lfw0;

    .line 74
    .line 75
    iget-object v6, v3, Lyw4;->f:Lcf4;

    .line 76
    .line 77
    if-eqz v6, :cond_1

    .line 78
    .line 79
    iget-object v6, v6, Lcf4;->z:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Lml1;

    .line 82
    .line 83
    :goto_2
    move-object v14, v6

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    iget-object v6, v5, Lcf4;->z:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v6, Lml1;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :goto_3
    new-instance v6, Lax4;

    .line 91
    .line 92
    invoke-direct {v6, v3, v2}, Lax4;-><init>(Lyw4;I)V

    .line 93
    .line 94
    .line 95
    const v3, -0x6aba0efd

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v6, v15}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    const/4 v13, 0x0

    .line 103
    const/16 v16, 0x6

    .line 104
    .line 105
    invoke-static/range {v8 .. v16}, Lpv4;->d(Lfw0;ZLf5;Lml4;Lgs2;Lpq6;Lml1;Lyt2;I)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v7, v7, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {v15}, Lyt2;->Y()V

    .line 112
    .line 113
    .line 114
    :cond_3
    return-object v4

    .line 115
    :pswitch_0
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, Lbu0;

    .line 118
    .line 119
    move-object/from16 v15, p2

    .line 120
    .line 121
    check-cast v15, Lyt2;

    .line 122
    .line 123
    move-object/from16 v1, p3

    .line 124
    .line 125
    check-cast v1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    and-int/lit8 v2, v1, 0x11

    .line 132
    .line 133
    if-eq v2, v3, :cond_4

    .line 134
    .line 135
    move v2, v6

    .line 136
    goto :goto_4

    .line 137
    :cond_4
    move v2, v7

    .line 138
    :goto_4
    and-int/2addr v1, v6

    .line 139
    invoke-virtual {v15, v1, v2}, Lyt2;->V(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lkx4;

    .line 150
    .line 151
    iget-object v0, v0, Lkx4;->a:Leq4;

    .line 152
    .line 153
    iget-object v1, v0, Leq4;->w:[Ljava/lang/Object;

    .line 154
    .line 155
    iget v0, v0, Leq4;->y:I

    .line 156
    .line 157
    move v2, v7

    .line 158
    :goto_5
    if-ge v2, v0, :cond_7

    .line 159
    .line 160
    aget-object v3, v1, v2

    .line 161
    .line 162
    check-cast v3, Lyw4;

    .line 163
    .line 164
    iget-object v11, v3, Lyw4;->d:Lml4;

    .line 165
    .line 166
    iget-boolean v8, v3, Lyw4;->a:Z

    .line 167
    .line 168
    iget-object v9, v3, Lyw4;->b:Lf5;

    .line 169
    .line 170
    iget-object v12, v3, Lyw4;->e:Lgs2;

    .line 171
    .line 172
    iget-object v6, v3, Lyw4;->f:Lcf4;

    .line 173
    .line 174
    if-eqz v6, :cond_5

    .line 175
    .line 176
    iget-object v6, v6, Lcf4;->y:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v6, Lrw4;

    .line 179
    .line 180
    :goto_6
    move-object v14, v6

    .line 181
    goto :goto_7

    .line 182
    :cond_5
    iget-object v6, v5, Lcf4;->y:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v6, Lrw4;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :goto_7
    new-instance v6, Lax4;

    .line 188
    .line 189
    invoke-direct {v6, v3, v7}, Lax4;-><init>(Lyw4;I)V

    .line 190
    .line 191
    .line 192
    const v3, 0x2aa787ec

    .line 193
    .line 194
    .line 195
    invoke-static {v3, v6, v15}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    const/16 v16, 0x180

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const/4 v13, 0x1

    .line 204
    invoke-static/range {v8 .. v17}, Lww4;->b(ZLf5;Lfw0;Lml4;Lgs2;ZLrw4;Lyt2;II)V

    .line 205
    .line 206
    .line 207
    add-int/lit8 v2, v2, 0x1

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_6
    invoke-virtual {v15}, Lyt2;->Y()V

    .line 211
    .line 212
    .line 213
    :cond_7
    return-object v4

    .line 214
    :pswitch_1
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, Lfa6;

    .line 217
    .line 218
    move-object/from16 v3, p2

    .line 219
    .line 220
    check-cast v3, Lyt2;

    .line 221
    .line 222
    move-object/from16 v8, p3

    .line 223
    .line 224
    check-cast v8, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    and-int/lit8 v9, v8, 0x6

    .line 231
    .line 232
    if-nez v9, :cond_9

    .line 233
    .line 234
    invoke-virtual {v3, v1}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    if-eqz v9, :cond_8

    .line 239
    .line 240
    const/4 v2, 0x4

    .line 241
    :cond_8
    or-int/2addr v8, v2

    .line 242
    :cond_9
    and-int/lit8 v2, v8, 0x13

    .line 243
    .line 244
    const/16 v9, 0x12

    .line 245
    .line 246
    if-eq v2, v9, :cond_a

    .line 247
    .line 248
    move v2, v6

    .line 249
    goto :goto_8

    .line 250
    :cond_a
    move v2, v7

    .line 251
    :goto_8
    and-int/lit8 v9, v8, 0x1

    .line 252
    .line 253
    invoke-virtual {v3, v9, v2}, Lyt2;->V(IZ)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_c

    .line 258
    .line 259
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lkx4;

    .line 264
    .line 265
    iget-object v0, v0, Lkx4;->a:Leq4;

    .line 266
    .line 267
    iget-object v2, v0, Leq4;->w:[Ljava/lang/Object;

    .line 268
    .line 269
    iget v0, v0, Leq4;->y:I

    .line 270
    .line 271
    :goto_9
    if-ge v7, v0, :cond_d

    .line 272
    .line 273
    aget-object v9, v2, v7

    .line 274
    .line 275
    check-cast v9, Lyw4;

    .line 276
    .line 277
    iget-object v10, v9, Lyw4;->d:Lml4;

    .line 278
    .line 279
    iget-boolean v11, v9, Lyw4;->a:Z

    .line 280
    .line 281
    iget-object v12, v9, Lyw4;->b:Lf5;

    .line 282
    .line 283
    iget-object v13, v9, Lyw4;->e:Lgs2;

    .line 284
    .line 285
    iget-object v14, v9, Lyw4;->f:Lcf4;

    .line 286
    .line 287
    if-eqz v14, :cond_b

    .line 288
    .line 289
    iget-object v14, v14, Lcf4;->x:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v14, Lcv4;

    .line 292
    .line 293
    :goto_a
    move-object/from16 v22, v14

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_b
    iget-object v14, v5, Lcf4;->x:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v14, Lcv4;

    .line 299
    .line 300
    goto :goto_a

    .line 301
    :goto_b
    new-instance v14, Lax4;

    .line 302
    .line 303
    invoke-direct {v14, v9, v6}, Lax4;-><init>(Lyw4;I)V

    .line 304
    .line 305
    .line 306
    const v9, 0x7967f99f

    .line 307
    .line 308
    .line 309
    invoke-static {v9, v14, v3}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 310
    .line 311
    .line 312
    move-result-object v19

    .line 313
    and-int/lit8 v9, v8, 0xe

    .line 314
    .line 315
    or-int/lit16 v9, v9, 0xc00

    .line 316
    .line 317
    move-object/from16 v16, v1

    .line 318
    .line 319
    move-object/from16 v23, v3

    .line 320
    .line 321
    move/from16 v24, v9

    .line 322
    .line 323
    move-object/from16 v20, v10

    .line 324
    .line 325
    move/from16 v17, v11

    .line 326
    .line 327
    move-object/from16 v18, v12

    .line 328
    .line 329
    move-object/from16 v21, v13

    .line 330
    .line 331
    invoke-static/range {v16 .. v24}, Lhv4;->b(Lfa6;ZLf5;Lfw0;Lml4;Lgs2;Lcv4;Lyt2;I)V

    .line 332
    .line 333
    .line 334
    add-int/lit8 v7, v7, 0x1

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_c
    move-object/from16 v23, v3

    .line 338
    .line 339
    invoke-virtual/range {v23 .. v23}, Lyt2;->Y()V

    .line 340
    .line 341
    .line 342
    :cond_d
    return-object v4

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
