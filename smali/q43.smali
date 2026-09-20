.class public interface abstract Lq43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lo81;
.implements Ljava/io/Closeable;


# direct methods
.method public static O(Lq43;Lmd2;Lh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lo43;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lo43;

    .line 10
    .line 11
    iget v1, v0, Lo43;->C:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lo43;->C:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lo43;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lo43;-><init>(Lq43;Lh61;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lo43;->A:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Lo43;->C:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    sget-object v5, Lp81;->w:Lp81;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    iget-object p1, v0, Lo43;->z:Lmd2;

    .line 54
    .line 55
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p1, Lmd2;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Lel3;

    .line 65
    .line 66
    iput-object p1, v0, Lo43;->z:Lmd2;

    .line 67
    .line 68
    iput v3, v0, Lo43;->C:I

    .line 69
    .line 70
    sget-object v1, Lw43;->a:Lk81;

    .line 71
    .line 72
    new-instance v1, Lfl3;

    .line 73
    .line 74
    invoke-direct {v1, p2}, Lfl3;-><init>(Lel3;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Lo81;->k()Le81;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2, v1}, Le81;->X(Le81;)Le81;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    sget-object v6, Lw43;->a:Lk81;

    .line 86
    .line 87
    invoke-interface {p2, v6}, Le81;->X(Le81;)Le81;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object v6, v0, Lh61;->x:Le81;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object v7, Lme6;->E:Lme6;

    .line 97
    .line 98
    invoke-interface {v6, v7}, Le81;->a0(Ld81;)Lc81;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    check-cast v6, Lel3;

    .line 103
    .line 104
    if-nez v6, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    new-instance v7, Lst6;

    .line 108
    .line 109
    const/4 v8, 0x5

    .line 110
    invoke-direct {v7, v8, v1}, Lst6;-><init>(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v6, v3, v3, v7}, Lel3;->T(ZZLvr2;)Lmw1;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v6, Lst6;

    .line 118
    .line 119
    const/4 v7, 0x4

    .line 120
    invoke-direct {v6, v7, v3}, Lst6;-><init>(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v6}, Lll3;->v(Lvr2;)Lmw1;

    .line 124
    .line 125
    .line 126
    :goto_1
    if-ne p2, v5, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    :goto_2
    check-cast p2, Le81;

    .line 130
    .line 131
    new-instance v1, Lqx3;

    .line 132
    .line 133
    invoke-direct {v1, p2}, Lqx3;-><init>(Le81;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2, v1}, Le81;->X(Le81;)Le81;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    new-instance v1, Lju1;

    .line 141
    .line 142
    const/16 v3, 0xd

    .line 143
    .line 144
    invoke-direct {v1, p0, p1, v4, v3}, Lju1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 145
    .line 146
    .line 147
    invoke-static {p0, p2, v1, v2}, Lar7;->j(Lo81;Le81;Lgs2;I)Lmo1;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    iput-object v4, v0, Lo43;->z:Lmd2;

    .line 152
    .line 153
    iput v2, v0, Lo43;->C:I

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Lll3;->h(Lh61;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-ne p0, v5, :cond_6

    .line 160
    .line 161
    :goto_3
    return-object v5

    .line 162
    :cond_6
    return-object p0
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
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


# virtual methods
.method public A()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Lg42;->w:Lg42;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
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
.end method
