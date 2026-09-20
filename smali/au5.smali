.class public final Lau5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final c:Lau5;


# instance fields
.field public final a:Lns8;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lau5;

    .line 2
    .line 3
    invoke-direct {v0}, Lau5;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lau5;->c:Lau5;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lau5;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lns8;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lns8;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lau5;->a:Lns8;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Log6;
    .locals 9

    .line 1
    sget-object v0, Lrf3;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object v1, p0, Lau5;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Log6;

    .line 13
    .line 14
    if-nez v2, :cond_b

    .line 15
    .line 16
    iget-object p0, p0, Lau5;->a:Lns8;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/google/protobuf/f;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v2, Lcom/google/protobuf/b;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Lcom/google/protobuf/f;->a:Ljava/lang/Class;

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 43
    .line 44
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    :goto_0
    iget-object p0, p0, Lns8;->x:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lue4;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lue4;->a(Ljava/lang/Class;)Ldw5;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget p0, v3, Ldw5;->d:I

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    and-int/2addr p0, v4

    .line 60
    const/4 v5, 0x1

    .line 61
    if-ne p0, v4, :cond_2

    .line 62
    .line 63
    move p0, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 p0, 0x0

    .line 66
    :goto_1
    const-string v4, "Protobuf runtime is not correctly loaded."

    .line 67
    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    sget-object p0, Lcom/google/protobuf/f;->c:Lys7;

    .line 77
    .line 78
    sget-object v0, Lca2;->a:Laa2;

    .line 79
    .line 80
    iget-object v2, v3, Ldw5;->a:Lcom/google/protobuf/a;

    .line 81
    .line 82
    new-instance v3, Lcom/google/protobuf/e;

    .line 83
    .line 84
    invoke-direct {v3, p0, v0, v2}, Lcom/google/protobuf/e;-><init>(Lcom/google/protobuf/g;Laa2;Lcom/google/protobuf/a;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    sget-object p0, Lcom/google/protobuf/f;->b:Lcom/google/protobuf/g;

    .line 89
    .line 90
    sget-object v2, Lca2;->b:Laa2;

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    iget-object v0, v3, Ldw5;->a:Lcom/google/protobuf/a;

    .line 95
    .line 96
    new-instance v3, Lcom/google/protobuf/e;

    .line 97
    .line 98
    invoke-direct {v3, p0, v2, v0}, Lcom/google/protobuf/e;-><init>(Lcom/google/protobuf/g;Laa2;Lcom/google/protobuf/a;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    invoke-static {v4}, Lh;->s(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_5
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_7

    .line 111
    .line 112
    invoke-virtual {v3}, Ldw5;->a()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-static {p0}, Lb81;->B(I)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eq p0, v5, :cond_6

    .line 121
    .line 122
    sget-object v4, Lhz4;->b:Lfz4;

    .line 123
    .line 124
    sget-object v5, Lr74;->b:Lq74;

    .line 125
    .line 126
    sget-object v6, Lcom/google/protobuf/f;->c:Lys7;

    .line 127
    .line 128
    sget-object v7, Lca2;->a:Laa2;

    .line 129
    .line 130
    sget-object v8, Lmf4;->b:Lkf4;

    .line 131
    .line 132
    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/d;->q(Ldw5;Lfz4;Lr74;Lcom/google/protobuf/g;Laa2;Lkf4;)Lcom/google/protobuf/d;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    goto :goto_2

    .line 137
    :cond_6
    sget-object v4, Lhz4;->b:Lfz4;

    .line 138
    .line 139
    sget-object v5, Lr74;->b:Lq74;

    .line 140
    .line 141
    sget-object v6, Lcom/google/protobuf/f;->c:Lys7;

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    sget-object v8, Lmf4;->b:Lkf4;

    .line 145
    .line 146
    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/d;->q(Ldw5;Lfz4;Lr74;Lcom/google/protobuf/g;Laa2;Lkf4;)Lcom/google/protobuf/d;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    goto :goto_2

    .line 151
    :cond_7
    invoke-virtual {v3}, Ldw5;->a()I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Lb81;->B(I)I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    if-eq p0, v5, :cond_9

    .line 160
    .line 161
    move-object p0, v4

    .line 162
    sget-object v4, Lhz4;->a:Lfz4;

    .line 163
    .line 164
    sget-object v5, Lr74;->a:Lp74;

    .line 165
    .line 166
    sget-object v6, Lcom/google/protobuf/f;->b:Lcom/google/protobuf/g;

    .line 167
    .line 168
    sget-object v7, Lca2;->b:Laa2;

    .line 169
    .line 170
    if-eqz v7, :cond_8

    .line 171
    .line 172
    sget-object v8, Lmf4;->a:Lkf4;

    .line 173
    .line 174
    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/d;->q(Ldw5;Lfz4;Lr74;Lcom/google/protobuf/g;Laa2;Lkf4;)Lcom/google/protobuf/d;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    goto :goto_2

    .line 179
    :cond_8
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :cond_9
    sget-object v4, Lhz4;->a:Lfz4;

    .line 184
    .line 185
    sget-object v5, Lr74;->a:Lp74;

    .line 186
    .line 187
    sget-object v6, Lcom/google/protobuf/f;->b:Lcom/google/protobuf/g;

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    sget-object v8, Lmf4;->a:Lkf4;

    .line 191
    .line 192
    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/d;->q(Ldw5;Lfz4;Lr74;Lcom/google/protobuf/g;Laa2;Lkf4;)Lcom/google/protobuf/d;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    :goto_2
    invoke-virtual {v1, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast p0, Log6;

    .line 201
    .line 202
    if-eqz p0, :cond_a

    .line 203
    .line 204
    return-object p0

    .line 205
    :cond_a
    return-object v3

    .line 206
    :cond_b
    return-object v2

    .line 207
    :cond_c
    const-string p0, "messageType"

    .line 208
    .line 209
    invoke-static {p0}, Lku4;->j(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-object v0
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method
