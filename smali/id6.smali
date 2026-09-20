.class public final Lid6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ldc6;

.field public b:Z

.field public c:Z

.field public final d:Landroid/graphics/Paint;

.field public final e:Landroid/graphics/Paint;

.field public f:Lsp4;

.field public g:Lsp4;

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lid6;->d:Landroid/graphics/Paint;

    const/16 v1, 0xc1

    .line 84
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    const/4 v2, 0x0

    .line 85
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    .line 86
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 88
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lid6;->e:Landroid/graphics/Paint;

    .line 89
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 90
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    .line 91
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 92
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 93
    invoke-static {}, Ldc6;->a()Ldc6;

    move-result-object v0

    iput-object v0, p0, Lid6;->a:Ldc6;

    return-void
.end method

.method public constructor <init>(Lid6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lid6;->b:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lid6;->b:Z

    .line 7
    .line 8
    iget-boolean v0, p1, Lid6;->c:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lid6;->c:Z

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Paint;

    .line 13
    .line 14
    iget-object v1, p1, Lid6;->d:Landroid/graphics/Paint;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lid6;->d:Landroid/graphics/Paint;

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Paint;

    .line 22
    .line 23
    iget-object v1, p1, Lid6;->e:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lid6;->e:Landroid/graphics/Paint;

    .line 29
    .line 30
    iget-object v0, p1, Lid6;->f:Lsp4;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v1, Lsp4;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lsp4;-><init>(Lsp4;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lid6;->f:Lsp4;

    .line 40
    .line 41
    :cond_0
    iget-object v0, p1, Lid6;->g:Lsp4;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    new-instance v1, Lsp4;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Lsp4;-><init>(Lsp4;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lid6;->g:Lsp4;

    .line 51
    .line 52
    :cond_1
    iget-boolean v0, p1, Lid6;->h:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Lid6;->h:Z

    .line 55
    .line 56
    :try_start_0
    iget-object p1, p1, Lid6;->a:Ldc6;

    .line 57
    .line 58
    invoke-virtual {p1}, Ldc6;->clone()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ldc6;

    .line 63
    .line 64
    iput-object p1, p0, Lid6;->a:Ldc6;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    move-exception p1

    .line 68
    const-string v0, "SVGAndroidRenderer"

    .line 69
    .line 70
    const-string v1, "Unexpected clone error"

    .line 71
    .line 72
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ldc6;->a()Ldc6;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lid6;->a:Ldc6;

    .line 80
    .line 81
    return-void
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
.end method
