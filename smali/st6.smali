.class public final Lst6;
.super Ljava/lang/Object;

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lst6;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lst6;->x:Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget v0, p0, Lst6;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object p0, p0, Lst6;->x:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    check-cast p0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    new-instance v0, Lbw8;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lbw8;-><init>(I)V

    .line 32
    .line 33
    .line 34
    check-cast p0, Lyx6;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    check-cast p0, Lfl3;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lll3;->j(Ljava/util/concurrent/CancellationException;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-object v2

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 61
    .line 62
    check-cast p0, Lmw1;

    .line 63
    .line 64
    invoke-interface {p0}, Lmw1;->b()V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :pswitch_3
    check-cast p0, Lvw3;

    .line 69
    .line 70
    check-cast p1, Lsl4;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_4
    check-cast p0, Lkg5;

    .line 77
    .line 78
    check-cast p1, Lwp7;

    .line 79
    .line 80
    iget-object v0, p1, Lwp7;->a:Lqp7;

    .line 81
    .line 82
    iget-object v2, p1, Lwp7;->b:Lwj3;

    .line 83
    .line 84
    iget-object p1, v2, Lwj3;->e:Ljava/util/Set;

    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    invoke-interface {v0}, Lqp7;->a()Lqp7;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    invoke-virtual {p0, v2}, Lkg5;->t(Lwj3;)Ldu7;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_1
    invoke-interface {v0}, Lvq0;->g0()Lfu6;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 112
    .line 113
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-static {v3, v3, v4, p1}, Ljb5;->j(Lvw3;Lfu6;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    .line 117
    .line 118
    .line 119
    const/16 v3, 0xa

    .line 120
    .line 121
    invoke-static {v4, v3}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-static {v3}, Ltf4;->F(I)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    const/16 v5, 0x10

    .line 130
    .line 131
    if-ge v3, v5, :cond_2

    .line 132
    .line 133
    move v3, v5

    .line 134
    :cond_2
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    invoke-direct {v8, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    move-object v10, v3

    .line 154
    check-cast v10, Lqp7;

    .line 155
    .line 156
    if-eqz p1, :cond_4

    .line 157
    .line 158
    invoke-interface {p1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-nez v3, :cond_3

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    invoke-static {v10, v2}, Liq7;->k(Lqp7;Lwj3;)Lxp7;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    goto :goto_5

    .line 170
    :cond_4
    :goto_2
    iget-object v3, v2, Lwj3;->e:Ljava/util/Set;

    .line 171
    .line 172
    if-eqz v3, :cond_5

    .line 173
    .line 174
    invoke-static {v3, v0}, Lwn6;->p(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :goto_3
    move-object v5, v3

    .line 179
    goto :goto_4

    .line 180
    :cond_5
    invoke-static {v0}, Lwn6;->w(Ljava/lang/Object;)Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    goto :goto_3

    .line 185
    :goto_4
    const/4 v6, 0x0

    .line 186
    const/16 v7, 0x2f

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    const/4 v4, 0x0

    .line 190
    invoke-static/range {v2 .. v7}, Lwj3;->a(Lwj3;Lxj3;ZLjava/util/Set;Lfu6;I)Lwj3;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {p0, v10, v3}, Lkg5;->u(Lqp7;Lwj3;)Lvw3;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v10, v2, p0, v3}, Lts2;->k(Lqp7;Lwj3;Lkg5;Lvw3;)Lxp7;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    :goto_5
    invoke-interface {v10}, Lqp7;->n()Lwo7;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-interface {v8, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_6
    new-instance p1, Lq27;

    .line 211
    .line 212
    const/4 v3, 0x1

    .line 213
    invoke-direct {p1, v3, v8}, Lq27;-><init>(ILjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    new-instance v4, Ldq7;

    .line 217
    .line 218
    invoke-direct {v4, p1}, Ldq7;-><init>(Lbq7;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v0}, Lqp7;->getUpperBounds()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v4, p1, v2}, Lkg5;->Q(Ldq7;Ljava/util/List;Lwj3;)Lsn6;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iget-object v0, p1, Lsn6;->w:Lze4;

    .line 233
    .line 234
    invoke-virtual {v0}, Lze4;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_8

    .line 239
    .line 240
    iget-object p0, p1, Lsn6;->w:Lze4;

    .line 241
    .line 242
    iget p0, p0, Lze4;->E:I

    .line 243
    .line 244
    if-ne p0, v3, :cond_7

    .line 245
    .line 246
    invoke-static {p1}, Ldt0;->P0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    move-object v1, p0

    .line 251
    check-cast v1, Lvw3;

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_7
    const-string p0, "Should only be one computed upper bound if no need to intersect all bounds"

    .line 255
    .line 256
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_8
    invoke-virtual {p0, v2}, Lkg5;->t(Lwj3;)Ldu7;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    :goto_6
    return-object v1

    .line 265
    :pswitch_5
    check-cast p1, Leh4;

    .line 266
    .line 267
    iget-object p1, p1, Leh4;->a:[F

    .line 268
    .line 269
    check-cast p0, Ldy3;

    .line 270
    .line 271
    invoke-interface {p0}, Ldy3;->n()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_9

    .line 276
    .line 277
    invoke-static {p0}, Lt49;->I(Ldy3;)Ldy3;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-interface {v0, p0, p1}, Ldy3;->j(Ldy3;[F)V

    .line 282
    .line 283
    .line 284
    :cond_9
    return-object v2

    .line 285
    :pswitch_6
    check-cast p0, Lh28;

    .line 286
    .line 287
    check-cast p1, Lri0;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-interface {p1}, Lpi0;->S()Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iget p0, p0, Lh28;->B:I

    .line 297
    .line 298
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    check-cast p0, Lh28;

    .line 303
    .line 304
    invoke-virtual {p0}, Lj28;->b()Lvw3;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    return-object p0

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
