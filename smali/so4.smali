.class public final Lso4;
.super Ljava/lang/Object;

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final x:Lup2;

.field public final y:Lgq3;


# direct methods
.method public constructor <init>(Lgq3;Lup2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lso4;->w:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso4;->y:Lgq3;

    iput-object p2, p0, Lso4;->x:Lup2;

    return-void
.end method

.method public constructor <init>(Lup2;Lgq3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lso4;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lso4;->x:Lup2;

    .line 8
    .line 9
    iput-object p2, p0, Lso4;->y:Lgq3;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lso4;->w:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lso4;->x:Lup2;

    .line 9
    .line 10
    iget-object p0, p0, Lso4;->y:Lgq3;

    .line 11
    .line 12
    check-cast p1, Lro4;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Lm27;->K:Lup2;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    const-string v4, "No mutable collection class found: "

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v0, Lgs3;->c:Lgs3;

    .line 29
    .line 30
    const-class v2, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-static {v2, v0}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v5, Lb26;->a:Lc26;

    .line 37
    .line 38
    invoke-virtual {v5, v0}, Lc26;->d(Las3;)Las3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lc2;

    .line 43
    .line 44
    invoke-virtual {v0}, Lc2;->g()Lgq3;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_0
    new-instance p0, Lu81;

    .line 53
    .line 54
    new-instance p1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v2, p1}, Lhl6;->m(Lc26;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_1
    sget-object v2, Lm27;->L:Lup2;

    .line 68
    .line 69
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    const-class v5, Ljava/util/Collection;

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    sget-object v0, Lgs3;->c:Lgs3;

    .line 78
    .line 79
    invoke-static {v5, v0}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v2, Lb26;->a:Lc26;

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Lc26;->d(Las3;)Las3;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lc2;

    .line 90
    .line 91
    invoke-virtual {v0}, Lc2;->g()Lgq3;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    new-instance p0, Lu81;

    .line 99
    .line 100
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v5, p1}, Lhl6;->m(Lc26;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_3
    sget-object v2, Lm27;->N:Lup2;

    .line 114
    .line 115
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    sget-object v0, Lgs3;->c:Lgs3;

    .line 122
    .line 123
    invoke-static {v5, v0}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sget-object v2, Lb26;->a:Lc26;

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Lc26;->d(Las3;)Las3;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lc2;

    .line 134
    .line 135
    invoke-virtual {v0}, Lc2;->g()Lgq3;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    new-instance p0, Lu81;

    .line 143
    .line 144
    new-instance p1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v5, p1}, Lhl6;->m(Lc26;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :cond_5
    sget-object v2, Lm27;->M:Lup2;

    .line 158
    .line 159
    invoke-static {v0, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    sget-object v0, Lgs3;->c:Lgs3;

    .line 166
    .line 167
    const-class v2, Ljava/util/Iterator;

    .line 168
    .line 169
    invoke-static {v2, v0}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sget-object v5, Lb26;->a:Lc26;

    .line 174
    .line 175
    invoke-virtual {v5, v0}, Lc26;->d(Las3;)Las3;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Lc2;

    .line 180
    .line 181
    invoke-virtual {v0}, Lc2;->g()Lgq3;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_6

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_6
    new-instance p0, Lu81;

    .line 189
    .line 190
    new-instance p1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v5, v2, p1}, Lhl6;->m(Lc26;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p0

    .line 203
    :cond_7
    move-object v0, v3

    .line 204
    :goto_0
    iget-object p1, p1, Lro4;->y:Ljava/util/List;

    .line 205
    .line 206
    new-instance v2, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-static {p1, v1}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    const/4 v5, 0x0

    .line 224
    if-eqz v4, :cond_8

    .line 225
    .line 226
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Lcs3;

    .line 231
    .line 232
    sget-object v6, Lgs3;->c:Lgs3;

    .line 233
    .line 234
    const/4 v6, 0x7

    .line 235
    invoke-static {v4, v3, v5, v6}, Lbb0;->c0(Lvq3;Ljava/util/List;ZI)Lc2;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-static {v4}, Lx91;->C(Las3;)Lgs3;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_8
    const/4 p1, 0x2

    .line 248
    new-array p1, p1, [Lgq3;

    .line 249
    .line 250
    aput-object p0, p1, v5

    .line 251
    .line 252
    const/4 p0, 0x1

    .line 253
    aput-object v0, p1, p0

    .line 254
    .line 255
    invoke-static {p1}, Lqs;->V0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    new-instance p1, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-static {p0, v1}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_9

    .line 277
    .line 278
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Lgq3;

    .line 283
    .line 284
    const/4 v1, 0x6

    .line 285
    invoke-static {v0, v2, v5, v1}, Lbb0;->c0(Lvq3;Ljava/util/List;ZI)Lc2;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_9
    return-object p1

    .line 294
    :pswitch_0
    iget-object v0, p0, Lso4;->y:Lgq3;

    .line 295
    .line 296
    iget-object p0, p0, Lso4;->x:Lup2;

    .line 297
    .line 298
    check-cast p1, Lro4;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-interface {v0}, Lgq3;->getTypeParameters()Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    new-instance v2, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-static {v0, v1}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_c

    .line 325
    .line 326
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, Lcs3;

    .line 331
    .line 332
    new-instance v3, Lds3;

    .line 333
    .line 334
    invoke-virtual {v1}, Lcs3;->b()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    sget-object v4, Lm27;->J:Lup2;

    .line 339
    .line 340
    invoke-static {p0, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    if-nez v4, :cond_b

    .line 345
    .line 346
    sget-object v4, Lm27;->I:Lup2;

    .line 347
    .line 348
    invoke-static {p0, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_a

    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_a
    sget-object v4, Lks3;->w:Lks3;

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_b
    :goto_4
    sget-object v4, Lks3;->y:Lks3;

    .line 359
    .line 360
    :goto_5
    invoke-direct {v3, p1, v1, v4}, Lds3;-><init>(Les3;Ljava/lang/String;Lks3;)V

    .line 361
    .line 362
    .line 363
    sget-object v1, Lk27;->b:Las3;

    .line 364
    .line 365
    invoke-static {v1}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iput-object v1, v3, Lds3;->B:Ljava/util/List;

    .line 370
    .line 371
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_c
    return-object v2

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
