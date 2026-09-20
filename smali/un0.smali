.class public final Lun0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final w:I

.field public final x:I

.field public y:Ljava/lang/String;

.field public final synthetic z:Lwn0;


# direct methods
.method public constructor <init>(Lwn0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lun0;->z:Lwn0;

    .line 5
    .line 6
    iput p2, p0, Lun0;->w:I

    .line 7
    .line 8
    iput p3, p0, Lun0;->x:I

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
.method public final charAt(I)C
    .locals 2

    .line 1
    iget v0, p0, Lun0;->w:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    if-ltz p1, :cond_1

    .line 5
    .line 6
    iget v1, p0, Lun0;->x:I

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lun0;->z:Lwn0;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lwn0;->c(I)C

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-string v0, "index ("

    .line 18
    .line 19
    const-string v1, ") should be less than length ("

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, Lpb4;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0}, Lun0;->length()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/16 p0, 0x29

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    const-string p0, "index is negative: "

    .line 52
    .line 53
    invoke-static {p1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return p0
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Lun0;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    :goto_0
    return v1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lun0;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move v2, v1

    .line 25
    :goto_1
    if-ge v2, v0, :cond_3

    .line 26
    .line 27
    iget v3, p0, Lun0;->w:I

    .line 28
    .line 29
    add-int/2addr v3, v2

    .line 30
    iget-object v4, p0, Lun0;->z:Lwn0;

    .line 31
    .line 32
    invoke-virtual {v4, v3}, Lwn0;->c(I)C

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 p0, 0x1

    .line 47
    return p0
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
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lun0;->y:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget v0, p0, Lun0;->w:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget v2, p0, Lun0;->x:I

    .line 14
    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    iget-object v2, p0, Lun0;->z:Lwn0;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lwn0;->c(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v1, v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v1
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
.end method

.method public final length()I
    .locals 1

    .line 1
    iget v0, p0, Lun0;->x:I

    .line 2
    .line 3
    iget p0, p0, Lun0;->w:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
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

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_3

    .line 3
    .line 4
    if-gt p1, p2, :cond_2

    .line 5
    .line 6
    iget v1, p0, Lun0;->x:I

    .line 7
    .line 8
    iget v2, p0, Lun0;->w:I

    .line 9
    .line 10
    sub-int/2addr v1, v2

    .line 11
    if-gt p2, v1, :cond_1

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lun0;

    .line 19
    .line 20
    add-int/2addr p1, v2

    .line 21
    add-int/2addr v2, p2

    .line 22
    iget-object p0, p0, Lun0;->z:Lwn0;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, v2}, Lun0;-><init>(Lwn0;II)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    const-string p1, "end should be less than length ("

    .line 29
    .line 30
    invoke-virtual {p0}, Lun0;->length()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/16 p2, 0x29

    .line 35
    .line 36
    invoke-static {p0, p2, p1}, Lta1;->k(IILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    const-string p0, "start ("

    .line 41
    .line 42
    const-string v1, ") should be less or equal to end ("

    .line 43
    .line 44
    invoke-static {p1, p2, v1, p0}, Lh;->h(IILjava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    const-string p0, "start is negative: "

    .line 49
    .line 50
    invoke-static {p1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lun0;->y:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lun0;->w:I

    .line 6
    .line 7
    iget v1, p0, Lun0;->x:I

    .line 8
    .line 9
    iget-object v2, p0, Lun0;->z:Lwn0;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, Lwn0;->b(II)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lun0;->y:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    return-object v0
.end method
