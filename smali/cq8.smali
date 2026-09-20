.class public final Lcq8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic x:I


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/oss_licenses/zzah;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public constructor <init>(Ljava/lang/String;Lvq8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcq8;->w:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p0, p2, Lvq8;->d:Luy5;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
.method public final close()V
    .locals 2

    .line 1
    sget-object v0, Lsp8;->e:Lcj;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lvq8;

    .line 8
    .line 9
    iget-object v1, v0, Lvq8;->b:Lcq8;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-ne p0, v1, :cond_1

    .line 14
    .line 15
    iget-object p0, v0, Lvq8;->d:Luy5;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    invoke-static {v0, v1, p0}, Lsp8;->a(Lvq8;Lcq8;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x4

    .line 26
    invoke-static {v0, v1, p0}, Lsp8;->a(Lvq8;Lcq8;I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_1
    new-instance p0, Lso8;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const/16 v1, 0x6c

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v1, "Tried to end span <missing root>, but that span is not the current span. The current span is <missing root>."

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    new-instance p0, Lso8;

    .line 53
    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const/16 v1, 0x73

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 59
    .line 60
    .line 61
    const-string v1, "Tried to end [<missing root>], but no trace was active. This is caused by mismatched or missing calls to beginSpan."

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 24

    .line 1
    sget-boolean v0, Lsp8;->a:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    move v2, v0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    const/16 v4, 0xe

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/2addr v3, v4

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    move-object v1, v5

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0xfa

    .line 19
    .line 20
    const-string v6, "<missing root>"

    .line 21
    .line 22
    if-le v2, v1, :cond_36

    .line 23
    .line 24
    add-int/lit8 v1, v2, -0x1

    .line 25
    .line 26
    new-array v7, v2, [Ljava/lang/String;

    .line 27
    .line 28
    move-object/from16 v8, p0

    .line 29
    .line 30
    :goto_1
    if-ltz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    aput-object v6, v7, v1

    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    move-object v8, v5

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v1, 0x8

    .line 42
    .line 43
    new-array v1, v1, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v7}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    check-cast v8, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v2, v8}, Los8;->z(I[Ljava/lang/Object;)Los8;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v8}, Los8;->v()Lat7;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    move v9, v0

    .line 60
    move v10, v9

    .line 61
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const/4 v12, 0x1

    .line 66
    if-eqz v11, :cond_6

    .line 67
    .line 68
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    add-int/lit8 v13, v9, 0x1

    .line 73
    .line 74
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    add-int/lit8 v14, v10, 0x1

    .line 79
    .line 80
    array-length v15, v1

    .line 81
    move/from16 v16, v4

    .line 82
    .line 83
    add-int v4, v14, v14

    .line 84
    .line 85
    if-le v4, v15, :cond_4

    .line 86
    .line 87
    if-le v4, v15, :cond_3

    .line 88
    .line 89
    shr-int/lit8 v17, v15, 0x1

    .line 90
    .line 91
    add-int v15, v15, v17

    .line 92
    .line 93
    add-int/2addr v15, v12

    .line 94
    if-ge v15, v4, :cond_2

    .line 95
    .line 96
    add-int/lit8 v4, v4, -0x1

    .line 97
    .line 98
    invoke-static {v4}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    add-int/2addr v4, v4

    .line 103
    move v15, v4

    .line 104
    :cond_2
    if-gez v15, :cond_3

    .line 105
    .line 106
    const v15, 0x7fffffff

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_4
    if-eqz v11, :cond_5

    .line 114
    .line 115
    add-int/2addr v10, v10

    .line 116
    aput-object v11, v1, v10

    .line 117
    .line 118
    add-int/2addr v10, v12

    .line 119
    aput-object v9, v1, v10

    .line 120
    .line 121
    move v9, v13

    .line 122
    move v10, v14

    .line 123
    move/from16 v4, v16

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v1, "null key in entry: null="

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v5

    .line 140
    :cond_6
    move/from16 v16, v4

    .line 141
    .line 142
    const/4 v4, -0x1

    .line 143
    if-nez v10, :cond_7

    .line 144
    .line 145
    sget-object v1, Ln36;->E:Ln36;

    .line 146
    .line 147
    move/from16 v21, v0

    .line 148
    .line 149
    move-object v0, v5

    .line 150
    move-object/from16 v18, v0

    .line 151
    .line 152
    goto/16 :goto_f

    .line 153
    .line 154
    :cond_7
    if-ne v10, v12, :cond_8

    .line 155
    .line 156
    aget-object v8, v1, v0

    .line 157
    .line 158
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    aget-object v8, v1, v12

    .line 162
    .line 163
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    new-instance v8, Ln36;

    .line 167
    .line 168
    invoke-direct {v8, v12, v12, v5, v1}, Ln36;-><init>(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move/from16 v21, v0

    .line 172
    .line 173
    move-object v0, v5

    .line 174
    move-object/from16 v18, v0

    .line 175
    .line 176
    move-object v1, v8

    .line 177
    goto/16 :goto_f

    .line 178
    .line 179
    :cond_8
    array-length v8, v1

    .line 180
    shr-int/2addr v8, v12

    .line 181
    invoke-static {v10, v8}, Ll55;->C(II)V

    .line 182
    .line 183
    .line 184
    invoke-static {v10}, Los8;->w(I)I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-ne v10, v12, :cond_9

    .line 189
    .line 190
    aget-object v8, v1, v0

    .line 191
    .line 192
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    aget-object v8, v1, v12

    .line 196
    .line 197
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move/from16 v21, v0

    .line 201
    .line 202
    move-object v8, v5

    .line 203
    move-object/from16 v18, v8

    .line 204
    .line 205
    move v10, v12

    .line 206
    move/from16 v22, v10

    .line 207
    .line 208
    const/16 v20, 0x2

    .line 209
    .line 210
    goto/16 :goto_d

    .line 211
    .line 212
    :cond_9
    add-int/lit8 v11, v8, -0x1

    .line 213
    .line 214
    const/16 v13, 0x80

    .line 215
    .line 216
    const/4 v14, 0x3

    .line 217
    if-gt v8, v13, :cond_f

    .line 218
    .line 219
    new-array v8, v8, [B

    .line 220
    .line 221
    invoke-static {v8, v4}, Ljava/util/Arrays;->fill([BB)V

    .line 222
    .line 223
    .line 224
    move v13, v0

    .line 225
    move v15, v13

    .line 226
    move-object/from16 v17, v5

    .line 227
    .line 228
    :goto_3
    if-ge v13, v10, :cond_d

    .line 229
    .line 230
    move-object/from16 v18, v5

    .line 231
    .line 232
    add-int v5, v15, v15

    .line 233
    .line 234
    add-int v19, v13, v13

    .line 235
    .line 236
    const/16 v20, 0x2

    .line 237
    .line 238
    aget-object v9, v1, v19

    .line 239
    .line 240
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    xor-int/lit8 v19, v19, 0x1

    .line 244
    .line 245
    move/from16 v21, v0

    .line 246
    .line 247
    aget-object v0, v1, v19

    .line 248
    .line 249
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    .line 253
    .line 254
    .line 255
    move-result v19

    .line 256
    invoke-static/range {v19 .. v19}, Lz65;->X(I)I

    .line 257
    .line 258
    .line 259
    move-result v19

    .line 260
    :goto_4
    and-int v19, v19, v11

    .line 261
    .line 262
    move/from16 v22, v12

    .line 263
    .line 264
    aget-byte v12, v8, v19

    .line 265
    .line 266
    const/16 v4, 0xff

    .line 267
    .line 268
    and-int/2addr v12, v4

    .line 269
    if-ne v12, v4, :cond_b

    .line 270
    .line 271
    int-to-byte v4, v5

    .line 272
    aput-byte v4, v8, v19

    .line 273
    .line 274
    if-ge v15, v13, :cond_a

    .line 275
    .line 276
    aput-object v9, v1, v5

    .line 277
    .line 278
    xor-int/lit8 v4, v5, 0x1

    .line 279
    .line 280
    aput-object v0, v1, v4

    .line 281
    .line 282
    :cond_a
    add-int/lit8 v15, v15, 0x1

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_b
    aget-object v4, v1, v12

    .line 286
    .line 287
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_c

    .line 292
    .line 293
    xor-int/lit8 v4, v12, 0x1

    .line 294
    .line 295
    new-instance v5, Ljs8;

    .line 296
    .line 297
    aget-object v12, v1, v4

    .line 298
    .line 299
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    invoke-direct {v5, v9, v0, v12}, Ljs8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    aput-object v0, v1, v4

    .line 306
    .line 307
    move-object/from16 v17, v5

    .line 308
    .line 309
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 310
    .line 311
    move-object/from16 v5, v18

    .line 312
    .line 313
    move/from16 v0, v21

    .line 314
    .line 315
    move/from16 v12, v22

    .line 316
    .line 317
    const/4 v4, -0x1

    .line 318
    goto :goto_3

    .line 319
    :cond_c
    add-int/lit8 v19, v19, 0x1

    .line 320
    .line 321
    move/from16 v12, v22

    .line 322
    .line 323
    const/4 v4, -0x1

    .line 324
    goto :goto_4

    .line 325
    :cond_d
    move/from16 v21, v0

    .line 326
    .line 327
    move-object/from16 v18, v5

    .line 328
    .line 329
    move/from16 v22, v12

    .line 330
    .line 331
    const/16 v20, 0x2

    .line 332
    .line 333
    if-ne v15, v10, :cond_e

    .line 334
    .line 335
    goto/16 :goto_d

    .line 336
    .line 337
    :cond_e
    new-array v0, v14, [Ljava/lang/Object;

    .line 338
    .line 339
    aput-object v8, v0, v21

    .line 340
    .line 341
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    aput-object v4, v0, v22

    .line 346
    .line 347
    aput-object v17, v0, v20

    .line 348
    .line 349
    :goto_6
    move-object v8, v0

    .line 350
    goto/16 :goto_d

    .line 351
    .line 352
    :cond_f
    move/from16 v21, v0

    .line 353
    .line 354
    move-object/from16 v18, v5

    .line 355
    .line 356
    move/from16 v22, v12

    .line 357
    .line 358
    const/16 v20, 0x2

    .line 359
    .line 360
    const v0, 0x8000

    .line 361
    .line 362
    .line 363
    if-gt v8, v0, :cond_15

    .line 364
    .line 365
    new-array v8, v8, [S

    .line 366
    .line 367
    const/4 v0, -0x1

    .line 368
    invoke-static {v8, v0}, Ljava/util/Arrays;->fill([SS)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v5, v18

    .line 372
    .line 373
    move/from16 v0, v21

    .line 374
    .line 375
    move v4, v0

    .line 376
    :goto_7
    if-ge v0, v10, :cond_13

    .line 377
    .line 378
    add-int v9, v4, v4

    .line 379
    .line 380
    add-int v12, v0, v0

    .line 381
    .line 382
    aget-object v13, v1, v12

    .line 383
    .line 384
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    xor-int/lit8 v12, v12, 0x1

    .line 388
    .line 389
    aget-object v12, v1, v12

    .line 390
    .line 391
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 395
    .line 396
    .line 397
    move-result v15

    .line 398
    invoke-static {v15}, Lz65;->X(I)I

    .line 399
    .line 400
    .line 401
    move-result v15

    .line 402
    :goto_8
    and-int/2addr v15, v11

    .line 403
    aget-short v14, v8, v15

    .line 404
    .line 405
    int-to-char v14, v14

    .line 406
    move-object/from16 v19, v5

    .line 407
    .line 408
    const v5, 0xffff

    .line 409
    .line 410
    .line 411
    if-ne v14, v5, :cond_11

    .line 412
    .line 413
    int-to-short v5, v9

    .line 414
    aput-short v5, v8, v15

    .line 415
    .line 416
    if-ge v4, v0, :cond_10

    .line 417
    .line 418
    aput-object v13, v1, v9

    .line 419
    .line 420
    xor-int/lit8 v5, v9, 0x1

    .line 421
    .line 422
    aput-object v12, v1, v5

    .line 423
    .line 424
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 425
    .line 426
    move-object/from16 v5, v19

    .line 427
    .line 428
    goto :goto_9

    .line 429
    :cond_11
    aget-object v5, v1, v14

    .line 430
    .line 431
    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-eqz v5, :cond_12

    .line 436
    .line 437
    xor-int/lit8 v5, v14, 0x1

    .line 438
    .line 439
    new-instance v9, Ljs8;

    .line 440
    .line 441
    aget-object v14, v1, v5

    .line 442
    .line 443
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    invoke-direct {v9, v13, v12, v14}, Ljs8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    aput-object v12, v1, v5

    .line 450
    .line 451
    move-object v5, v9

    .line 452
    :goto_9
    add-int/lit8 v0, v0, 0x1

    .line 453
    .line 454
    const/4 v14, 0x3

    .line 455
    goto :goto_7

    .line 456
    :cond_12
    add-int/lit8 v15, v15, 0x1

    .line 457
    .line 458
    move-object/from16 v5, v19

    .line 459
    .line 460
    const/4 v14, 0x3

    .line 461
    goto :goto_8

    .line 462
    :cond_13
    move-object/from16 v19, v5

    .line 463
    .line 464
    if-ne v4, v10, :cond_14

    .line 465
    .line 466
    goto/16 :goto_d

    .line 467
    .line 468
    :cond_14
    const/4 v0, 0x3

    .line 469
    new-array v0, v0, [Ljava/lang/Object;

    .line 470
    .line 471
    aput-object v8, v0, v21

    .line 472
    .line 473
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    aput-object v4, v0, v22

    .line 478
    .line 479
    aput-object v19, v0, v20

    .line 480
    .line 481
    goto/16 :goto_6

    .line 482
    .line 483
    :cond_15
    new-array v8, v8, [I

    .line 484
    .line 485
    const/4 v0, -0x1

    .line 486
    invoke-static {v8, v0}, Ljava/util/Arrays;->fill([II)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v5, v18

    .line 490
    .line 491
    move/from16 v0, v21

    .line 492
    .line 493
    move v4, v0

    .line 494
    :goto_a
    if-ge v0, v10, :cond_19

    .line 495
    .line 496
    add-int v9, v4, v4

    .line 497
    .line 498
    add-int v12, v0, v0

    .line 499
    .line 500
    aget-object v13, v1, v12

    .line 501
    .line 502
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    xor-int/lit8 v12, v12, 0x1

    .line 506
    .line 507
    aget-object v12, v1, v12

    .line 508
    .line 509
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 513
    .line 514
    .line 515
    move-result v14

    .line 516
    invoke-static {v14}, Lz65;->X(I)I

    .line 517
    .line 518
    .line 519
    move-result v14

    .line 520
    :goto_b
    and-int/2addr v14, v11

    .line 521
    aget v15, v8, v14

    .line 522
    .line 523
    move-object/from16 v19, v5

    .line 524
    .line 525
    const/4 v5, -0x1

    .line 526
    if-ne v15, v5, :cond_17

    .line 527
    .line 528
    aput v9, v8, v14

    .line 529
    .line 530
    if-ge v4, v0, :cond_16

    .line 531
    .line 532
    aput-object v13, v1, v9

    .line 533
    .line 534
    xor-int/lit8 v5, v9, 0x1

    .line 535
    .line 536
    aput-object v12, v1, v5

    .line 537
    .line 538
    :cond_16
    add-int/lit8 v4, v4, 0x1

    .line 539
    .line 540
    move-object/from16 v5, v19

    .line 541
    .line 542
    goto :goto_c

    .line 543
    :cond_17
    aget-object v5, v1, v15

    .line 544
    .line 545
    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    if-eqz v5, :cond_18

    .line 550
    .line 551
    xor-int/lit8 v5, v15, 0x1

    .line 552
    .line 553
    new-instance v9, Ljs8;

    .line 554
    .line 555
    aget-object v14, v1, v5

    .line 556
    .line 557
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    invoke-direct {v9, v13, v12, v14}, Ljs8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    aput-object v12, v1, v5

    .line 564
    .line 565
    move-object v5, v9

    .line 566
    :goto_c
    add-int/lit8 v0, v0, 0x1

    .line 567
    .line 568
    goto :goto_a

    .line 569
    :cond_18
    add-int/lit8 v14, v14, 0x1

    .line 570
    .line 571
    move-object/from16 v5, v19

    .line 572
    .line 573
    goto :goto_b

    .line 574
    :cond_19
    move-object/from16 v19, v5

    .line 575
    .line 576
    if-ne v4, v10, :cond_1a

    .line 577
    .line 578
    goto :goto_d

    .line 579
    :cond_1a
    const/4 v0, 0x3

    .line 580
    new-array v0, v0, [Ljava/lang/Object;

    .line 581
    .line 582
    aput-object v8, v0, v21

    .line 583
    .line 584
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    aput-object v4, v0, v22

    .line 589
    .line 590
    aput-object v19, v0, v20

    .line 591
    .line 592
    goto/16 :goto_6

    .line 593
    .line 594
    :goto_d
    instance-of v0, v8, [Ljava/lang/Object;

    .line 595
    .line 596
    if-eqz v0, :cond_1b

    .line 597
    .line 598
    check-cast v8, [Ljava/lang/Object;

    .line 599
    .line 600
    aget-object v0, v8, v20

    .line 601
    .line 602
    check-cast v0, Ljs8;

    .line 603
    .line 604
    aget-object v4, v8, v21

    .line 605
    .line 606
    aget-object v5, v8, v22

    .line 607
    .line 608
    check-cast v5, Ljava/lang/Integer;

    .line 609
    .line 610
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v10

    .line 614
    add-int v5, v10, v10

    .line 615
    .line 616
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    move-object v8, v4

    .line 621
    goto :goto_e

    .line 622
    :cond_1b
    move-object/from16 v0, v18

    .line 623
    .line 624
    :goto_e
    new-instance v4, Ln36;

    .line 625
    .line 626
    move/from16 v5, v22

    .line 627
    .line 628
    invoke-direct {v4, v10, v5, v8, v1}, Ln36;-><init>(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    move-object v1, v4

    .line 632
    :goto_f
    iget v4, v1, Ln36;->z:I

    .line 633
    .line 634
    if-nez v0, :cond_35

    .line 635
    .line 636
    shr-int/lit8 v5, v2, 0x2

    .line 637
    .line 638
    if-le v4, v5, :cond_1c

    .line 639
    .line 640
    :goto_10
    move-object/from16 v4, v18

    .line 641
    .line 642
    goto/16 :goto_1c

    .line 643
    .line 644
    :cond_1c
    add-int/lit8 v0, v2, 0x1

    .line 645
    .line 646
    new-array v8, v0, [I

    .line 647
    .line 648
    move/from16 v9, v21

    .line 649
    .line 650
    :goto_11
    if-ge v9, v2, :cond_1d

    .line 651
    .line 652
    aget-object v10, v7, v9

    .line 653
    .line 654
    invoke-virtual {v1, v10}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v10

    .line 658
    check-cast v10, Ljava/lang/Integer;

    .line 659
    .line 660
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 661
    .line 662
    .line 663
    move-result v10

    .line 664
    aput v10, v8, v9

    .line 665
    .line 666
    add-int/lit8 v9, v9, 0x1

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :cond_1d
    aput v4, v8, v2

    .line 670
    .line 671
    new-instance v1, Lj32;

    .line 672
    .line 673
    const/4 v4, 0x1

    .line 674
    invoke-direct {v1, v8, v4}, Lj32;-><init>([II)V

    .line 675
    .line 676
    .line 677
    move/from16 v9, v21

    .line 678
    .line 679
    :goto_12
    if-ge v9, v0, :cond_26

    .line 680
    .line 681
    iget v10, v1, Lj32;->d:I

    .line 682
    .line 683
    add-int/2addr v10, v4

    .line 684
    iput v10, v1, Lj32;->d:I

    .line 685
    .line 686
    aget v4, v8, v9

    .line 687
    .line 688
    :goto_13
    move-object/from16 v10, v18

    .line 689
    .line 690
    :goto_14
    iget v11, v1, Lj32;->d:I

    .line 691
    .line 692
    if-lez v11, :cond_25

    .line 693
    .line 694
    iget v11, v1, Lj32;->c:I

    .line 695
    .line 696
    iget-object v12, v1, Lj32;->g:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v12, Lrq8;

    .line 699
    .line 700
    const/high16 v13, 0x40000000    # 2.0f

    .line 701
    .line 702
    if-nez v11, :cond_21

    .line 703
    .line 704
    iget-object v11, v12, Lrq8;->d:Ljava/util/HashMap;

    .line 705
    .line 706
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 707
    .line 708
    .line 709
    move-result-object v12

    .line 710
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    if-nez v11, :cond_1f

    .line 715
    .line 716
    new-instance v11, Lrq8;

    .line 717
    .line 718
    invoke-direct {v11, v9, v13}, Lrq8;-><init>(II)V

    .line 719
    .line 720
    .line 721
    iget-object v13, v1, Lj32;->g:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v13, Lrq8;

    .line 724
    .line 725
    iget-object v13, v13, Lrq8;->d:Ljava/util/HashMap;

    .line 726
    .line 727
    invoke-virtual {v13, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    if-eqz v10, :cond_1e

    .line 731
    .line 732
    iget-object v11, v1, Lj32;->g:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v11, Lrq8;

    .line 735
    .line 736
    iput-object v11, v10, Lrq8;->c:Lrq8;

    .line 737
    .line 738
    :cond_1e
    iget v10, v1, Lj32;->d:I

    .line 739
    .line 740
    const/16 v23, -0x1

    .line 741
    .line 742
    add-int/lit8 v10, v10, -0x1

    .line 743
    .line 744
    iput v10, v1, Lj32;->d:I

    .line 745
    .line 746
    invoke-virtual {v1}, Lj32;->d()V

    .line 747
    .line 748
    .line 749
    goto :goto_13

    .line 750
    :cond_1f
    if-eqz v10, :cond_20

    .line 751
    .line 752
    iget-object v4, v1, Lj32;->g:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v4, Lrq8;

    .line 755
    .line 756
    iput-object v4, v10, Lrq8;->c:Lrq8;

    .line 757
    .line 758
    :cond_20
    iput v9, v1, Lj32;->b:I

    .line 759
    .line 760
    iget v4, v1, Lj32;->c:I

    .line 761
    .line 762
    const/16 v22, 0x1

    .line 763
    .line 764
    add-int/lit8 v4, v4, 0x1

    .line 765
    .line 766
    iput v4, v1, Lj32;->c:I

    .line 767
    .line 768
    invoke-virtual {v1}, Lj32;->c()V

    .line 769
    .line 770
    .line 771
    goto/16 :goto_15

    .line 772
    .line 773
    :cond_21
    iget-object v11, v12, Lrq8;->d:Ljava/util/HashMap;

    .line 774
    .line 775
    iget v12, v1, Lj32;->b:I

    .line 776
    .line 777
    aget v12, v8, v12

    .line 778
    .line 779
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object v12

    .line 783
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v11

    .line 787
    check-cast v11, Lrq8;

    .line 788
    .line 789
    iget v11, v11, Lrq8;->a:I

    .line 790
    .line 791
    iget v12, v1, Lj32;->c:I

    .line 792
    .line 793
    add-int/2addr v11, v12

    .line 794
    aget v11, v8, v11

    .line 795
    .line 796
    if-ne v11, v4, :cond_23

    .line 797
    .line 798
    if-eqz v10, :cond_22

    .line 799
    .line 800
    iget-object v4, v1, Lj32;->g:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v4, Lrq8;

    .line 803
    .line 804
    iput-object v4, v10, Lrq8;->c:Lrq8;

    .line 805
    .line 806
    :cond_22
    add-int/lit8 v12, v12, 0x1

    .line 807
    .line 808
    iput v12, v1, Lj32;->c:I

    .line 809
    .line 810
    invoke-virtual {v1}, Lj32;->c()V

    .line 811
    .line 812
    .line 813
    goto :goto_15

    .line 814
    :cond_23
    iget-object v11, v1, Lj32;->g:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v11, Lrq8;

    .line 817
    .line 818
    iget-object v11, v11, Lrq8;->d:Ljava/util/HashMap;

    .line 819
    .line 820
    iget v12, v1, Lj32;->b:I

    .line 821
    .line 822
    aget v12, v8, v12

    .line 823
    .line 824
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 825
    .line 826
    .line 827
    move-result-object v12

    .line 828
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v11

    .line 832
    check-cast v11, Lrq8;

    .line 833
    .line 834
    new-instance v12, Lrq8;

    .line 835
    .line 836
    iget v14, v11, Lrq8;->a:I

    .line 837
    .line 838
    iget v15, v1, Lj32;->c:I

    .line 839
    .line 840
    add-int/2addr v15, v14

    .line 841
    const/16 v23, -0x1

    .line 842
    .line 843
    add-int/lit8 v15, v15, -0x1

    .line 844
    .line 845
    invoke-direct {v12, v14, v15}, Lrq8;-><init>(II)V

    .line 846
    .line 847
    .line 848
    iget-object v14, v1, Lj32;->g:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v14, Lrq8;

    .line 851
    .line 852
    iget-object v14, v14, Lrq8;->d:Ljava/util/HashMap;

    .line 853
    .line 854
    iget v15, v1, Lj32;->b:I

    .line 855
    .line 856
    aget v15, v8, v15

    .line 857
    .line 858
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 859
    .line 860
    .line 861
    move-result-object v15

    .line 862
    invoke-virtual {v14, v15, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    iget v14, v12, Lrq8;->b:I

    .line 866
    .line 867
    const/16 v22, 0x1

    .line 868
    .line 869
    add-int/lit8 v14, v14, 0x1

    .line 870
    .line 871
    aget v15, v8, v14

    .line 872
    .line 873
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 874
    .line 875
    .line 876
    move-result-object v15

    .line 877
    iget-object v13, v12, Lrq8;->d:Ljava/util/HashMap;

    .line 878
    .line 879
    invoke-virtual {v13, v15, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    iput v14, v11, Lrq8;->a:I

    .line 883
    .line 884
    if-eqz v10, :cond_24

    .line 885
    .line 886
    iput-object v12, v10, Lrq8;->c:Lrq8;

    .line 887
    .line 888
    :cond_24
    new-instance v10, Lrq8;

    .line 889
    .line 890
    const/high16 v11, 0x40000000    # 2.0f

    .line 891
    .line 892
    invoke-direct {v10, v9, v11}, Lrq8;-><init>(II)V

    .line 893
    .line 894
    .line 895
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v11

    .line 899
    invoke-virtual {v13, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    iget v10, v1, Lj32;->d:I

    .line 903
    .line 904
    const/16 v23, -0x1

    .line 905
    .line 906
    add-int/lit8 v10, v10, -0x1

    .line 907
    .line 908
    iput v10, v1, Lj32;->d:I

    .line 909
    .line 910
    invoke-virtual {v1}, Lj32;->d()V

    .line 911
    .line 912
    .line 913
    move-object v10, v12

    .line 914
    goto/16 :goto_14

    .line 915
    .line 916
    :cond_25
    :goto_15
    add-int/lit8 v9, v9, 0x1

    .line 917
    .line 918
    const/4 v4, 0x1

    .line 919
    goto/16 :goto_12

    .line 920
    .line 921
    :cond_26
    new-instance v0, Ljava/util/ArrayDeque;

    .line 922
    .line 923
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 924
    .line 925
    .line 926
    new-instance v4, Lnq8;

    .line 927
    .line 928
    iget-object v9, v1, Lj32;->f:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v9, Lrq8;

    .line 931
    .line 932
    move/from16 v11, v21

    .line 933
    .line 934
    const/4 v10, -0x1

    .line 935
    invoke-direct {v4, v9, v11, v10, v10}, Lnq8;-><init>(Lrq8;III)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    :cond_27
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 942
    .line 943
    .line 944
    move-result v10

    .line 945
    if-nez v10, :cond_2c

    .line 946
    .line 947
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v10

    .line 951
    check-cast v10, Lnq8;

    .line 952
    .line 953
    iget-object v11, v10, Lnq8;->d:Lrq8;

    .line 954
    .line 955
    iget-object v11, v11, Lrq8;->d:Ljava/util/HashMap;

    .line 956
    .line 957
    invoke-virtual {v11}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 958
    .line 959
    .line 960
    move-result-object v11

    .line 961
    invoke-interface {v11}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 962
    .line 963
    .line 964
    move-result-object v11

    .line 965
    :goto_16
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 966
    .line 967
    .line 968
    move-result v12

    .line 969
    if-eqz v12, :cond_27

    .line 970
    .line 971
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v12

    .line 975
    check-cast v12, Lrq8;

    .line 976
    .line 977
    iget v13, v10, Lnq8;->b:I

    .line 978
    .line 979
    iget v14, v10, Lnq8;->c:I

    .line 980
    .line 981
    iget v15, v12, Lrq8;->a:I

    .line 982
    .line 983
    move-object/from16 v17, v9

    .line 984
    .line 985
    iget v9, v12, Lrq8;->b:I

    .line 986
    .line 987
    invoke-virtual {v1, v13, v14, v15, v9}, Lj32;->h(IIII)Z

    .line 988
    .line 989
    .line 990
    move-result v15

    .line 991
    if-nez v15, :cond_2a

    .line 992
    .line 993
    iget-object v15, v12, Lrq8;->d:Ljava/util/HashMap;

    .line 994
    .line 995
    invoke-virtual {v15}, Ljava/util/HashMap;->isEmpty()Z

    .line 996
    .line 997
    .line 998
    move-result v15

    .line 999
    if-eqz v15, :cond_28

    .line 1000
    .line 1001
    iget v15, v12, Lrq8;->a:I

    .line 1002
    .line 1003
    add-int v19, v15, v14

    .line 1004
    .line 1005
    move-object/from16 v20, v11

    .line 1006
    .line 1007
    sub-int v11, v19, v13

    .line 1008
    .line 1009
    invoke-virtual {v1, v13, v14, v15, v11}, Lj32;->h(IIII)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v11

    .line 1013
    if-eqz v11, :cond_29

    .line 1014
    .line 1015
    :goto_17
    const/4 v15, 0x1

    .line 1016
    goto :goto_18

    .line 1017
    :cond_28
    move-object/from16 v20, v11

    .line 1018
    .line 1019
    :cond_29
    new-instance v11, Lnq8;

    .line 1020
    .line 1021
    iget v13, v12, Lrq8;->a:I

    .line 1022
    .line 1023
    const/4 v15, 0x1

    .line 1024
    invoke-direct {v11, v12, v15, v13, v9}, Lnq8;-><init>(Lrq8;III)V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_19

    .line 1028
    :cond_2a
    move-object/from16 v20, v11

    .line 1029
    .line 1030
    goto :goto_17

    .line 1031
    :goto_18
    new-instance v11, Lnq8;

    .line 1032
    .line 1033
    iget v9, v10, Lnq8;->a:I

    .line 1034
    .line 1035
    add-int/2addr v9, v15

    .line 1036
    invoke-direct {v11, v12, v9, v13, v14}, Lnq8;-><init>(Lrq8;III)V

    .line 1037
    .line 1038
    .line 1039
    :goto_19
    iget v9, v4, Lnq8;->a:I

    .line 1040
    .line 1041
    iget v12, v11, Lnq8;->a:I

    .line 1042
    .line 1043
    if-ge v9, v12, :cond_2b

    .line 1044
    .line 1045
    move-object v4, v11

    .line 1046
    :cond_2b
    invoke-virtual {v0, v11}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1047
    .line 1048
    .line 1049
    move-object/from16 v9, v17

    .line 1050
    .line 1051
    move-object/from16 v11, v20

    .line 1052
    .line 1053
    goto :goto_16

    .line 1054
    :cond_2c
    move-object/from16 v17, v9

    .line 1055
    .line 1056
    iget v0, v4, Lnq8;->c:I

    .line 1057
    .line 1058
    const/16 v22, 0x1

    .line 1059
    .line 1060
    add-int/lit8 v0, v0, 0x1

    .line 1061
    .line 1062
    array-length v1, v8

    .line 1063
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 1064
    .line 1065
    .line 1066
    move-result v1

    .line 1067
    const/4 v11, 0x0

    .line 1068
    :cond_2d
    iget v0, v4, Lnq8;->b:I

    .line 1069
    .line 1070
    sub-int v10, v1, v0

    .line 1071
    .line 1072
    rem-int v12, v11, v10

    .line 1073
    .line 1074
    add-int/2addr v12, v0

    .line 1075
    aget v12, v8, v12

    .line 1076
    .line 1077
    iget-object v9, v9, Lrq8;->d:Ljava/util/HashMap;

    .line 1078
    .line 1079
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v12

    .line 1083
    invoke-virtual {v9, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v9

    .line 1087
    check-cast v9, Lrq8;

    .line 1088
    .line 1089
    if-nez v9, :cond_2e

    .line 1090
    .line 1091
    goto :goto_1b

    .line 1092
    :cond_2e
    iget v12, v9, Lrq8;->a:I

    .line 1093
    .line 1094
    :goto_1a
    iget v13, v9, Lrq8;->b:I

    .line 1095
    .line 1096
    const/16 v22, 0x1

    .line 1097
    .line 1098
    add-int/lit8 v13, v13, 0x1

    .line 1099
    .line 1100
    if-ge v12, v13, :cond_2d

    .line 1101
    .line 1102
    array-length v13, v8

    .line 1103
    if-ge v12, v13, :cond_2d

    .line 1104
    .line 1105
    rem-int v13, v11, v10

    .line 1106
    .line 1107
    add-int/2addr v13, v0

    .line 1108
    aget v13, v8, v13

    .line 1109
    .line 1110
    aget v14, v8, v12

    .line 1111
    .line 1112
    if-ne v13, v14, :cond_2f

    .line 1113
    .line 1114
    add-int/lit8 v11, v11, 0x1

    .line 1115
    .line 1116
    add-int/lit8 v12, v12, 0x1

    .line 1117
    .line 1118
    goto :goto_1a

    .line 1119
    :cond_2f
    :goto_1b
    new-instance v4, Ld12;

    .line 1120
    .line 1121
    div-int/2addr v11, v10

    .line 1122
    invoke-direct {v4, v0, v1, v11}, Ld12;-><init>(III)V

    .line 1123
    .line 1124
    .line 1125
    mul-int/2addr v10, v11

    .line 1126
    if-ge v10, v5, :cond_30

    .line 1127
    .line 1128
    goto/16 :goto_10

    .line 1129
    .line 1130
    :cond_30
    :goto_1c
    const-string v0, ""

    .line 1131
    .line 1132
    if-nez v4, :cond_31

    .line 1133
    .line 1134
    goto :goto_1e

    .line 1135
    :cond_31
    iget v1, v4, Ld12;->a:I

    .line 1136
    .line 1137
    const-string v5, " -> "

    .line 1138
    .line 1139
    if-lez v1, :cond_32

    .line 1140
    .line 1141
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v8

    .line 1145
    invoke-static {v5, v8}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v8

    .line 1149
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v8

    .line 1153
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v8

    .line 1157
    goto :goto_1d

    .line 1158
    :cond_32
    move-object v8, v0

    .line 1159
    :goto_1d
    iget v9, v4, Ld12;->b:I

    .line 1160
    .line 1161
    iget v4, v4, Ld12;->c:I

    .line 1162
    .line 1163
    sub-int v10, v9, v1

    .line 1164
    .line 1165
    mul-int/2addr v10, v4

    .line 1166
    add-int/2addr v10, v1

    .line 1167
    if-ge v10, v2, :cond_33

    .line 1168
    .line 1169
    invoke-static {v7, v10, v2}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-static {v5, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    :cond_33
    invoke-static {v7, v1, v9}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v1

    .line 1189
    invoke-static {v5, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1194
    .line 1195
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    const-string v5, "{"

    .line 1204
    .line 1205
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    .line 1211
    const-string v1, "}x"

    .line 1212
    .line 1213
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    :goto_1e
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1227
    .line 1228
    .line 1229
    move-result v1

    .line 1230
    if-eqz v1, :cond_34

    .line 1231
    .line 1232
    goto :goto_1f

    .line 1233
    :cond_34
    return-object v0

    .line 1234
    :cond_35
    iget-object v1, v0, Ljs8;->c:Ljava/lang/Object;

    .line 1235
    .line 1236
    iget-object v2, v0, Ljs8;->b:Ljava/lang/Object;

    .line 1237
    .line 1238
    iget-object v0, v0, Ljs8;->a:Ljava/lang/Object;

    .line 1239
    .line 1240
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v3

    .line 1244
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v2

    .line 1248
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1257
    .line 1258
    .line 1259
    move-result v4

    .line 1260
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1261
    .line 1262
    .line 1263
    move-result v5

    .line 1264
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1265
    .line 1266
    .line 1267
    move-result v6

    .line 1268
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1269
    .line 1270
    .line 1271
    move-result v7

    .line 1272
    add-int/lit8 v4, v4, 0x21

    .line 1273
    .line 1274
    add-int/2addr v4, v5

    .line 1275
    add-int/lit8 v4, v4, 0x5

    .line 1276
    .line 1277
    add-int/2addr v4, v6

    .line 1278
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1279
    .line 1280
    const/16 v22, 0x1

    .line 1281
    .line 1282
    add-int/lit8 v4, v4, 0x1

    .line 1283
    .line 1284
    add-int/2addr v4, v7

    .line 1285
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1286
    .line 1287
    .line 1288
    const-string v4, "Multiple entries with same key: "

    .line 1289
    .line 1290
    const-string v6, "="

    .line 1291
    .line 1292
    invoke-static {v5, v4, v3, v6, v2}, Lf21;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1293
    .line 1294
    .line 1295
    const-string v2, " and "

    .line 1296
    .line 1297
    invoke-static {v5, v2, v0, v6, v1}, Lpb4;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    return-object v18

    .line 1305
    :cond_36
    move/from16 v16, v4

    .line 1306
    .line 1307
    move-object/from16 v18, v5

    .line 1308
    .line 1309
    :goto_1f
    new-array v0, v3, [C

    .line 1310
    .line 1311
    move-object/from16 v1, p0

    .line 1312
    .line 1313
    :goto_20
    if-eqz v1, :cond_37

    .line 1314
    .line 1315
    add-int/lit8 v3, v3, -0xe

    .line 1316
    .line 1317
    move/from16 v1, v16

    .line 1318
    .line 1319
    const/4 v11, 0x0

    .line 1320
    invoke-virtual {v6, v11, v1, v0, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 1321
    .line 1322
    .line 1323
    move-object/from16 v1, v18

    .line 1324
    .line 1325
    goto :goto_20

    .line 1326
    :cond_37
    new-instance v1, Ljava/lang/String;

    .line 1327
    .line 1328
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 1329
    .line 1330
    .line 1331
    return-object v1
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method
