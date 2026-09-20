.class public final Luh;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lpl5;

.field public final synthetic z:Laq4;


# direct methods
.method public synthetic constructor <init>(Lpl5;Laq4;I)V
    .locals 0

    .line 1
    iput p3, p0, Luh;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Luh;->y:Lpl5;

    .line 4
    .line 5
    iput-object p2, p0, Luh;->z:Laq4;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 9
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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luh;->x:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v3, v0, Luh;->z:Laq4;

    .line 8
    .line 9
    iget-object v0, v0, Luh;->y:Lpl5;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, Lyt2;

    .line 20
    .line 21
    move-object/from16 v7, p2

    .line 22
    .line 23
    check-cast v7, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    and-int/lit8 v8, v7, 0x3

    .line 30
    .line 31
    if-eq v8, v4, :cond_0

    .line 32
    .line 33
    move v4, v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v4, v5

    .line 36
    :goto_0
    and-int/2addr v6, v7

    .line 37
    invoke-virtual {v1, v6, v4}, Lyt2;->V(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    sget-object v4, Lvh;->b:Lyy0;

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v4, v6}, Lyy0;->a(Ljava/lang/Object;)Lju5;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v6, Luh;

    .line 52
    .line 53
    invoke-direct {v6, v0, v3, v5}, Luh;-><init>(Lpl5;Laq4;I)V

    .line 54
    .line 55
    .line 56
    const v0, 0x3ceea85c

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v6, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/16 v3, 0x38

    .line 64
    .line 65
    invoke-static {v4, v0, v1, v3}, Lt49;->c(Lju5;Lgs2;Lyt2;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 70
    .line 71
    .line 72
    :goto_1
    return-object v2

    .line 73
    :pswitch_0
    move-object/from16 v1, p1

    .line 74
    .line 75
    check-cast v1, Lyt2;

    .line 76
    .line 77
    move-object/from16 v7, p2

    .line 78
    .line 79
    check-cast v7, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    and-int/lit8 v8, v7, 0x3

    .line 86
    .line 87
    if-eq v8, v4, :cond_2

    .line 88
    .line 89
    move v4, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v4, v5

    .line 92
    :goto_2
    and-int/2addr v7, v6

    .line 93
    invoke-virtual {v1, v7, v4}, Lyt2;->V(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_a

    .line 98
    .line 99
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    sget-object v7, Lay0;->a:Ld63;

    .line 104
    .line 105
    if-ne v4, v7, :cond_3

    .line 106
    .line 107
    sget-object v4, Lce;->F:Lce;

    .line 108
    .line 109
    invoke-virtual {v1, v4}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    check-cast v4, Lvr2;

    .line 113
    .line 114
    sget-object v8, Ljl4;->w:Ljl4;

    .line 115
    .line 116
    invoke-static {v8, v5, v4}, Lck6;->a(Lml4;ZLvr2;)Lml4;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v1, v0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    if-nez v8, :cond_4

    .line 129
    .line 130
    if-ne v9, v7, :cond_5

    .line 131
    .line 132
    :cond_4
    new-instance v9, Lrh;

    .line 133
    .line 134
    invoke-direct {v9, v0, v6}, Lrh;-><init>(Lpl5;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v9}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    check-cast v9, Lvr2;

    .line 141
    .line 142
    invoke-static {v4, v9}, Lt49;->W(Lml4;Lvr2;)Lml4;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-virtual {v0}, Lpl5;->getCanCalculatePosition()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    const/high16 v4, 0x3f800000    # 1.0f

    .line 151
    .line 152
    if-eqz v0, :cond_6

    .line 153
    .line 154
    move v13, v4

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    const/4 v0, 0x0

    .line 157
    move v13, v0

    .line 158
    :goto_3
    cmpg-float v0, v13, v4

    .line 159
    .line 160
    if-nez v0, :cond_7

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_7
    const/16 v17, 0x1

    .line 164
    .line 165
    const v18, 0xfeffb

    .line 166
    .line 167
    .line 168
    const/4 v11, 0x0

    .line 169
    const/4 v12, 0x0

    .line 170
    const/4 v14, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    invoke-static/range {v10 .. v18}, Lmp7;->Y(Lml4;FFFFFLpq6;ZI)Lml4;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    :goto_4
    sget-object v0, Lvh;->a:Lyy0;

    .line 179
    .line 180
    invoke-interface {v3}, La37;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Lgs2;

    .line 185
    .line 186
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    if-ne v3, v7, :cond_8

    .line 191
    .line 192
    sget-object v3, Lpf;->c:Lpf;

    .line 193
    .line 194
    invoke-virtual {v1, v3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_8
    check-cast v3, Llh4;

    .line 198
    .line 199
    iget-wide v7, v1, Lyt2;->T:J

    .line 200
    .line 201
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-virtual {v1}, Lyt2;->m()Lvf5;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-static {v1, v10}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    sget-object v9, Lux0;->d:Ltx0;

    .line 214
    .line 215
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    sget-object v9, Ltx0;->b:Lvy0;

    .line 219
    .line 220
    invoke-virtual {v1}, Lyt2;->i0()V

    .line 221
    .line 222
    .line 223
    iget-boolean v10, v1, Lyt2;->S:Z

    .line 224
    .line 225
    if-eqz v10, :cond_9

    .line 226
    .line 227
    invoke-virtual {v1, v9}, Lyt2;->l(Lsr2;)V

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_9
    invoke-virtual {v1}, Lyt2;->r0()V

    .line 232
    .line 233
    .line 234
    :goto_5
    sget-object v9, Ltx0;->f:Lck;

    .line 235
    .line 236
    invoke-static {v9, v1, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    sget-object v3, Ltx0;->e:Lck;

    .line 240
    .line 241
    invoke-static {v3, v1, v7}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    sget-object v4, Ltx0;->g:Lck;

    .line 249
    .line 250
    invoke-static {v4, v1, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    sget-object v3, Ltx0;->h:Lce;

    .line 254
    .line 255
    invoke-static {v1, v3}, Lg75;->O(Lyt2;Lvr2;)V

    .line 256
    .line 257
    .line 258
    sget-object v3, Ltx0;->d:Lck;

    .line 259
    .line 260
    invoke-static {v3, v1, v8}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-interface {v0, v1, v3}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v6}, Lyt2;->r(Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_a
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 275
    .line 276
    .line 277
    :goto_6
    return-object v2

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
